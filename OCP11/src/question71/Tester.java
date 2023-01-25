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
public class Tester {
    public static void main(String[] args) {
        String s = "10";
        try {
            int x = 0;
            x = Integer.parseInt(s,2); // line 1
            System.out.println("X is "+x);
        } catch(NumberFormatException e) {
//            System.out.println("Error parsing value of "+x); // line 2
        }
    }
}