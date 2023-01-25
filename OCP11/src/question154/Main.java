package question154;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.function.BiPredicate;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
Given the directory structure:
- continent
            | a.txt
            |- country
                      | b.txt
                      | - state
                               | c.txt
                               |+ country
What is the result?
    /continent
    /continent/country
 */
public class Main {
    public static void main(String[] args) {
//        BiPredicate pred = (path, fileAttrs) -> {
//            return fileAttrs.isDirectory();
//        };
//        int depth = 1;
//        try(var stream = Files.find(Paths.get("/continent"), depth, pred )) {
//            stream.forEach(System.out::println);
//        } catch (IOException e) {}
    }
}