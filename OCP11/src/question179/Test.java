package question179;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
What is the result?
    48
 */
public class Test {
    private String name;
    private int age;
    public Test (String name, int age) {
        this.name=name;
        this.age=age;
    }
    public int getAge() {
        return age;
    }
    public static void main(String[] args) {
        var persons = Arrays.asList(new Test("Max",18),
            new Test("Peter",18),
            new Test("Pamela",23),
            new Test("David",12));
        int num = persons.stream().mapToInt(Test::getAge).filter(p->p<20).reduce(0,(a,b)->a+b);
        System.out.println(num);
    }
}