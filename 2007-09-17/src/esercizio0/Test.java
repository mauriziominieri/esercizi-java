package esercizio0;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
(2007-9-17)
Dato il seguente programma (tutte le classi appartengono allo stesso pacchetto):
class A {
    private int f(int a, double b , double c) { return 1; }
    public int f(int a, float b , double c) { return 10; }
    public int f(double a, double b, double c) { return 20; }
}
class B extends A {
    public int f (int a, float b , int c) { return 15; }
    public int f (int a, float b , double c) { return 25; }
}
public class Test {
    public static void main(String[] args) {
        B beta = new B();
        A alfa 1 = beta;
        A alfa 2 = new A();
        System . out . p r i n t l n ( a l f a 1 . f ( 1 , 2 , 3 ) ) ;
        System . out . p r i n t l n ( a l f a 2 . f ( 1 , 2 , 3 ) ) ;
        System . out . p r i n t l n ( be t a . f ( 1 , 2 , 3 ) ) ;
        System . out . p r i n t l n ( be t a . f ( 1 . 0 , 2 , 3 ) ) ;
        System . out . p r i n t l n ( 7 / 2 ) ;
    }
}
• Indicare l’output del programma.
• Per ogni chiamata ad un metodo (escluso System.out.println) indicare la lista delle firme candidate.
 */

class A {
    private int f(int a, double b , double c) { return 1; }
    public int f(int a, float b , double c) { return 10; }
    public int f(double a, double b, double c) { return 20; }
}
class B extends A {
    public int f (int a, float b , int c) { return 15; }
    public int f (int a, float b , double c) { return 25; }
}
public class Test {
    public static void main(String[] args) {
        B beta = new B();
        A alfa1 = beta;
        A alfa2 = new A();
        System.out.println(alfa1.f(1, 2, 3));   // 10, 20.          +specifica: 10. output: 25
        System.out.println(alfa2.f(1, 2, 3));   // 10, 20.          +specifica: 10. output: 10
        System.out.println(beta.f(1, 2, 3));    // 10, 20, 15, 25.  +specifica: 15. output: 15
        System.out.println(beta.f(1.0, 2, 3));  // 20.              +specifica: 20. output: 20
        System.out.println(7 / 2);
    }
}
