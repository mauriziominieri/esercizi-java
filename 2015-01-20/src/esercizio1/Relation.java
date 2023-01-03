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

public class Relation<S, T> {

    private Map<S, Set<T>> dominio;

    private Map<T, Set<S>> codominio;

    public Relation() {
        dominio = new HashMap<>();
        codominio = new HashMap<>();
    }

    public void put(S x, T y) {
        Set<T> dominioSet = dominio.get(x) == null ? new HashSet<>() :  dominio.get(x);
        Set<S> codominioSet = codominio.get(y) == null ? new HashSet<>() :  codominio.get(y);
        dominioSet.add(y);
        codominioSet.add(x);
        dominio.put(x, dominioSet);
        codominio.put(y, codominioSet);
    }

    public void remove(S x, T y) {
        if(dominio.get(x) != null)
            dominio.get(x).remove(y);
        if(codominio.get(y) != null)
            codominio.get(y).remove(x);
    }

    public Set<T> image(S x) {
        return dominio.get(x);
    }

    public Set<S> preImage(T x) {
        return codominio.get(x);
    }
}
