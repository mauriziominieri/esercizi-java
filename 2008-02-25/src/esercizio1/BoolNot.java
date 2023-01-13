package esercizio1;

import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class BoolNot extends BoolExpr {

    public BoolNot(BoolVar boolVar) {
        this.value = !boolVar.value;
    }

    @Override
    public boolean eval(Map<BoolVar, Boolean> m) {
        return !m.get(this);
    }
}
