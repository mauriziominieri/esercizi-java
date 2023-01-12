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

public class POSet<T> {

    private POString max;

    private final Map<String, Boolean> map;

    public POSet() {
        map = new HashMap<>();
    }

    public void add(POString poString) {
        map.put(poString.name, true);
        if(max == null || poString.compareTo(max) == PartComparison.GREATER)
            max = poString;
    }

    public boolean isMaximal(POString poString) {
        if(poString.name.equals(max.name))
            return true;
        if(map.get(poString.name))
            return false;
        else
            throw new RuntimeException(poString.name + " non appartiene all'insieme");
    }
}
