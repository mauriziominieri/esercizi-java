package question57;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
Which statement on line 1 enables this code to compile?
    Predicate<String> function = s -> s.contains("N");
 */
public class Main {
    public static void main(String[] args) {
        List states = new ArrayList(List.of("NY","CA","WA","NC","CO"));
        Predicate<String> function = s -> s.contains("N"); // line 1
        states.removeIf(function);  // vuole un oggetto Predicate
        System.out.println(states);
    }
}