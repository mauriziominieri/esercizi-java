package esercizio1;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
(PartiallyComparable, 2010-6-28)
L’interfaccia PartComparable (per partially comparable) rappresenta un tipo i cui elementi sono
parzialmente ordinati.
public interface PartComparable<T> {
    public PartComparison compareTo(T x);
}
public enum PartComparison {
    SMALLER, EQUAL, GREATER, UNCOMP;
}
Implementare la classe POSet (per partially ordered set), che rappresenta un insieme parzialmente
ordinato, i cui elementi implementano l’interfaccia PartComparable. Un oggetto di questo insieme
è detto massimale se nessun altro oggetto nell’insieme è maggiore di lui.
Il metodo add aggiunge un oggetto all’insieme, mentre il metodo isMaximal restituisce vero se
l’oggetto passato come argomento è uno degli oggetti massimali dell’insieme, restituisce falso se
tale oggetto appartiene all’insieme, ma non è massimale, ed infine solleva un’eccezione se l’oggetto
non appartiene all’insieme. Il metodo isMaximal deve terminare in tempo costante.
    // Stringhe, ordinate parzialmente dalla relazione di prefisso
    class POString implements PartComparable<POString> { ... }
    POSet<POString> set = new POSet<POString>();
    set .add(new POString("architetto"));
    set .add(new POString("archimede"));
    set .add(new POString("archi"));
    set .add(new POString("bar"));
    set .add(new POString("bari"));
    System.out.println(set .isMaximal(new POString("archimede")));
    System.out.println(set .isMaximal(new POString("bar")));
    set .add(new POString("archimedeo"));
    System.out.println(set .isMaximal(new POString("archimede")));
Output dell’esempio d’uso:
    true
    false
    false
 */

public class Main {
    public static void main(String[] args) {
        POSet<POString> set = new POSet<POString>();
        set .add(new POString("architetto"));
        set .add(new POString("archimede"));
        set .add(new POString("archi"));
        set .add(new POString("bar"));
        set .add(new POString("bari"));
        System.out.println(set .isMaximal(new POString("archimede")));
        System.out.println(set .isMaximal(new POString("bar")));
        set .add(new POString("archimedeo"));
        System.out.println(set .isMaximal(new POString("archimede")));
    }
}
