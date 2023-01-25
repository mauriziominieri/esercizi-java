package question94;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
Examine this excerpt from the declaration of the java.se module:
module java.se {
    ...
    requires transitive java.xml;
    ...
}
What does the transitive modifier mean?
    Any module that requires the java.se module does not need to require the java.xml module.
 */
/*
1. Only a module that requires the java.se module is permitted to require the java.xml module.
2. Any module that requires the java.xml module does not need to require the java.se module.
3. Any module that attempts to require the java.se module actually requires the java.xml module instead.
4. Any module that requires the java.se module does not need to require the java.xml module.

The "transitive" modifier in the excerpt you provided means:
Any module that requires the java.se module does not need to require the java.xml module.
The "transitive" keyword on a "requires" statement means that a module that depends on the module that has the "transitive" keyword will also depend on the module that is required by the first module.
In this case, any module that requires the "java.se" module will also have an implicit dependency on the "java.xml" module, so they don't need to explicitly require the "java.xml" module themselves.

The other options are not correct

Only a module that requires the java.se module is permitted to require the java.xml module.
Any module that requires the java.xml module does not need to require the java.se module.
Any module that attempts to require the java.se module actually requires the java.xml module instead.

// Basta vedere il modulo e notare che java.xml è all'interno di java.se quindi tutti i moduli che richiedono java.se non hanno bisogno di richiedere java.xml in quanto già inglobato
 */
public class Main {}