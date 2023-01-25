package question163;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
Which is the correct implementation of the getRatings method in the Football subclass?
    The subclass getRatings method uses super.getRatings() to call the base class method but uses its own named fields in the implementation.
 */
class Sports {
    private double ratings = 1;
    public double getRatings() {
        return ratings;
    }
}
public class Football extends Sports {
    private double ratings = 2;
    public double getRatings() {
        super.getRatings();
        return ratings;
    }
    public static void main(String[] args) {
        Football football = new Football();
        System.out.println(football.getRatings());
    }
}