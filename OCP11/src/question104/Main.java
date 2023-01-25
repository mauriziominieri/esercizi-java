package question104;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
What is the result?
    false
    true
    false
 */
/*
String s1 = "Java"
String s2 = "Java"
String s3 = new String("Java")
String s4 = s3.intern()
s1 s2 e s4 si riferiscono allo stesso oggetto, cioè la stringa "Java" nello String Pool, s3 invece è un oggetto diverso nel Java Heap
 */
public class Main {
    public static void main(String[] args) {
        String s1 = new String("Java"); // Java Heap
        String s2 = s1.intern(); // si riferisce alla "Java" nel String Pool
        StringBuilder sb1 = new StringBuilder("Java");
        String s3 = sb1.toString();
        System.out.println(s1 == s2); // sarebbe true se s1 = "Java", perchè s1 e s2 si riferirebbero alla stringa "Java" nello String Pool, quando faccio new String() invece è un vero e proprio oggetto nel Java Heap.
        System.out.println(s1.equals(sb1.toString())); // confronta il contenuto, se non ci fosse il toString() sarebbe false
        System.out.println(s2 == s3);
    }
}