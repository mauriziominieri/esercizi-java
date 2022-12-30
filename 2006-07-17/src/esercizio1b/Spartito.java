package esercizio1b;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class Spartito implements Iterable<Set<Nota>> {

    public Set<Nota> notaSet;

    public Spartito() {
        // dato che voglio un set ordinato (in base al nome della nota) uso un TreeSet
        // può essere usato solo su oggetti ordinabili secondo una certa logica, questa la specifichiamo con il metodo compareTo di Comparable
        notaSet = new TreeSet<>();
    }

    public void add(Nota nota, int t) {
        notaSet.add(nota);
        nota.tempo = t;
    }

    @Override
    public Iterator<Set<Nota>> iterator() {
        return new Iterator<>() {   // classe anonima

            int index = -1;

            @Override
            public boolean hasNext() {
               if(index < notaSet.size() - 1) {
                   index++;
                   return true;
               }
               else
                   return false;
            }

            @Override
            public Set<Nota> next() {
                Set<Nota> responseSet = new TreeSet<>();
                for(Nota nota : notaSet) {
                    if(index >= nota.tempo && index < (nota.tempo + nota.durata))
                        responseSet.add(nota);
                }
                return responseSet;
            }
        };
    }
}
