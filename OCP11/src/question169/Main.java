package question169;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
What is the result?
    San Francisco
 */
// il metodo gc() suggerisce di lanciare il garbage collector ma non lo assicura. new Location assegna un valore alla variabile statica city e rimane tale.
class Location {
    static String city;
    public Location(String locationCity) {
        city = locationCity;
    }
}
public class Main {
    public static void main(String[] args) {
        var location = new Location("San Francisco");
        location = null;
        System.gc(); // Runs the garbage collector in the Java Virtual Machine.
        System.out.println(Location.city);
    }
}