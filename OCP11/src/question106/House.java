package question106;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
Which two statements inserted independently on line 3 will make this code compile?
    1. return new House<Animal>();
    2. return new House<Dog>();
 */
class Animal {}
class Dog extends Animal {}
class Petdog extends Dog {}
public class House<A extends Animal> {
    public House<? super Dog> build(A a) { // deve restituire Dog o una superclasse di Dog, cioè Animal
        // insert code here
//        return new House<A>();
//        return new House<Petdog>();
//        return new House<Animal>();
//        return new House<?>();
        return new House<Dog>();
    }
}