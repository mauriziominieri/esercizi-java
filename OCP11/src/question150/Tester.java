package question150;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
What is the result?
    The compilation fails due to an error in line 1.
 */
class Person {
    private String name = "Joe Bloggs";
    public Person(String name) {
        this.name = name;
    }
    public String toString() {
        return name;
    }
}
public class Tester {
    public static void main(String[] args) {
//        Person p1 = new Person(); // line 1
//        System.out.println(p1);
    }
}