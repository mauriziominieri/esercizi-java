package question86;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
Which two interfaces can be used in lambda expressions?
    MyInterface2
    MyInterface4
 */
/*
Un'interfaccia può essere utilizzata in un'espressione lambda se è un'interfaccia funzionale, cioè se essa ha esattamente un metodo astratto.
Un'interfaccia funzionale può anche avere metodi default, metodi privati e metodi statici, ma solo il metodo astratto può essere implementato in un'espressione lambda. In caso contrario si avrà un errore di compilazione.
Inoltre, il metodo astratto non deve lanciare eccezioni.
 */
interface MyInterface1 {
    public int method() throws Exception;
    private void pMethod() { /* an implementation of pMethod */ }
}
interface MyInterface2 {
    public static void sMethod() { /* an implementation of sMethod */ }
    public boolean equals();
}
interface MyInterface3 {
    public void method();
    public void method(String str);
}
interface MyInterface4 {
    public default void dMethod() { /* an implementation of dMethod */ } // TODO: errore, ho dovuto aggiungere default, un metodo public non statico e non default non può avere un corpo!
    public void method();
}
interface MyInterface5 {
    public static void sMethod() {} // TODO: errore, ho dovuto aggiungere un corpo, un metodo static è concreto e quindi deve avere un corpo
    public void method(String str);
}
public class Main {
    public static void main(String[] args) {
        MyInterface2 m1 = () -> { System.out.print("Entrato in equals di M2 tramite lambda: "); return false; };
        System.out.println(m1.equals());
        MyInterface4 m2 = () -> { System.out.println("Entrato in method() di M4 tramite lambda"); };
        m2.method();
    }
}