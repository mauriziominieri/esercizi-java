package esercizio1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class Cart {

    private final List<Product> productList;

    private int totalPrice;

    public Cart() {
        productList = new ArrayList<>();
    }

    public void add(Product product) {
        productList.add(product);
        totalPrice += product.getPrezzo();
    }

    public void remove(Product product) {
        productList.remove(product);
        totalPrice -= product.getPrezzo();
    }

    public int totalPrice() {
        return totalPrice;
    }
}
