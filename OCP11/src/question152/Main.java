package question152;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
What is the result?
    The compilation fails.
 */
// In this case, the variable "reader" is defined as final, because it is being used in a try-with-resources block. When a resource is declared in a try-with-resources statement, it is implicitly final.
public class Main {
    public static void main(String[] args) {
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");
        try (BufferedReader reader =
            new BufferedReader((new FileReader(file1)))) {
            System.out.println(reader.readLine());
//            reader = new BufferedReader(new FileReader(file2)); // Cannot assign a value to final variable 'reader'
            System.out.println(reader.readLine());
        } catch (IOException e) {
            System.out.print("Error reading files");
        }
    }
}