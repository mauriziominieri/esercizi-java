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

/*  TODO: da rivedere 49 marcello
Which two code fragments remove the elements from the original list?
    1. List a1 = new ArrayList<>(original);
        for(Integer w : a1)
            a1.remove(w);
    2. List cwa = new CopyOnWriteArrayList<>(original);
        for(Integer w : cwa)
            cwa.remove(w);
 */
/*
The first code fragment uses a basic ArrayList and the for-each loop to remove the elements from the original list. As the elements are removed, the loop continues to iterate, which means that all elements of the original list are removed.
The second code fragment uses a CopyOnWriteArrayList, which is a thread-safe version of an ArrayList. Like the ArrayList, the for-each loop is used to remove the elements from the original list. However, since the CopyOnWriteArrayList is thread-safe, the elements are removed safely, even if other threads are accessing the list at the same time.
The other two code fragments use the ConcurrentLinkedQueue and Collections.synchronizedList, which do not remove elements from the original list. Instead, they create new instances of the Queue and List, respectively, and perform the removal operations on the new instances.
 */
public class Main {
    public static void main(String[] args) {
        List original = new ArrayList<>(Arrays.asList(1,2,3,4,5));

//        Queue<Integer> clq = new ConcurrentLinkedQueue<>(original);
//        for(Integer w : clq)
//            clq.remove(w);

        List<Integer> a1 = new ArrayList<>(original);
        for(Integer w : a1)
            a1.remove(w);
//
//        List<Integer> s1 = Collections.synchronizedList(original);
//        for(Integer w : s1)
//            s1.remove(w);
//
//        List<Integer> cwa = new CopyOnWriteArrayList<>(original);
//        for(Integer w : cwa)
//            cwa.remove(w);

        System.out.println(original);
    }
}