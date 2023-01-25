package question32;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*  TODO: bisogna sicuramente cambiare nel word
You want to examine whether path is a directory.
Which code inserted on line 1 will accomplish this?
    BasicFileAttributes attributes = Files.readAttributes(path, BasicFileAttributes.class);
 */
public class Main {
    public static void main(String[] args) {
        try {
            Path path = Paths.get("u01/work"); // /u01/work/
            BasicFileAttributes attributes = Files.readAttributes(path, BasicFileAttributes.class); // line 1
//            BasicFileAttributes attributes = Files.isDirectory(path); // Required type: BasicFileAttributes, Provided: boolean
//            BasicFileAttributes attributes = Files.getAttribute(path, "isDirectory"); // Required type: BasicFileAttributes, Provided: Object
//            BasicFileAttributes attributes = Files.readAttributes(path, FileAttributes.class); // Cannot resolve symbol 'FileAttributes'
            System.out.println(attributes.isDirectory());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}