package esercizio1;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class Body {

    private double x;

    private double y;

    private int t;

    private double velX;

    private double velY;

    public Body(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setSpeed(double velX, double velY) {
        this.velX = velX;
        this.velY = velY;
    }

    public void progress(int t) {
        this.t += t;
        this.x = this.t * this.velX;
        this.y = this.t * this.velY;
    }

    @Override
    public String toString() {
        return x + ", " + y;
    }
}
