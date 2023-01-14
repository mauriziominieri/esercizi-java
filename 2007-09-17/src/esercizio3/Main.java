package esercizio3;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
(Aereo, 2007-9-17)
Si implementi una classe Aereo. Ogni aereo si può trovare in ogni istante di tempo in uno dei
seguenti quattro stati: in fase di decollo, in fase di crociera, in fase di atterraggio, atterrato. I
quattro metodi decollo, crociera, atterraggio, atterrato cambiano lo stato dell’aereo. Questi metodi
devono sollevare un’eccezione nuova, definita da voi, se non vengono chiamati nell’ordine giusto.
Infine, il metodo nvoli restituisce il numero di voli completati dall’aereo fino a quel momento.
 */

public class Main {
    public static void main(String[] args) {
        Aereo aereo = new Aereo();
        aereo.decollo();
        aereo.crociera();
        aereo.atterraggio();
        aereo.atterrato();
        aereo.decollo();
        aereo.crociera();
        aereo.atterraggio();
        aereo.atterrato();
        System.out.println(aereo.nvoli());
    }
}
