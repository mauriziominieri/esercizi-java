package esercizio1;

import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class BoolVar extends BoolExpr {

    private String name;

    public BoolVar(String name) {
        this.name = name;
    }

    @Override
    public boolean eval(Map<BoolVar, Boolean> m) {
        return m.get(this);
    }
}
