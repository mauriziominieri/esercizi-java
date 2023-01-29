package question146;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*  TODO: da rivedere
Which two code fragments remove the elements from the original list?
    1. Queue clq = new ConcurrentLinkedQueue<>(original);
        for(Integer w : clq)
            clq.remove(w);
    2. List cwa = new CopyOnWriteArrayList<>(original);
        for(Integer w : cwa)
            cwa.remove(w);
 */
/*
1. The code creates a new Queue called "clq" using the ConcurrentLinkedQueue class and initializes it with the elements from the original list.
Then it uses a for-each loop to iterate over the elements of "clq" and calls the remove method on each element, but the ConcurrentLinkedQueue.remove() method works in a different way than the one of ArrayList.remove()
The ConcurrentLinkedQueue.remove method removes the first occurrence of the specified element from this queue, if it is present. Therefore, it will remove only the first element of the queue, but not all elements.
The original list and the clq are backed by the same array, so the remove method on the clq will also remove the element from the original list.
2.
 */
public class Main {
    public static void main(String[] args) {
        List original = new ArrayList<>(Arrays.asList(1,2,3,4,5));

//        Queue clq = new ConcurrentLinkedQueue<>(original);
//        for(Integer w : clq)
//            clq.remove(w);
//
//        List a1 = new ArrayList<>(original);
//        for(Integer w : a1)
//            a1.remove(w);
//
//        List s1 = Collections.synchronizedList(original);
//        for(Integer w : s1)
//            s1.remove(w);
//
//        List cwa = new CopyOnWriteArrayList<>(original);
//        for(Integer w : cwa)
//            cwa.remove(w);

        System.out.println(original);
    }
}