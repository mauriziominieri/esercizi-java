package question185;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
Which is true?
    The compilation fails due to an error in line 6
 */
interface Pastry {
/*2*/void getIngredients();
}
/*4*/abstract class Cookie implements Pastry {}
/*6*/class ChocolateCookie extends Cookie { //implements Cookie {
/*7*/public void getIngredients() {}
}
/*9*/public class CoconutChocolateCookie extends ChocolateCookie {
/*10*/void getIngredients(int x) {}
}