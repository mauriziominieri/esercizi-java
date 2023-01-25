package question91;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
What is the result?
    Mr. Blue
 */
class Person {
    private String name = "Green";
    public void setName(String name) {
        String title = "Mr. ";
        this.name = title + name;
    }
    public String toString() {
        return name;
    }
}
public class Test {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Blue");
        System.out.println(p);
    }
}