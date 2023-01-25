package question122;

import java.util.ArrayList;
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
    A java.util.ConcurrentModificationException is thrown.
 */
public class Main {
    public static void main(String... args) {
        var list = new ArrayList(List.of("Coffee", "Cappuccino", "Latte"));
        list.forEach((item) -> {
            list.remove(item);
        });
        System.out.println(list);
    }
}