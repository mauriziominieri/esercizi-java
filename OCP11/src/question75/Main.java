package question75;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*  TODO: Da verificare meglio
Which two statements are correct about modules in Java?
    4. java.base exports all of the Java platforms core packages.
    5. module-info.java can be placed in any folder inside module-path.
 */
/*
1. module-info.java cannot be empty.
2. By default, modules can access each other as long as they run in the same folder.
3. A module must be declared in module-info.java file.
4. java.base exports all of the Java platforms core packages.
5. module-info.java can be placed in any folder inside module-path.

The two correct statements about modules in Java are:
4. java.base exports all of the Java platforms core packages.
5. module-info.java can be placed in any folder inside module-path.

1. is incorrect. A module-info.java file does not need to contain any module declaration and it can be empty.
2. is incorrect. By default, modules cannot access each other unless they explicitly declare their dependencies in the module-info.java file, and use the requires statement to import the other module.
3. is incorrect. A module does not have to be declared in a module-info.java file in order to be used in a Java project. However, if a module-info.java file is present in a project, it must contain a declaration for each module used in that project. The module-info.java file is used to specify the module name, its dependencies, and other information about the module, such as which packages it exports and which it opens to other modules.

Java 9 introduced the concept of modules, which allow developers to organize their code into separate and self-contained units, with well-defined interfaces to other modules. The module-info.java file contains the module declaration and specifies the dependencies between modules. The java.base module is the root of the Java platform module system and exports all of the Java platform's core packages, such as java.lang, java.io, etc.
The module-info.java file can be placed in any folder inside the module-path, but it is recommended to place it in the root of the module's source code directory.
 */
public class Main {}