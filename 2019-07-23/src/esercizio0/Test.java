package esercizio0;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
(2019-7-23)
Dato il seguente programma (tutte le classi appartengono allo stesso pacchetto):
class A {
    public String f(Object x, B y) { return "A1"; }
    private String f(B x, B y) { return "A2␣:␣" + f(x, y); }
    public String f(A x, Object y) { return "A3"; }
}
class B extends A {
    private String f(B x, B y) { return "B1␣:␣" + f(null, (A)y); }
    public String f(Object x, B y) { return "B2 : " + f(x, (A)y); }
    public String f(A x, B y) { return "B3 : " + f(y, y); }
}
public class Test {
    public static void main(String[] args) {
        B beta = new B();
        A alfa = beta;
        System.out.println( alfa . f (null, alfa ));
        System.out.println(beta. f (beta, beta));
        System.out.println(beta.getClass() == alfa.getClass());
    }
}
• Per ogni chiamata ad un metodo f, indicare la lista delle firme candidate.
• Indicare l’output del programma. Se un’istruzione provoca un errore di compilazione,
specificarlo e poi continuare l’esercizio ignorando quell’istruzione.
 */

class A {
    public String f(Object x, B y) { return "A1"; }
    private String f(B x, B y) { return "A2 : " + f(x, y); }
    public String f(A x, Object y) { return "A3"; }
}
class B extends A {
    private String f(B x, B y) { return "B1 : " + f(null, (A)y); }
//    public String f(Object x, B y) { return "B2 : " + f(x, (A)y); } // errore di compilazione, non esiste f(Object, A)
    public String f(A x, B y) { return "B3 : " + f(y, y); }
}
public class Test {
    public static void main(String[] args) {
        B beta = new B();
        A alfa = beta;
        System.out.println(alfa.f(null, alfa)); // A3.              +specifica: A3.     output: "A3"
        System.out.println(beta.f(beta, beta));    // A1, A3, B3.      +specifica: B3.     output: "B3 : " +
                                                   // A1, A3, B1, B3.  +specifica: B1.     output: "B1 : " +
                                                   // A3.              +specifica: A3.     output: "A3"
        System.out.println(beta.getClass() == alfa.getClass());
    }
}