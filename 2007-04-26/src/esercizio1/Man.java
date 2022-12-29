package esercizio1;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class Man extends Person {

    Woman wife; // package-private per comodità

    public Man(String name, String surname) {
        super(name, surname);
    }

    @Override
    public void addChild(Person person) {
        person.dad = this;
        person.mom = this.wife;
    }

    @Override
    public void marries(Person person) {
        if(person instanceof Man)
            throw new RuntimeException("Esercizio contro i diritti civili");
        Woman woman = (Woman) person;
        this.wife = woman;
        woman.husband = this;
    }
}
