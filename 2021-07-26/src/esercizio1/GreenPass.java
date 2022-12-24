package esercizio1;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class GreenPass {

    private final int day;

    private final Person person;

    public GreenPass() {
        throw new RuntimeException("Puoi creare un GreenPass solo attraverso vaccinate()");
    }

    public GreenPass(int day, Person person) {
        this.day = day;
        this.person = person;
    }

    public boolean isValidOn(int day) {
        return day <= this.day;
    }

    public boolean belongsTo(Person person) {
        return this.person.equals(person);
    }
}
