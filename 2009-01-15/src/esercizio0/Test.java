package esercizio0;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
(2009-1-15)
Dato il seguente programma (tutte le classi appartengono allo stesso pacchetto):
abstract class A {
    public abstract String f(A a, B b);
    public int f(B b, C c) { return 1; }
}
class B extends A {
    public String f(A a, B b) { return "2"; }
    public String f(C c, B b) { return "3"; }
    public int f(C c, Object x) { return 4; }
}
class C extends B {
    public String f(C c1, C c2) { return "5"; }
    public String f(A a, B b) { return "6"; }
}
public class Test {
    public static void main(String[] args) {
        C gamma = new C();
        B beta = gamma;
        A alfa = gamma;
        System.out.println(alfa.f(alfa, null));
        System.out.println(alfa.f(null, gamma));
        System.out.println(beta.f(gamma, alfa));
        System.out.println(gamma.f(beta, beta));
        System.out.println(1 + "1");
    }
}
• Indicare l’output del programma. (15 punti)
• Per ogni chiamata ad un metodo (escluso System.out.println) indicare la lista delle firme
candidate. (12 punti)
 */

abstract class A {
    public abstract String f(A a, B b);
    public int f(B b, C c) { return 1; }
}
class B extends A {
    public String f(A a, B b) { return "2"; }
    public String f(C c, B b) { return "3"; }
    public int f(C c, Object x) { return 4; }
}
class C extends B {
    public String f(C c1, C c2) { return "5"; }
    public String f(A a, B b) { return "6"; }
}
public class Test {
    public static void main(String[] args) {
        C gamma = new C();
        B beta = gamma;
        A alfa = gamma;
        System.out.println(alfa.f(alfa, null));     // astratto.        +specifico: astratto.   output: 6
        System.out.println(alfa.f(null, gamma));    // astratto, 1.     +specifico: 1.          output: 1
        System.out.println(beta.f(gamma, alfa));       // 4.               +specifico: 4.          output: 4
        System.out.println(gamma.f(beta, beta));       // astratto, 2, 6.  +specifico: 6.          output: 6
        System.out.println(1 + "1");
    }
}
