package question126;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
What is the result?
    hat at store 1
 */
// indexOf restituisce l' indice del primo carattere della stringa cercata, se in s cerco "at " ho 1 perché prendo la porzione dopo la 'h' fino lo spazio e quindi mi restituisce l'indice della 'a'
// se invece in s cerco "at s" allora ho 4 perché prendo la porzione successiva dalla a alla s e quindi l'indice della 'a' è 4.
public class Tester {
    public static void main(String[] args) {
        String s = "hat at store";
        int x = s.indexOf("at");
        s.substring(x + 3); // non modifica s
        x = s.indexOf("at");
        System.out.println(s + " " + x);
    }
}