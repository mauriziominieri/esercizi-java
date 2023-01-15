package esercizio1;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class Exchange {
    private Map<String, Double> prices;
    private Map<String, Map<Double, Runnable>> lowAlerts;
    private Map<String, Map<Double, Runnable>> highAlerts;

    public Exchange() {
        this.prices = new HashMap<>();
        this.lowAlerts = new HashMap<>();
        this.highAlerts = new HashMap<>();
    }

    public synchronized void setPrice(String stock, double price) {
        prices.put(stock, price);
        checkLowAlerts(stock, price);
        checkHighAlerts(stock, price);
    }

    public synchronized void addLowAlert(String stock, double threshold, Runnable runnable) {
        lowAlerts.computeIfAbsent(stock, k -> new HashMap<>()).put(threshold, runnable);
        Double price = prices.get(stock);
        if (price != null && price <= threshold)
            runnable.run();
    }

    public synchronized void addHighAlert(String stock, double threshold, Runnable runnable) {
        highAlerts.computeIfAbsent(stock, k -> new HashMap<>()).put(threshold, runnable);
        Double price = prices.get(stock);
        if (price != null && price >= threshold)
            runnable.run();
    }

    private void checkLowAlerts(String stock, double price) {
        Map<Double, Runnable> stockLowAlerts = lowAlerts.get(stock);
        if (stockLowAlerts != null)
            for (Map.Entry<Double, Runnable> entry : stockLowAlerts.entrySet())
                if (price <= entry.getKey())
                    entry.getValue().run();
    }

    private void checkHighAlerts(String stock, double price) {
        Map<Double, Runnable> stockHighAlerts = highAlerts.get(stock);
        if (stockHighAlerts != null)
            for (Map.Entry<Double, Runnable> entry : stockHighAlerts.entrySet())
                if (price >= entry.getKey())
                    entry.getValue().run();
    }
}
