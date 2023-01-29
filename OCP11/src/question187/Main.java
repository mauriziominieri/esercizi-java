package question187;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
Given the content from lines.txt :
C
C++
Java
Go
Kotlin
What is the result?
    C
    C++
    GO
    KOTLIN
 */
public class Main {
    public static void main(String[] args) {
        String fileName = "lines.txt";
        List list = new ArrayList<>();
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
            list = stream
                    .filter(line -> !line.equalsIgnoreCase("JAVA"))
                    .map(String::toUpperCase)
                    .collect(Collectors.toList());
        } catch (IOException e) {
        }
        list.forEach(System.out::println);
    }
}