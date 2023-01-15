package esercizio0;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
(2009-7-9)
Dato il seguente programma (tutte le classi appartengono allo stesso pacchetto):
class A { public String f (double n, A x, A y) { return "A1"; }
    public String f (double n, B x, B y) { return "A2"; }
    public String f (int n, B x, B y) { return "A3"; }
}
class B extends A {
    public String f (int n, B x, B y) { return "B1 : " + x.f( 3.0, x, y); }
    public String f (float n, A x, Object y) { return "B2"; }
}
public class Test {
    public static void main(String[] args) {
        B beta = new B() ;
        A alfa = beta;
        System.out.println(alfa.f(3, alfa, beta)) ;
        System.out.println(alfa.f(4, beta, beta)) ;
        System.out.println(beta.f(3, alfa, (Object) alfa)) ;
        System.out.println(true && (alfa instanceof B));
    }
}
• Indicare l’output del programma. Se un’istruzione provoca un errore di compilazione,
specificarlo e poi continuare l’esercizio ignorando quell’istruzione. (15 punti)
• Per ogni chiamata ad un metodo (escluso System.out.println) indicare la lista delle firme
candidate. (12 punti)
 */

class A {
    public String f (double n, A x, A y) { return "A1"; }
    public String f (double n, B x, B y) { return "A2"; }
    public String f (int n, B x, B y) { return "A3"; }
}
class B extends A {
    public String f (int n, B x, B y) { return "B1 : " + x.f(3.0, x, y); }
    public String f (double n, A x, Object y) { return "B2"; }
}
public class Test {
    public static void main(String[] args) {
        B beta = new B() ;
        A alfa = beta;
        System.out.println(alfa.f(3, alfa, beta));  // A1.          +specifica: A1. output: A1
        System.out.println(alfa.f(4, beta, beta));  // A1, A2, A3.  +specifica: A3. output: B1 + (A1, A2. +specifica: A2) output: A2
        System.out.println(beta.f(3, alfa, (Object) alfa)); // B2.  +specifca: B2.  output: B2
        System.out.println(alfa.getClass() == A.class);
    }
}
