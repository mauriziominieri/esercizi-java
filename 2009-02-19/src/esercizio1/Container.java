package esercizio1;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class Container {

    private double litri;

    private final Set<Container> containerSet;

    public Container() {
        containerSet = new HashSet<>();
    }

    public void addWater(double litri) {
        this.litri += litri;
    }

    public double getAmount() {
        return litri;
    }

    public void connect(Container container) {
        for(Container c : containerSet) {
            c.containerSet.add(container);
            container.containerSet.add(c);
        }
        this.containerSet.add(container);
        container.containerSet.add(this);
        double totalWater = this.litri;
        for(Container c : containerSet)
            totalWater += c.litri;
        double amount = totalWater / (containerSet.size() + 1);
        this.litri = amount;
        for(Container c : containerSet)
            c.litri = amount;
    }
}
