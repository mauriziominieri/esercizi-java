package question145;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
Given the code fragment:
    module citizen {
        exp rts com.name to greeting;
    }
and
    module greeting {
    }
Which statement is true?
    Inserting "required citizen;" at greeting's module-info.java, enables com.name members accessible to the greeting module.
 */
/*
1. Inserting "required citizen;" at greeting's module-info.java, enables com.name members accessible to the greeting module.
2. public members in the com.name package are accesible to all modules.
3. public members in the com.name package are accesible only to the greeting module.
4. All members of com.name are accessible only to the citizen and greeting modules.
5. All members of com.name package are accessible only to greeting modules.

The "requires citizen" statement in the module-info.java of the greeting module, indicates that the greeting module requires the citizen module, allowing the com.name package to be exported by the citizen module and used by the greeting module.
The statement 2 is false, as the accessibility of package members is determined by the exports statement in the module-info.java file, and not by their visibility level.
The statement 3 is false, as the com.name package is only exported by the citizen module and not the greeting module, so it would not be accessible to the greeting module alone.
The statement 4 is false, as the accessibility of package members is determined by the exports statement in the module-info.java file, and not by the module where the package is located.
The statement 5 is false, as the com.name package is exported by the citizen module, and not by the greeting module, so it would not be accessible to the greeting module alone.
 */
public class Main { }