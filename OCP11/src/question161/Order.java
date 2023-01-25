package question161;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
Which action must you perform to print Verified?
    Invoke the verify method from the place method.
 */
interface OrderService {
    default void place(int numItems, int minItems) { }
    private void verify(int minItems) {
        System.out.print("Verified");
    }
}
public class Order implements OrderService {
    public static void main(String[] args) {
        Order order = new Order();
        order.place(10,5);
    }
}