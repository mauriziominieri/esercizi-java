package esercizio1;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class Reservation {

    private final String name;

    int startDate;  // package-private per comodità

    int endDate;    // package-private per comodità

    public Reservation(String name, int startDate, int endDate) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getName() {
        return this.name;
    }
}
