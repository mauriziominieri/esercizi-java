package esercizio1;

import java.util.List;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
(Movie, 2013-9-25)
La classe Movie rappresenta un film, con attributi titolo (stringa) e anno di produzione (intero).
Alcuni film formano delle serie, cioè sono dei sequel di altri film. La classe offre due costruttori:
uno per film normali e uno per film appartenenti ad una serie. Quest’ultimo costruttore accetta
come terzo argomento il film di cui questo è il successore.
Il metodo getSeries restituisce la lista dei film che formano la serie a cui questo film appartiene.
Se invocato su un film che non appartiene ad una serie, il metodo restituisce una lista contenente
solo questo film.
Il metodo statico selectByYear restituisce l’insieme dei film prodotti in un dato anno, in tempo
costante.
Esempio d’uso:
    Movie r1 = new Movie("Rocky", 1976);
    Movie r2 = new Movie("Rocky␣II", 1979, r1);
    Movie r3 = new Movie("Rocky␣III", 1982, r2);
    Movie f = new Movie("Apocalypse␣Now", 1979);
    Set<Movie> movies1979 = Movie.selectByYear(1979);
    System.out.println(movies1979);
    List<Movie> rockys = r2.getSeries();
    System.out.println(rockys);
Output:
    [Rocky II, Apocalypse Now]
    [Rocky, Rocky II, Rocky III]
 */

public class Main {
    public static void main(String[] args) {
        Movie r1 = new Movie("Rocky", 1976);
        Movie r2 = new Movie("Rocky II", 1979, r1);
        Movie r3 = new Movie("Rocky III", 1982, r2);
        Movie f = new Movie("Apocalypse Now", 1979);
        Set<Movie> movies1979 = Movie.selectByYear(1979);
        System.out.println(movies1979);
        List<Movie> rockys = r2.getSeries();
        System.out.println(rockys);
    }
}
