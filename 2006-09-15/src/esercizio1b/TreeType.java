package esercizio1b;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class TreeType {

    private final String name;

    int counter;   // package-private per comodità

    public TreeType(String name) {
        this.name = name;
    }

    public int getCounter() {
        return this.counter;
    }

    @Override
    public String toString() {
        return name;
    }
}
