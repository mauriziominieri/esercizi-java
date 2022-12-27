package esercizio1;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
Per un sito di domande e risposte, realizzare le classi Question e Answer. Ogni risposta è associata
ad un’unica domanda e gli utenti possono votare la risposta migliore invocando il metodo voteUp
di Answer. Inoltre, il metodo getBestAnswer restituisce in tempo costante la risposta (o una delle
risposte) che ha ottenuto il maggior numero di voti.
Rispettare il seguente caso d’uso.
Caso d’uso:
    Question q = new Question("Dove␣si␣trova␣Albuquerque?");
    Answer a1 = new Answer(q, "Canada");
    Answer a2 = new Answer(q, "New␣Mexico");
    a1.voteUp();
    System.out.println(q.getBestAnswer());
    a2.voteUp();
    a2.voteUp();
    System.out.println(q.getBestAnswer());
Output:
    Canada
    New Mexico
 */

public class Main {
    public static void main(String[] args) {
        Question q = new Question("Dove si trova Albuquerque?");
        Answer a1 = new Answer(q, "Canada");
        Answer a2 = new Answer(q, "New Mexico");
        a1.voteUp();
        System.out.println(q.getBestAnswer());
        a2.voteUp();
        a2.voteUp();
        System.out.println(q.getBestAnswer());
    }
}
