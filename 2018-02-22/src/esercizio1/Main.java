package esercizio1;

import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
(Book e Library, 2018-2-22)
Realizzare le classi Book e Library, che rappresentano rispettivamente un libro e una collezione
di libri. Il metodo addBook di Library aggiunge un libro alla collezione, con un dato titolo e un
dato autore. A ciascun libro è possibile attribuire uno o più argomenti tramite il suo metodo
addTag. Il metodo getBooksByTag di Library restituisce in tempo costante l’insieme dei libri di
un argomento dato.
L’implementazione deve rispettare il seguente esempio d’uso:
Esempio d’uso:
    Library casa = new Library(), ufficio = new Library();
    Library.Book b1 = casa.addBook("Esercizi␣di␣stile", "Queneau");
    b1.addTag("letteratura");
    b1.addTag("umorismo");
    Library.Book b2 = casa.addBook("Me␣parlare␣bene␣un␣giorno", "Sedaris");
    b2.addTag("umorismo");
    Library.Book b3 = ufficio.addBook("Literate␣programming", "Knuth");
    b3.addTag("programmazione");
    Set<Library.Book> humorCasa = casa.getBooksByTag("umorismo");
    System.out.println(humorCasa);
    Set<Library.Book> humorUfficio = ufficio.getBooksByTag("umorismo");
    System.out.println(humorUfficio);
Output:
    [Esercizi di stile, by Queneau, Me parlare bene un giorno, by Sedaris]
    null
 */

public class Main {
    public static void main(String[] args) {
        Library casa = new Library(), ufficio = new Library();
        Library.Book b1 = casa.addBook("Esercizi di stile", "Queneau");
        b1.addTag("letteratura");
        b1.addTag("umorismo");
        Library.Book b2 = casa.addBook("Me parlare bene un giorno", "Sedaris");
        b2.addTag("umorismo");
        Library.Book b3 = ufficio.addBook("Literate programming", "Knuth");
        b3.addTag("programmazione");
        Set<Library.Book> humorCasa = casa.getBooksByTag("umorismo");
        System.out.println(humorCasa);
        Set<Library.Book> humorUfficio = ufficio.getBooksByTag("umorismo");
        System.out.println(humorUfficio);
    }
}
