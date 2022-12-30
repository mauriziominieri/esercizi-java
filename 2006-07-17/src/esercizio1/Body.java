package esercizio1;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class Body {

    private double massa;

    private double force;

    private int seconds;

    public Body(int massa) {
        this.massa = massa;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public void progress(int seconds) {
//        if(force == -100)
//            this.seconds = seconds;
//        else
            this.seconds += seconds;
    }

    @Override
    public String toString() {
        int t = seconds;
        int v0 = 0, s0 = 0;
        double a = force / massa;   // double F = massa * a;
        double v = v0 + a * t;
        double s = s0 + v0 * t + 0.5 * a * Math.pow(t, 2);
        return "posizione: " + s + ", velocità: " + v;
    }
}
