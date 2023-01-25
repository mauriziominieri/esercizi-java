package question98;

import java.io.Console;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
and the command:
java ConsoleTest
The user will input Duke and Java when the input is prompted.
What is the output?
    Input Name: Duke
    Input Password:
    Name is: Duke, Password is: Java
 */
// per eseguire da console basta che da terminale ti dirigi nel percorso della classe ConsoleTest (Open In > Terminal), e scrivi il comando java ConsoleTest.java
public class ConsoleTest {
    public static void main(String[] args) {
        Console console = System.console();
        var name = console.readLine("Input Name: ");
        var password = console.readPassword("Input Password: ");
        System.out.println("Name is: " + name + ", Password is: " + String.valueOf(password)); // se non ci fosse String.valueOf() la password sarebbe: [C@4f51b3e0
    }
}