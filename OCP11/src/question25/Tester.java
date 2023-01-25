package question25;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
Which statement is true?
    The memory allocated for Jane object can be reused in line 2.
 */
class Person {
    private String name;
    private Person child;
    public Person(String name, Person child) {
        this(name);
        this.child = child;
    }
    public Person(String name) {
        this.name = name;
    }
    public String toString() {
        return name+" "+child;
    }
}
public class Tester {
    public static Person createPeople() {
        Person jane = new Person("Jane");
        Person john = new Person("John",jane);
        return jane;
    }
    public static Person createPerson(Person person) {
        person = new Person("Jack",person);
        return person;
    }
    public static void main(String[] args) {
        Person person = createPeople();
        /* line 1 */
        person = createPerson(person);
        /* line 2 */
        String name = person.toString();
        System.out.println(name);
    }
}