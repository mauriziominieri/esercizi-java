package question142.pac;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*  TODO: da verificare meglio
Given the directory structure:
\Test
| Hello.java
Given the commands to execute at the Test directory prompt:
    javac -d pac Hello.java
    java -cp pac pac.Hello
Which statement is true?

 */
/*
When the command "javac -d pac Hello.java" is executed, it will compile the "Hello.java" file and create a "Hello.class" file in the "pac" directory.
When the command "java -cp pac pac.Hello" is executed, it will run the "Hello" class and invoke the main method of the class.
The main method of the class uses the Hello.class.getModule() method to get the module of the class. Since the class is not in a named module the module returned is an "unnamed module", the getName() method returns "unnamed module" and the getDescriptor() method returns null since the unnamed module does not have a descriptor.
It's important to note that in order to have a descriptor, the class should be packaged in a jar file and added to the module path.
 */
public class Hello {
    public static void main(String[] args) {
        Module module = Hello.class.getModule();
        System.out.println("Module: "+module);
        System.out.println("Name: " + module.getName());
        System.out.println("Descriptor: " + module.getDescriptor());
    }
}