package question176;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
Which two statements are true about running code on the class path and the module path?
    1. A modular JAR placed on the --module-path results in a named application module.
    2. A non-modular JAR placed on the -classpath results in an unnamed module.
 */
/*
1. A modular JAR placed on the -classpath results in an automatic module.
2. A modular JAR placed on the --module-path results in a named application module.
3. A non-modular JAR placed on the --module-path results in a named application module.
4. A modular JAR placed on the -classpath results in a named application module.
5. A non-modular JAR placed on the -classpath results in an unnamed module.

Chiedendole una ad una la 3 e la 4 sono false.
Per la 1. invece Java 9 and later versions do not support automatic modules, and the classpath is not used for modular JARs. The --module-path option should be used for modular JARs that contain a module-info.class file.
 */
// ricorda modular module e poi il suo contrario -> non-modular classpath
public class Main { }