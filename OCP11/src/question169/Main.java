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
        System.gc();
        System.out.println(Location.city);
    }
}