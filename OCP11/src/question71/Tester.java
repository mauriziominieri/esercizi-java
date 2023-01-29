package question71;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
What is the result?
    The compilation fails due to an error in line 2.
 */
// r = Integer.parseInt(x,b); b è la base, se b = 2 e x = 111 allora r = 7
public class Tester {
    public static void main(String[] args) {
        String s = "10";
        try {
            int x = 0;
            x = Integer.parseInt(s,2); // line 1 // in base 2 -> se s fosse = 111 allora x sarebbe = 7
            System.out.println("X is "+x);
        } catch(NumberFormatException e) {
//            System.out.println("Error parsing value of "+x); // line 2
        }
    }
}