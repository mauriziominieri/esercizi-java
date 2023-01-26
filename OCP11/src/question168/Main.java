package question168;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
What is the result?
    500.0
 */
final class X {
    public static X createX(double amount) {
        return new X(amount);
    }
    public double amount;
    private X(double amount) {
        this.amount = amount;
    }
    public String toString() {
        return String.valueOf(amount);
    }
}
public final class Main {
    public static void main(String[] args) {
        X x = X.createX(100.0);
        x.amount = 500.0;
        System.out.println(x);
    }
}