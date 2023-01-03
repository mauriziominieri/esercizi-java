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

public class Controller {

    private final Map<Function, Set<Function>> functionMap;

    public Controller() {
        functionMap = new HashMap<>();
    }

    public Function addFunction(String name) {
        return new Function(name);
    }

    public void printOn() {
        for(Function function : functionMap.keySet())
            if(function.on)
                System.out.println(function);
    }

    class Function {

        private final String name;

        private boolean on;

        public Function(String name) {
            this.name = name;
        }

        public void turnOn() {
            this.on = true;
            for(Function function : functionMap.get(this))
                function.on = false;
        }

        public void turnOff() {
            this.on = false;
        }

        public void setIncompatible(Function function) {
            Set<Function> functionSet = functionMap.get(this) == null ? new HashSet<>() : functionMap.get(this);
            Set<Function> functionSet2 = functionMap.get(function) == null ? new HashSet<>() : functionMap.get(function);
            functionSet.add(function);
            functionSet2.add(this);
            functionMap.put(this, functionSet);
            functionMap.put(function, functionSet2);
        }

        @Override
        public String toString() {
            return name;
        }
    }
}
