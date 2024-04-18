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
public class Type {
    private String name;
    private Type superclass;
    private static Set<String> set = new HashSet<>();

    public Type(String name) {
        if (set.contains(name))
            throw new RuntimeException("Type with name " + name + " already exists.");
        this.name = name;
        set.add(name);
    }

    public Type(String name, Type type) {
        if (set.contains(name))
            throw new RuntimeException("Type with name " + name + " already exists.");
        this.name = name;
        this.superclass = type;
        set.add(name);
    }

    public boolean isSubtypeOf(Type type) {
        if (superclass == null)
            return false;
        else if (superclass == type)
            return true;
        else
            return superclass.isSubtypeOf(type);
    }

    @Override
    public String toString() {
        return "class " + name + " extends " + (superclass == null ? "Object" : superclass.name);
    }
}