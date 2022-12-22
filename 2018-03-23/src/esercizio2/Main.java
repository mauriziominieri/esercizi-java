package esercizio2;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
Dato il seguente programma (tutte le classi appartengono allo stesso pacchetto):
class A {
public String f (Object x, A y, B z) { return "A1"; }
private String f(A x, B y, A z) { return "A2"; }
}
class B extends A {
public String f(Object x, A y, B z) { return "B1␣+␣" + f(null, z, new B()); }
private String f(B x, B y, B z) { return "B2"; }
}
public class Test {
public static void main(String[] args) {
B beta = new B();
A alfa = (A) beta;
System.out.println( alfa . f ( alfa , beta, beta));
System.out.println( alfa . f (beta, alfa , null));
System.out.println(beta. f (beta, beta, beta));
System.out.println( alfa instanceof B);
}
}
• Per ogni chiamata ad un metodo (escluso println) indicare la lista delle firme candidate.
• Indicare l’output del programma. Se un’istruzione provoca un errore di compilazione,
specificarlo e poi continuare l’esercizio ignorando quell’istruzione.
 */

public class Main {
    public static void main(String[] args) {

    }
}
