package esercizio1b;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio MinieriO
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class UMLClass {

    final String name;

    Map<String, Integer> relatedClassMinMap;  // per le cardinalità minime

    Map<String, Integer> relatedClassMaxMap;  // per le cardinalità massime

    public UMLClass(String name) {
        this.name = name;
        relatedClassMinMap = new LinkedHashMap<>(); // per rispettare l'ordine di inserimento
        relatedClassMaxMap = new LinkedHashMap<>();
    }

    @Override
    public String toString() {
        String response = "Classe: " + name + "\nAggregazioni:\n";
        for(Map.Entry<String, Integer> entry : relatedClassMinMap.entrySet()) {
            response += name + "-";
            response += entry.getKey() + ",\n\tcardinalità: " + entry.getValue() + ".."
                    + (relatedClassMaxMap.get(entry.getKey()) == -1 ? "infinito" : relatedClassMaxMap.get(entry.getKey())) + "\n";
        }
        return response;
    }
}
