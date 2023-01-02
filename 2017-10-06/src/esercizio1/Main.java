package esercizio1;

import java.util.Collection;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
(Clinica, 2017-10-6)
Data la seguente enumerazione:
enum Specialista { OCULISTA, PEDIATRA; }
Realizzare la classe Clinica, che permette di prenotare e cancellare visite mediche. I metodi
prenota e cancellaPrenotazione accettano uno specialista e il nome di un paziente, ed effettuano
o cancellano la prenotazione, rispettivamente. Il metodo getPrenotati restituisce l’elenco dei
prenotati.
La classe deve rispettare le seguenti proprietà:
a) Non ci si può prenotare con più di uno specialista.
b) Si deve poter aggiungere uno specialista all’enumerazione senza dover modificare la classe Clinica.
Inoltre, l’implementazione deve rispettare il seguente esempio d’uso:
Esempio d’uso:
    Clinica c = new Clinica();
    c.prenota(Specialista .OCULISTA, "Pippo␣Franco");
    c.prenota(Specialista .OCULISTA, "Leo␣Gullotta");
    c.prenota(Specialista .OCULISTA, "Leo␣Gullotta");
    c.prenota(Specialista .PEDIATRA, "Ciccio␣Ingrassia");
    c.prenota(Specialista .PEDIATRA, "Leo␣Gullotta");
    c.cancellaPrenotazione( Specialista .PEDIATRA, "Ciccio␣Ingrassia");
    Collection<String> ocu = c.getPrenotati(Specialista.OCULISTA);
    System.out.println(ocu);
    System.out.println(c.getPrenotati( Specialista .PEDIATRA));
Output:
    [Leo Gullotta, Pippo Franco]
    []
 */

public class Main {
    public static void main(String[] args) {
        Clinica c = new Clinica();
        c.prenota(Specialista.OCULISTA, "Pippo Franco");
        c.prenota(Specialista.OCULISTA, "Leo Gullotta");
        c.prenota(Specialista.OCULISTA, "Leo Gullotta");
        c.prenota(Specialista.PEDIATRA, "Ciccio Ingrassia");
        c.prenota(Specialista.PEDIATRA, "Leo Gullotta");
        c.cancellaPrenotazione(Specialista.PEDIATRA, "Ciccio Ingrassia");
        Collection<String> ocu = c.getPrenotati(Specialista.OCULISTA);
        System.out.println(ocu);
        System.out.println(c.getPrenotati(Specialista .PEDIATRA));
    }
}
