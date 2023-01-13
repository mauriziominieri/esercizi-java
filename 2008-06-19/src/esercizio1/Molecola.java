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

public class Molecola {

    private String formula;

    private final Map<Elemento, Integer> map;

    public Molecola() {
        map = new HashMap<>();
    }

    public void add(Elemento elemento, int atomi) {
        map.put(elemento, map.get(elemento) == null ? atomi : map.get(elemento) + atomi);
        StringBuilder response = new StringBuilder();
        for(Map.Entry<Elemento, Integer> entry : map.entrySet())
            response.append(entry.getKey()).append(entry.getValue() == 1 ? "" : entry.getValue()).append(" ");
        this.formula = response.toString();
    }

    @Override
    public String toString() {
        return formula;
    }
}
