package esercizio1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class Component {

    Type type;  // package-private per comodità

    private String description;

    static Map<Component, Set<Component>> componentMap = new HashMap<>();   // package-private per comodità

    public Component(Type type, String description) {
        this.type = type;
        this.description = description;
    }

    public void setIncompatible(Component component) {
        Set<Component> componentSet = componentMap.get(this) == null ? new HashSet<>() : componentMap.get(this);
        componentSet.add(component);
        componentMap.put(this, componentSet);
    }
}
