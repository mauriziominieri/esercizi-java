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

public class Cellphone {

    private final String gestore;

    private final String numero;

    private static Map<String, Map<String, Double>> costMap;

    public Cellphone(String gestore, String numero) {
        this.gestore = gestore;
        this.numero = numero;
        costMap = new HashMap<>();
    }

    public static void setCost(String gestore1, String gestore2, double costo) {
        Map<String, Double> gestoreMap = costMap.get(gestore1) == null ? new HashMap<>() :  costMap.get(gestore1);
        gestoreMap.put(gestore2, costo);
        costMap.put(gestore1, gestoreMap);
    }

    public double getCost(Cellphone cellphone, int minuti) {
        if(costMap.get(this.gestore).get(cellphone.gestore) == null)
            throw new RuntimeException("Costo per " + this.gestore + " e " + cellphone.gestore + " non inserito");
        return costMap.get(this.gestore).get(cellphone.gestore) * minuti;
    }
}
