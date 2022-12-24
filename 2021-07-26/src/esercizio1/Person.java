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

    private GreenPass greenPass;

    public Person(String name) {
        this.name = name;
    }

    public GreenPass vaccinate(int day) {
        return this.greenPass == null ? new GreenPass(day + 180, this) : new GreenPass(day + 270, this);
    }
}
