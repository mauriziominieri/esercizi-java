package esercizio1;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class Person {

    private final String name;

    private final Set<Person> friendList;

    private final Set<Person> enemyList;

    public Person(String name) {
        this.name = name;
        friendList = new LinkedHashSet<>(); // per rispettare l'ordine di inserimento
        enemyList = new LinkedHashSet<>();
    }

    public void addFriend(Person person) {
        if(this == person)
            throw new RuntimeException("Non puoi aggiungere te stesso come amico");
        if(enemyList.contains(person))
            throw new RuntimeException("Non puoi aggiungere " + person + " anche come amico");
        friendList.add(person);
    }

    public void addEnemy(Person person) {
        if(this == person)
            throw new RuntimeException("Non puoi aggiungere te stesso come nemico");
        if(friendList.contains(person))
            throw new RuntimeException("Non puoi aggiungere " + person + " anche come nemico");
        enemyList.add(person);
    }

    public Set<Person> contacts() {
        Set<Person> personSet = friendList;
        personSet.addAll(enemyList);
        return personSet;
    }

    @Override
    public String toString() {
        return name;
    }
}
