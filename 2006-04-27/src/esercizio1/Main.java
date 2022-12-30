package esercizio1;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
(Average, 2006-4-27)
Si implementi una classe Average che rappresenti la media aritmetica di un elenco di numeri
interi. Ogni oggetto deve possedere un metodo add che aggiunge un intero all’elenco, ed un
metodo getAverage che restituisce la media dei valori immessi fino a quel momento. Il tentativo
di chiamare getAverage prima che venga inserito alcun valore deve portare ad una eccezione.
Esempio di utilizzo:
public static void main(String[] x) {
    Average a = new Average();
    double d;
    a.add(10);
    a.add(20);
    d = a.getAverage();
    System.out.println("Media␣corrente:␣" + d);
    a.add(60);
    d = a.getAverage();
    System.out.println("Media␣corrente:␣" + d);
}
Output del codice precedente:
    Media corrente: 15.0
    Media corrente: 30.0

Dei 30 punti totali, 10 sono riservati a chi implementa una soluzione che non memorizza tutti gli
interi inseriti.
 */

public class Main {
    public static void main(String[] args) {
        Average a = new Average();
        double d;
        a.add(10);
        a.add(20);
        d = a.getAverage();
        System.out.println("Media corrente: " + d);
        a.add(60);
        d = a.getAverage();
        System.out.println("Media corrente: " + d);
    }
}
