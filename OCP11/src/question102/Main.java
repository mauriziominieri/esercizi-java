package question102;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
What should be inserted at line n1 so that the code fragment prints Name is required?
    name.isBlank()
 */
/*
isBlank() controlla se la stringa è composta da tutti spazi
isEmpty() controlla se la stringa.length() è 0, quindi se è ""
trim() toglie tutti gli spazi
*/
public class Main {
    public static void main(String[] args) {
        String name = " ";
        if( name.isBlank() /* insert code here */ ) { // line n1
            System.out.println(" Name is required");
        }
    }
}