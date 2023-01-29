package question177;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
What is the result?
    ab action
 */
interface AbilityA {
    default void action() {
        System.out.println("a action");
    }
}
interface AbilityB {
    void action();
}
public class Test implements AbilityA, AbilityB { // line 1
    public void action() {
        System.out.println("ab action");
    }
    public static void main(String[] args) {
        AbilityB x = new Test();                // line 2
        x.action();
    }
}