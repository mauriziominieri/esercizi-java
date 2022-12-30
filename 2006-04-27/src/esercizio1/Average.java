package esercizio1;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class Average {

    private int sum;

    private double n;

    public void add(int number) {
        sum += number;
        n++;
    }

    public double getAverage() {
        return sum / n;
    }
}
