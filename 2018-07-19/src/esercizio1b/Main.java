package esercizio1b;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
(SafeSet, 2018-7-19)
Realizzare la classe SafeSet, che rappresenta un insieme che richiede due passaggi per rimuovere
completamente un oggetto. Il metodo add aggiunge un elemento all’insieme, restituendo true
se l’inserimento ha avuto successo. Il metodo remove rimuove un elemento dall’insieme, ma la
rimozione è definitiva solo dopo una seconda chiamata. Il metodo contains verifica se l’insieme
contiene un dato elemento (in base a equals). Infine, un SafeSet deve essere thread-safe. Il
seguente diagramma rappresenta il ciclo di vita di un oggetto all’interno di un SafeSet:
L’implementazione deve rispettare il seguente esempio d’uso.
Esempio d’uso:
    SafeSet<String> a = new SafeSet<>();
    System.out.println(a.add("ciao"));
    System.out.println(a.add("mondo"));
    System.out.println(a.remove("ciao"));
    System.out.println(a.contains("ciao"));
    System.out.println(a.remove("ciao"));
    System.out.println(a.contains("ciao"));
Output:
    true
    true
    true
    false
    true
    false
 */

public class Main {
    public static void main(String[] args) {
        SafeSet<String> a = new SafeSet<>();
        System.out.println(a.add("ciao"));
        System.out.println(a.add("mondo"));
        System.out.println(a.remove("ciao"));
        System.out.println(a.contains("ciao"));
        System.out.println(a.remove("ciao"));
        System.out.println(a.contains("ciao"));
    }
}
