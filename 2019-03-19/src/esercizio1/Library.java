package esercizio1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class Library {

    private final Map<String, Boolean> libraryMap;

    private final List<Book> loanBookList;

    public Library() {
        libraryMap = new HashMap<>();
        loanBookList = new ArrayList<>();
    }

    public boolean addBook(Book book) {
        if(!libraryMap.containsKey(book.title)) {
            libraryMap.put(book.title, true);   // è in biblioteca
            return true;
        }
        return false;
    }

    // Complessità: O(1), costante in quanto non devo fare alcuna iterazione
    public boolean loanBook(Book book) {
        if(!libraryMap.containsKey(book.title))
            throw new RuntimeException("Libro " + book.title + " mai inserito nella biblioteca");
        if(!libraryMap.get(book.title))
            return false;
        libraryMap.put(book.title, false);  // è in prestito
        loanBookList.add(book);
        return true;
    }

    // Complessità: O(n), la rimozione dell'elemento prevede iterazioni
    public boolean returnBook(Book book) {
        if(!libraryMap.containsKey(book.title))
            throw new RuntimeException("Libro " + book.title + " mai inserito nella biblioteca");
        if(libraryMap.get(book.title))
            throw new RuntimeException("Libro " + book.title + " non è in prestito");
        libraryMap.put(book.title, true);  // è in biblioteca
        loanBookList.remove(book);
        return true;
    }

    public void printLoans() {
        for (Book book : loanBookList)
            System.out.println(book);
    }
}
