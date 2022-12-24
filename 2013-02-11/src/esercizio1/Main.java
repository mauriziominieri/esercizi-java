package esercizio1;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
Un MultiSet è un insieme in cui ogni elemento può comparire più volte. Quindi, ammette
duplicati come una lista, ma, a differenza di una lista, l’ordine in cui gli elementi vengono inseriti
non è rilevante. Implementare una classe parametrica MultiSet, con i seguenti metodi:
• add, che aggiunge un elemento,
• remove, che rimuove un elemento (se presente), ed
• equals, che sovrascrive quello di Object e considera uguali due MultiSet se contengono gli
stessi elementi, ripetuti lo stesso numero di volte.
Infine, deve essere possibile iterare su tutti gli elementi di un MultiSet usando il ciclo for-each.
Esempio d’uso:
    MultiSet<Integer> s1 = new MultiSet<Integer>();
    MultiSet<Integer> s2 = new MultiSet<Integer>();
    s1.add(5); s1.add(7); s1.add(5);
    s2.add(5); s2.add(5); s2.add(7);
    for (Integer n: s1)
    System.out.println(n);
    System.out.println(s1.equals(s2));
Output (l’ordine dei numeri è irrilevante):
    7
    5
    5
    true
 */

public class Main {
    public static void main(String[] args) {
        MultiSet<Integer> s1 = new MultiSet<Integer>();
        MultiSet<Integer> s2 = new MultiSet<Integer>();
        s1.add(5); s1.add(7); s1.add(5);
        s2.add(5); s2.add(5); s2.add(7);
        for (Integer n: s1)
            System.out.println(n);
        System.out.println(s1.equals(s2));
    }
}
