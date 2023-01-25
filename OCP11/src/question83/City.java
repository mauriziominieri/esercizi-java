package question83;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
What is the result?
    1
 */
public class City {
    public static void main(String[] args) {
        String[] towns = {"boston", "paris", "bangkok", "oman"};
        Comparator<String> ms = (a, b) -> b.compareTo(a);   // creo un comparatore che confronta il n elemento con il n - 1
        Arrays.sort(towns, ms); // ordino in base al comparatore, quindi l'array towns viene ordinato in senso decrescente
        System.out.println(Arrays.binarySearch(towns, "oman", ms)); // la binarySearch restituisce l'indice dell'elemento key nell'array
    }
}