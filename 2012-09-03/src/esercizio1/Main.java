package esercizio1;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
Implementare la classe MyString, che rappresenta una stringa con la seguente caretteristica: due
oggetti MyString sono considerati uguali (da equals) se sono uno l’anagramma dell’altro. Inoltre,
la classe MyString deve essere clonabile e deve offrire un’implementazione di hashCode coerente
con equals e non banale (che non restituisca lo stesso codice hash per tutti gli oggetti).
Suggerimento: Nella classe String è presente il metodo public char charAt(int i), che restituisce l’i-esimo carattere della stringa, per i compreso tra 0 e length()-1.
Esempio d’uso:
    MyString a = new MyString("uno␣due␣tre");
    MyString b = new MyString("uno␣tre␣deu");
    MyString c = new MyString("ert␣unodue");
    MyString d = c.clone();
    System.out.println(a.equals(b));
    System.out.println(b.equals(c));
    System.out.println(a.hashCode()==b.hashCode());
Output dell’esempio d’uso:
    true
    false
    true
 */

public class Main {
    public static void main(String[] args) {
        MyString a = new MyString("uno due tre");
        MyString b = new MyString("uno tre deu");
        MyString c = new MyString("ert unodue");
        MyString d = c.clone();
        System.out.println(a.equals(b));
        System.out.println(b.equals(c));
        System.out.println(a.hashCode()==b.hashCode());
    }
}
