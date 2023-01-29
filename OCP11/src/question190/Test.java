package question190;

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
Which is true?
    The program compiles fine.
 */
class A { }
class B extends A { }
class C extends B { }
public class Test {
    public static void main(String[] args) {
        List<? extends A> listA = new ArrayList<>();
        List<B> listB = new ArrayList<B>();
        List<? extends B> listC = new ArrayList<>();
        listA = listB;
        listC = listB;
    }
}