package esercizio1;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
(Impianto e Apparecchio, 2008-3-27)
Si implementi una classe Impianto che rappresenta un impianto elettrico, e una classe Apparecchio
che rappresenta un apparecchio elettrico collegabile ad un impianto. Un impianto è caratterizzato
dalla sua potenza massima erogata (in Watt). Ciascun apparecchio è caratterizzato dalla sua
potenza assorbita (in Watt). Per quanto riguarda la classe Impianto, il metodo collega collega
un apparecchio a questo impianto, mentre il metodo potenza restituisce la potenza attualmente
assorbita da tutti gli apparecchi collegati all’impianto ed accesi.
I metodi on e off di ciascun apparecchio accendono e spengono, rispettivamente, questo apparecchio.
Se, accendendo un apparecchio col metodo on, viene superata la potenza dell’impianto a
cui è collegato, deve essere lanciata una eccezione.
Esempio d’uso:
    Apparecchio tv = new Apparecchio(150);
    Apparecchio radio = new Apparecchio(30);
    Impianto i = new Impianto(3000);
    i.collega (tv);
    i.collega (radio);
    System.out.println(i .potenza());
    tv.on();
    System.out.println(i .potenza());
    radio.on();
    System.out.println(i .potenza());
Output dell’esempio d’uso:
    0
    150
    180
 */

public class Main {
    public static void main(String[] args) {
        Apparecchio tv = new Apparecchio(150);
        Apparecchio radio = new Apparecchio(30);
        Impianto i = new Impianto(3000);
        i.collega(tv);
        i.collega(radio);
        System.out.println(i.potenza());
        tv.on();
        System.out.println(i.potenza());
        radio.on();
        System.out.println(i.potenza());
    }
}
