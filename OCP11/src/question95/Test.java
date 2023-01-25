package question95;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
You want to examine the items list if it contains an item for which the variable count is below zero.
    if(items.stream().anyMatch(i -> i.count < 0))
 */
class Item {
    public String name; public int count;
    public Item(String name, int count) {
        this.name = name; this.count = count;
    }
}
public class Test {
    public static void main(String[] args) {
        var items = List.of(new Item("A", 10),new Item("B", 2),new Item("C", 12),new Item("D", 5),new Item("E", 6));
        // line 1
//        if(items.stream().allMatch(i -> i.count < 0))
        if(items.stream().anyMatch(i -> i.count < 0))
//        if(items.stream().filter(i -> i.count < 0).findFirst())
//        if(items.stream().filter(i -> i.count < 0).findAny())
            System.out.println("There is an item for which the variable count is below zero.");
    }
}