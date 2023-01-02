package esercizio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class Configuration {

    private final List<Component> componentList;

    public Configuration() {
        componentList = new ArrayList<>();
    }

    public boolean add(Component component) {
        for (Component c : componentList)
            if(c.type.equals(component.type) || Component.componentMap.get(c).contains(component))
                return false;
        componentList.add(component);
        return true;
    }
}
