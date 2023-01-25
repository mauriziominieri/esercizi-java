package question76;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*  TODO: Da verificare meglio
Which two commands are used to identify class and module dependencies?
    1. jdeps --list-deps
    2. java --show-module-resolution
 */
/*
1. jdeps --list-deps
2. java --show-module-resolution
3. jmod describe
4. jar --show-module-resolution
5. java Hello.java

The "jdeps" command is used to analyze class files and JAR files and display their dependencies on other class files and modules.
The "java" command with the option "--show-module-resolution" is used to show how modules are resolved at runtime, including which modules are read from the classpath and which are resolved from the module path.
Both commands are command line tools included in the Java Development Kit (JDK).

The "jmod describe" is used to display information about the contents of a JMOD file.
The "jar" command does not have an option for "--show-module-resolution"
The command "java Hello.java" is used to run a Java program with the file name "Hello.java", it will not show any information about dependencies.
 */
public class Main {}