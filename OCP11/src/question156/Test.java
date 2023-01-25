package question156;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
What is the result?
    The compilation fails.
 */
// An enumeration is a special kind of class that contains a fixed number of predefined instances. Each instance of an enum represents a value. The instances are created when the enum type is initialized, and their number is fixed.
enum Status {
    BRONZE(5),SILVER(10),GOLD(15);  // sono queste le istanze
    private int rate;
    private Status(int rate) {
        this.rate = rate;
    }
    public int getRate() { return rate; }
    public Status addStatus(int rate) {
//        return new Status(20); // l'unico modo di creare istanze è fare come il rigo 17
        return null;
    }
}
public class Test {
    public static void main(String[] args) {
        Status silver = Status.SILVER;
//        System.out.println(silver+silver.getRate());
//        Status platinum = Status.addStatus(20);
//        System.out.println(platinum+platinum.getRate());
    }
}
