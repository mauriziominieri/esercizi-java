package question160;

import java.sql.Timestamp;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
javac test.java
jdeps -summary Test.class
What is the result on execution of these commands?
    Test.class -> java.base
    Test.class -> java.sql

 */
public class Test {
    public static void main(String[] args) {
        Timestamp ts = new Timestamp(1);
    }
}