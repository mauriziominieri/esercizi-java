package question173;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
Which two statements print ..\..\..\answers\topsecret?
    1. System.out.print(p2.relativize(p3));
    2. System.out.print(p1.relativize(p3));
 */
/*
x.relativize(y) -> che percorso devo fare da x per arrivare a y?
Dato che in questo esempio voglio raggiungere topsecret basta ricordare di prendere p3 come parametro nel relativize()
*/
public class Main {
    public static void main(String[] args) {
        Path p1 = Paths.get("/scratch/exam/topsecret/answers");
        Path p2 = Paths.get("/scratch/exam/answers/temp.txt");
        Path p3 = Paths.get("/scratch/answers/topsecret");

        System.out.println(p3.relativize(p1));
        System.out.println(p2.relativize(p3));
        System.out.println(p1.relativize(p2));
        System.out.println(p2.relativize(p1));
        System.out.println(p3.relativize(p2));
        System.out.println(p1.relativize(p3));
    }
}