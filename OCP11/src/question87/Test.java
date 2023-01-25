package question87;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
What is the result?
    The compilation fails at line 13
 */
public class Test {
/*9*/private final int x = 1;
//    static final int y;   // IntelliJ mi da l'errore qui perché evidenzia gli errori in modo differente (alla fonte)
    public Test() {
        System.out.print(x);
///*13*/  System.out.print(y); // The compilation fails here
    }

    public static void main(String[] args) {
/*16*/  new Test();
    }
}