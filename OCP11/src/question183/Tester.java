package question183;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
What is the result?
    Mary
    Mary
 */
class Person {
    private String name;
    public Person(String name) {
        this.name = name;
    }
    public String toString() {
        return name;
    }
}
public class Tester {
    static Person p = null;
    public static void main(String[] args) {
        p = checkPerson(p);
        System.out.println(p);
        Person p1 = new Person("Joe");
        p1 = checkPerson(p);
        System.out.println(p1);
    }
    public static Person checkPerson(Person p) {
        if (p == null) {
            p = new Person("Mary");
        }
        return p;
    }
}