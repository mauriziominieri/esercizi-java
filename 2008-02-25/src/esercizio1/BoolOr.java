package esercizio1;

import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class BoolOr extends BoolExpr {

    public BoolOr(BoolExpr boolExpr1, BoolExpr boolExpr2) {
        this.value = boolExpr1.value & boolExpr2.value;
    }

    @Override
    public boolean eval(Map<BoolVar, Boolean> m) {
        boolean b1 = (boolean) m.values().toArray()[0];
        boolean b2 = (boolean) m.values().toArray()[1];
        return b1 & b2;
    }
}
