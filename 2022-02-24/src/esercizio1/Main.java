package esercizio1;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
(FilteredSet, 2022-2-24)
Si ricordi l’interfaccia standard Predicate:
public interface Predicate<T> {
    boolean test(T t);
}
Realizzare la classe FilteredSet che rappresenta un set che può contenere solo oggetti sui quali
un dato predicato restituisce true. Il costruttore di FilteredSet accetta il predicato che farà da
filtro. La classe deve offrire i metodi add, contains e remove tipici dell’interfaccia Collection,
assicurandosi che add fallisca se l’oggetto che si tenta di inserire non soddisfa il predicato.
Infine, il metodo intersect accetta un altro FilteredSet “other” e restituisce un nuovo FilteredSet
che contiene gli elementi comuni a this e other. Il filtro del nuovo FilteredSet deve essere l’and
logico dei due filtri di this e other. Ovvero, il nuovo FilteredSet deve accettare solo oggetti che
verrebbero accettati sia da this che da other.
L’implementazione deve rispettare il seguente esempio d’uso.
Esempio d’uso:
    FilteredSet<String> s1 = new FilteredSet<>(x −> x.length() > 2);
    FilteredSet<String> s2 = new FilteredSet<>(x −> x.indexOf("a") != −1);
    System.out.println(s1.add("ciao"));
    System.out.println(s1.add("aa"));
    System.out.println(s2.add("ciao"));
    FilteredSet<String> s3 = s1.intersect(s2);
    System.out.println(s3.add("pippo"));
Output:
    true
    false
    true
    false
 */

public class Main {
    public static void main(String[] args) {
        FilteredSet<String> s1 = new FilteredSet<>(x -> x.length() > 2);
        FilteredSet<String> s2 = new FilteredSet<>(x -> x.indexOf("a") != -1); // contiene 'a'
        System.out.println(s1.add("ciao"));
        System.out.println(s1.add("aa"));
        System.out.println(s2.add("ciao"));
        FilteredSet<String> s3 = s1.intersect(s2);
        System.out.println(s3.add("pippo"));
    }
}
