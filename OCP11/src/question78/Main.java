package question78;

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
You want to read data through the reader object.
Which statement inserted on line 1 will accomplish this?
    reader.read(characters);
 */
public class Main {
    public static void main(String[] args) {
        char[] characters = new char[100];
        try (FileReader reader = new FileReader("file_to_path");) {
            reader.read(characters); // line 1
            System.out.println(String.valueOf(characters));
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}