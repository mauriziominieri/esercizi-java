package esercizio1;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class Person {

    private String name;

    private String surname;

    Woman mom;

    Man dad;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void addChild(Person person) {}

    public void marries(Person person) {}

    public static boolean areSiblings(Person person1, Person person2) {
        if(person1.dad == null || person2.dad == null)  // non si può stabilire se ad uno dei due manca il padre (o la madre)
            return false;
        return person1.mom == person2.mom && person1.dad == person2.dad;
    }
}
