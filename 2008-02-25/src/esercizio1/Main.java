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

/*
(BoolExpr, 2008-2-25)
La classe (o interfaccia) BoolExpr rappresenta un’espressione dell’algebra booleana (ovvero un
circuito combinatorio). Il tipo più semplice di espressione è una semplice variabile, rappresentata
dalla classe BoolVar, sottotipo di BoolExpr. Espressioni più complesse si ottengono usando gli
operatori di tipo and, or e not, corrispondenti ad altrettante classi sottotipo di BoolExpr. Tutte
le espressioni hanno un metodo eval che, dato il valore assegnato alle variabili, restituisce il valore
dell’espressione. Si consideri attentamente il seguente caso d’uso.
Esempio d’uso:
    BoolVar x = new BoolVar("x");
    BoolVar y = new BoolVar("y");
    BoolExpr notx = new BoolNot(x);
    BoolExpr ximpliesy = new BoolOr(notx, y);
    Map<BoolVar,Boolean> m = new HashMap<BoolVar,Boolean>();
    m.put(x, true);
    m.put(y, true);
    System.out.println(x.eval(m));
    System.out.println(ximpliesy.eval(m));
    m.put(y, false);
    System.out.println(ximpliesy.eval(m));
Output dell’esempio d’uso:
    true
    true
    false
 */

public class Main {
    public static void main(String[] args) {
        BoolVar x = new BoolVar("x");
        BoolVar y = new BoolVar("y");
        BoolExpr notx = new BoolNot(x);
        BoolExpr ximpliesy = new BoolOr(notx, y);
        Map<BoolVar,Boolean> m = new HashMap<BoolVar,Boolean>();
        m.put(x, true);
        m.put(y, true);
        System.out.println(x.eval(m));
        System.out.println(ximpliesy.eval(m));
        m.put(y, false);
        System.out.println(ximpliesy.eval(m));
    }
}
