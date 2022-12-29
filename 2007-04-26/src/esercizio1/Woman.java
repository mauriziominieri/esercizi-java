package esercizio1;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class Woman extends Person {

    Man husband;    // package-private per comodità

    public Woman(String name, String surname) {
        super(name, surname);
    }

    @Override
    public void addChild(Person person) {
        person.mom = this;
        person.dad = this.husband;
    }

    @Override
    public void marries(Person person) {
        if(person instanceof Woman)
            throw new RuntimeException("Esercizio contro i diritti civili");
        Man man = (Man) person;
        this.husband = man;
        man.wife = this;
    }
}
