package question105;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*  TODO: Da verificare per bene, sicura al 90%
When running jdeps, which three ways include dependent nonmodular jar files?
    4. jdeps --class-path lib/file1.jar:lib/file2.jar:lib/file3.jar application.jar
    5. jdeps -cp lib/file1.jar:lib/file2.jar:lib/file3.jar application.jar
    6. jdeps -classpath lib/file1.jar:lib/file2.jar:lib/file3.jar application.jar
 */
/*
1. jdeps application.jar
2. jdeps --module-path lib/file1.jar:lib/file2.jar:lib/file3.jar application.jar
3. jdeps --upgrade-module-path lib/file1.jar:lib/file2.jar:lib/file3.jar application.jar
4. jdeps --class-path lib/file1.jar:lib/file2.jar:lib/file3.jar application.jar
5. jdeps -cp lib/file1.jar:lib/file2.jar:lib/file3.jar application.jar
6. jdeps -classpath lib/file1.jar:lib/file2.jar:lib/file3.jar application.jar
7. jdeps lib/file1.jar:lib/file2.jar:lib/file3.jar application.jar

jdeps --class-path, jdeps -cp, and jdeps -classpath are all equivalent commands that are used to specify the classpath for the jdeps command. They all serve the same purpose and are used in the same way.
The three ways that include dependent non-modular jar files when running jdeps are:
4. jdeps --class-path lib/file1.jar:lib/file2.jar:lib/file3.jar application.jar
5. jdeps -cp lib/file1.jar:lib/file2.jar:lib/file3.jar application.jar
6. jdeps -classpath lib/file1.jar:lib/file2.jar:lib/file3.jar application.jar

The options 4, 5 and 6 all use the --class-path or its short form -cp or -classpath to specify the classpath, which is used to search for dependent non-modular jar files.
jdeps application.jar or jdeps lib/file1.jar:lib/file2.jar:lib/file3.jar application.jar is the first option, where it takes the application jar as the first argument and analyzes the dependencies of the classes in the jar by searching for dependent non-modular jar files in the classpath
The options 2 and 3 use the --module-path and --upgrade-module-path respectively, these options specify the module path, which is used to search for dependent modular jar files.
Please note that, starting from Java 9, the JRE and JDK have been modularized and the --module-path option is recommended for analyzing the dependencies of classes in modular jar files.
 */
/*
Ha senso che 4 5 6 siano giuste dato che sono in pratica lo stesso comando.
1. jdeps (Java Dependency Analysis Tool) is a command line tool that can be used to analyze the dependencies of a Java application, including the non-modular jar files that the application depends on. When you run the command "jdeps application.jar", it will show the package-level dependencies of the application, including any non-modular jar files that the application depends on.
2. The command jdeps --module-path lib/file1.jar:lib/file2.jar:lib/file3.jar application.jar is used to analyze the dependencies of the application "application.jar" and its dependencies on other modules or JAR files.
The --module-path flag is used to specify the location of the modules or JAR files that the application depends on.
This command will not include dependent non-modular JAR files in a Java 11 application.
3. The command jdeps --upgrade-module-path lib/file1.jar:lib/file2.jar:lib/file3.jar application.jar is used to analyze the dependencies of the application "application.jar" and its dependencies on other modules or JAR files, and it will also check if the dependencies can be upgraded to more recent versions.
The --upgrade-module-path flag is used to specify the location of the modules or JAR files that the application depends on.
This command will not include dependent non-modular JAR files in a Java 11 application.
7. The command is used to analyze the dependencies of the application "application.jar" and its dependencies on other modules or JAR files.
In this case, the command is specifying that the modules or JAR files file1.jar, file2.jar, and file3.jar are located in the lib/ directory.
This command will not include dependent non-modular JAR files in a Java 11 application.
 */
public class Main {}