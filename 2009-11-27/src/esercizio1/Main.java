package esercizio1;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
(CountByType, 2009-11-27)
Implementare il metodo statico countByType che, data una lista di oggetti, stampa a video il
numero di oggetti contenuti nella lista, divisi in base al loro tipo effettivo.
Attenzione: il metodo deve funzionare con qualunque tipo di lista e di oggetti contenuti.
Esempio d’uso:
    List<Number> l = new LinkedList<Number>();
    l.add(new Integer(3));
    l.add(new Double(4.0))
    l.add(new Float(7.0f));
    l.add(new Integer(11));
    countByType(l);
Output dell’esempio d’uso:
    java.lang.Double : 1
    java.lang.Float : 1
    java.lang.Integer : 2
 */

public class Main {

    private static final Map<String, Integer> map = new TreeMap<>();    // per avere un ordine lessicografico sulle keys

    public static <T> void countByType(List<T> list) {
        for(T t : list) {
            String cls = t.getClass().toString().substring(6);  // prendo tutto dopo "class "
//            if(map.get(cls) == null)
//                map.put(cls, 1);
//            else
//                map.put(cls, map.get(cls) + 1);
            map.merge(cls, 1, Integer::sum);    // versione smart
        }
        for(String string : map.keySet())
            System.out.println(string + " : " + map.get(string));
    }

    public static void main(String[] args) {
        List<Number> l = new LinkedList<Number>();
        l.add(new Integer(3));
        l.add(new Double(4.0));
        l.add(new Float(7.0f));
        l.add(new Integer(11));
        countByType(l);
    }
}
