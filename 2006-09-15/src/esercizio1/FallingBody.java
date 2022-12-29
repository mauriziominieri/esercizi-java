package esercizio1;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class FallingBody {

    private double massa;

    private final double altezza;

    private int secondi;

    public FallingBody(double massa, double altezza) {
        this.massa = massa;
        this.altezza = altezza;
    }

    public void progress(int secondi) {
        this.secondi += secondi;
    }

    @Override
    public String toString() {
        double v0 = 0;
        double a = 10;  // da traccia
        double t = secondi;
        double v = v0 + a * t;
        double s = altezza - 0.5 * (v0 + (v0 + a * t)) * t;
        if(s <= 0) {
            s = 0;
            v = 0;
        }
        return "altezza: " + s + ", velocita': " + v;
    }
}
