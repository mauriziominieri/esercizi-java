package question153;

import java.util.function.BiFunction;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
It is required that if p instanceof Pair then p.isValid() returns true.
Which is the smallest set of visibility changes to ensure this requirement is met?
    isValid must be public.
 */
/*
1. isValid must be public.
2. left and right must be private.
3. left, right, setLeft, and setRight must be private.
4. setLeft and setRight must be protected.

The isValid method must be public so that it can be accessed from outside the Pair class to check the validity of the Pair object. Making the isValid method public ensures that the requirement that if p instanceof Pair then p.isValid() returns true is met.
The visibility of the fields left and right, setLeft and setRight methods do not need to be changed in this case as they are already protected by the set method, which applies the validity check before assigning values to the fields.
Option 3 is not necessary since the set method already applies the validity check.
Option 4 is not necessary because the setLeft and setRight methods only change the value of the left and right fields, which are already private, and protected is not needed.
In this way, the Pair class is making sure that the left and right values are only set if they are valid, and isValid() method returns true if left and right values are valid.
*/
public class Pair<T> {
    final BiFunction<T, T, Boolean> validator;
    T left = null;
    T right = null;
    private Pair() {
        validator=null;
    }
    Pair(BiFunction v, T x, T y) {
        validator = v;
        set(x, y);
    }
    void set(T x, T y) {
        if (!validator.apply(x, y)) throw new IllegalArgumentException();
        setLeft(x);
        setRight(y);
    }
    void setLeft(T x) {
        left = x;
    }
    void setRight(T y) {
        right = y;
    }
    final boolean isValid() {
        return validator.apply(left, right);
    }
}