package question62;

import java.time.LocalDate;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
How many LocalDate objects are created in this example?
    5
 */
/*
In this example, 5 LocalDate objects are created.

The first LocalDate object is created on line 1: "LocalDate d1 = LocalDate.now();"
The second LocalDate object is created on line 2: "d1.plusDays(1);" This line creates a new LocalDate object representing the date that is one day later than the original LocalDate object that the method was called on, but it's not assigned to any variable, it's eligible for garbage collection.
The third LocalDate object is created on line 3: "d1 = d1.minusMonths(2); "This line creates a new LocalDate object and assigns it to the variable d1. The old LocalDate object is eligible for garbage collection.
The fourth LocalDate object is created on line 4: "LocalDate d2 = d1.plusWeeks(3);"
The fifth LocalDate object is created, d2.minusDays(4); returns a new LocalDate object but it's not assigned to any variable, it's eligible for garbage collection.
It's important to note that, LocalDate.now() creates a new LocalDate object representing the current date, however, it's not assigned to any variable, it's eligible for garbage collection.

And also, when d2 = null, it does not create a new LocalDate object, it just sets the reference d2 to the null value, it does not affect the existing LocalDate object.
---
It's important to note that, even though the memory view only shows the reachable objects, the other objects that were created during the execution of the program still exist in the heap and are eligible for garbage collection.
Mi servirebbe analizzare l'heap per vedere esattamente tutti gli oggetti creati e non solo quelli raggiungibili... come?
 */
public class Main {
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.now(); // new object
        d1.plusDays(1);     // new object eligible for garbage collection.
        d1 = d1.minusMonths(2); // new object, d1 LocalDate.now(); eligible for garbage collection.
        LocalDate d2 = d1.plusWeeks(3); // new object
        d2.minusDays(4); // new object eligible for garbage collection.
        d2 = null; // you are not deleting the LocalDate object, you are just nullifying the reference variable "d2" that points to the object. eligible for garbage collection.
    }
}