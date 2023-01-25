package question125;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
What is the output?
    I am an object
 */
// Object[] accetta solo array di classi, non tipi primitivi, inoltre gli array dichiarati con quel tipo primitivo accettano solo lo stesso tipo effettivo
public class Over {
    public void analyze(Object[] o) {
        System.out.println("I am an object array");
    }
    public void analyze(long[] l) {
        System.out.println("I am an array");
    }
    public void analyze(Object o) {
        System.out.println("I am an object");
    }
    public static void main(String[] args) {
        int[] nums = new int[10];
        new Over().analyze(nums);   // line 1
    }
}