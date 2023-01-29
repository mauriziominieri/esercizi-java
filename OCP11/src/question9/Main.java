package question9;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
Which two var declarations are correct?
    1. var var = "hello";
    2. var names = new ArrayList<>();
 */
public class Main {
    public static void main(String[] args) {
//        var _ = 100;  // non può essere solo il char _
        var names = new ArrayList<>();
        var var = "hello";
//        var y = null;   // una var deve essere inizializzata con un valore
//        var a;            // una var deve essere inizializzata con un valore
    }
}