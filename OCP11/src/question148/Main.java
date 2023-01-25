package question148;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
What is the result?
    [A, B, C]
    [A, B, C]
 */
public class Main {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");
        List<String> list2 = Collections.unmodifiableList(list1);
        list1.add("C"); // se fosse list2.add("C") avrei java.lang.UnsupportedOperationException
        System.out.println(list1);
        System.out.println(list2);
    }
}