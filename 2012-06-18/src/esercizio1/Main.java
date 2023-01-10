package esercizio1;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
(BoundedMap, 2012-6-18)
Implementare la classe BoundedMap, che rappresenta una mappa con capacità limitata.
Il costruttore accetta la dimensione massima della mappa. I metodi get e put sono analoghi a quelli
dell’interfaccia Map. Se però la mappa è piena e viene invocato il metodo put con una chiave
nuova, verrà rimossa dalla mappa la chiave che fino a quel momento è stata ricercata meno volte
con get.
L’implementazione deve rispettare il seguente caso d’uso.
Esempio d’uso:
    BoundedMap<String,String> m = new BoundedMap<String,String>(2);
    m.put("NA", "Napoli");
    m.put("SA", "Salerno");
    System.out.println(m.get("NA"));
    m.put("AV", "Avellino");
    System.out.println(m.get("SA"));
Output dell’esempio d’uso:
    Napoli
    null
 */

public class Main {
    public static void main(String[] args) {
        BoundedMap<String,String> m = new BoundedMap<String,String>(2);
        m.put("NA", "Napoli");
        m.put("SA", "Salerno");
        System.out.println(m.get("NA"));
        m.put("AV", "Avellino");
        System.out.println(m.get("SA"));
    }
}
