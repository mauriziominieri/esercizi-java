package question127;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
Which statement prints 2789?
    myList.stream().collect(Collectors.toCollection(TreeSet::new)).stream().forEach(x -> System.out.print(x));
 */
// l'ultima riga stampa i numeri della lista senza duplicati, dato che li voglio ordati allora è facile ricordare che ci serve il TreeSet (un set, quindi non contiene duplicati, e ordinato)
public class Main {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(9,8,9,2,7,2);
//        myList.stream().collect(Collectors.toCollection(SortedSet::new)).stream().forEach(x -> System.out.print(x)); // 'SortedSet' is abstract; cannot be instantiated
//        myList.stream().collect(Collectors.toCollection(HashSet::new)).sorted().forEach(x -> System.out.print(x)); // Cannot resolve method 'sorted' in 'HashSet'
        myList.stream().collect(Collectors.toCollection(TreeSet::new)).stream().forEach(x -> System.out.print(x));
//        myList.stream().distinct().forEach(x -> System.out.print(x));
    }
}