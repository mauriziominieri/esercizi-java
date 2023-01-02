package esercizio1;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
(Curriculum, 2016-1-27)
Un oggetto Curriculum rappresenta una sequenza di lavori, ognuno dei quali è un’istanza della
classe Job. Il costruttore di Curriculum accetta il nome di una persona. Il metodo addJob aggiunge
un lavoro alla sequenza, caratterizzato da una descrizione e dall’anno di inizio, restituendo un
nuovo oggetto di tipo Job. Infine, la classe Job offre il metodo next, che restituisce in tempo
costante il lavoro successivo nella sequenza (oppure null).
Implementare le classi Curriculum e Job, rispettando il seguente caso d’uso.
Caso d’uso:
    Curriculum cv = new Curriculum("Walter␣White");
    Curriculum.Job j1 = cv.addJob("Chimico", 1995);
    Curriculum.Job j2 = cv.addJob("Insegnante", 2005);
    Curriculum.Job j3 = cv.addJob("Cuoco", 2009);
    System.out.println(j2.next());
    System.out.println(j3.next());
Output:
    Cuoco: 2009
    null
 */

public class Main {
    public static void main(String[] args) {
        Curriculum cv = new Curriculum("Walter White");
        Curriculum.Job j1 = cv.addJob("Chimico", 1995);
        Curriculum.Job j2 = cv.addJob("Insegnante", 2005);
        Curriculum.Job j3 = cv.addJob("Cuoco", 2009);
        System.out.println(j2.next());
        System.out.println(j3.next());
    }
}
