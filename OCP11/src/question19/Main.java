package question19;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
Which statement is equivalent to line 1?
    states.forEach((var s) -> System.out.println(s));
 */
// 'var s' va nelle tonde, il ';' non va nelle tonde, il return non deve esserci
public class Main {
    public static void main(String[] args) {
        List<String> states = List.of("NY","CA","WA","NC","CO");
        states.forEach(s -> System.out.println(s)); // line 1
        states.forEach((var s) -> System.out.println(s)); // 1
//        states.forEach(var s -> (System.out.println(s))); // 2
//        states.forEach((s) -> System.out.println(s);); // 3
//        states.forEach((String s) -> {return System.out.println(s);}); // 4
    }
}