package question171;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
If File.txt does exist, what is the result?
    The program executes and prints nothing.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        final Reader reader = new FileReader("File1.txt"); //("u01/work/message.txt");
        try {
            System.out.println(reader.read()); // line 1
        } finally {
            reader.read(); // line 2
        }
        reader.read(); // line 3
    }
}