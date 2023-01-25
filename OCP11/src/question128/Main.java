package question128;

import java.util.*;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
Which three initialization statements are valid?
    1. var loc = List.of("UK", "US");
    2. var loc = Map.of("UK", 1, "US", 2);
    3. var loc = Set.of("UK", "US");
 */
public class Main {
    public static void main(String[] args) {
        var loc1 = List.of("UK", "US");
//        var loc2 = Arrays.of("UK", "US", "ES");
//        var loc3 = ArrayList.of("UK", "US");
//        var loc4 = Set.of("UK", "US", "UK");  // java.lang.IllegalArgumentException: duplicate element: UK
//        var loc5 = List.of("UK", null, "US");   // java.lang.NullPointerException
        var loc6 = Map.of("UK", 1, "US", 2);
        var loc7 = Set.of("UK", "US");
    }
}