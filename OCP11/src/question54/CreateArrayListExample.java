package question54;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
What is the result?
    [Lettuce, Kale]
    [Seabass, Salmon]
 */
public class CreateArrayListExample {
    public static void main(String[] args) {
        List vegetables = new ArrayList<>();
            vegetables.add("Kale");
            vegetables.add(0, "Lettuce");
            System.out.println(vegetables);
        List fish = new ArrayList<>();
            fish.add("Salmon");
            fish.add(0, "Seabass");
            System.out.println(fish);
    }
}