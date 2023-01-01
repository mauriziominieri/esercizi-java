package esercizio1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class Library {

    Map<String, Set<Book>> bookMap; // package-private per comodità

    public Library() {
        bookMap = new HashMap<>();
    }

    public Book addBook(String titolo, String autore) {
        Book book = new Book(titolo, autore);
        Set<Book> bookSet = bookMap.get("") == null ? new HashSet<>() : bookMap.get("");
        bookSet.add(book);
        bookMap.put("", bookSet);
        return book;
    }

    // tempo costante
    public Set<Book> getBooksByTag(String argomento) {
        return bookMap.get(argomento);
    }

    class Book {

        private final String titolo;

        private final String autore;

        public Book(String titolo, String autore) {
            this.titolo = titolo;
            this.autore = autore;
        }

        public void addTag(String argomento) {
            Set<Book> bookSet = bookMap.get(argomento) == null ? new HashSet<>() : bookMap.get(argomento);
            bookSet.add(this);
            bookMap.put(argomento, bookSet);
        }

        @Override
        public String toString() {
            return  titolo + ", by " + autore;
        }
    }
}
