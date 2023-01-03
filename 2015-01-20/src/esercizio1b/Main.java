package esercizio1b;

import java.util.Comparator;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
(DataSeries, 2015-1-20)
Realizzare la classe DataSeries, che rappresenta una serie storica di dati numerici (ad es., la
popolazione di una regione anno per anno). Il metodo set imposta il valore della serie per un
dato anno. Il metodo statico comparatorByYear accetta un anno e restituisce un comparatore tra
serie di dati che confronta il valore delle due serie per quell’anno.
Esempio d’uso:
    DataSeries pop1 = new DataSeries(),
    pop2 = new DataSeries();
    pop1.set(2000, 15000.0); pop1.set(2005, 18500.0); pop1.set(2010, 19000.0);
    pop2.set(2000, 12000.0); pop2.set(2005, 16000.0); pop2.set(2010, 21000.0);
    Comparator<DataSeries> c2005 = DataSeries.comparatorByYear(2005),
    c2010 = DataSeries.comparatorByYear(2010);
    System.out.println(c2005.compare(pop1, pop2));
    System.out.println(c2010.compare(pop1, pop2));
Output:
    1
    -1
 */

public class Main {
    public static void main(String[] args) {
        DataSeries pop1 = new DataSeries(),
                   pop2 = new DataSeries();
        pop1.set(2000, 15000.0); pop1.set(2005, 18500.0); pop1.set(2010, 19000.0);
        pop2.set(2000, 12000.0); pop2.set(2005, 16000.0); pop2.set(2010, 21000.0);
        Comparator<DataSeries> c2005 = DataSeries.comparatorByYear(2005),
                               c2010 = DataSeries.comparatorByYear(2010);
        System.out.println(c2005.compare(pop1, pop2));
        System.out.println(c2010.compare(pop1, pop2));
    }
}
