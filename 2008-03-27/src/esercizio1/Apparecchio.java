package esercizio1;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class Apparecchio {

    int potenzaAssorbita;   // package-private per comodità

    boolean acceso; // package-private per comodità

    Impianto impianto;  // un apparecchio è collegato ad un impianto

    public Apparecchio(int potenzaAssorbita) {
        this.potenzaAssorbita = potenzaAssorbita;
    }

    public void on() {
        if(impianto.potenza() + potenzaAssorbita > impianto.potenzaMassima)
            throw new RuntimeException("Superata la potenza dell'impianto");
        acceso = true;
    }

    public void off() {
        acceso = false;
    }
}
