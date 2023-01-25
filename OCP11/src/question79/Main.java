package question79;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*  TODO: Da verificare meglio
You want to validate a path name before the read file. Before validation, all path names should be canonicalized.
Which code inserted on line n1 will accomplish this?
    Path file = Paths.get(filename);
    String canonicalPath = file.normalize().toString();
    FileInputStream fis = new FileInputStream(canonicalPath);
 */
public class Main {
    public static void main(String[] args) throws IOException {
        String filename = "u01/work" + args[0]; // "/u01/work" indicates an absolute file path, which starts from the root directory of the file system. Tolgo il "/" iniziale -> it's a relative file path. The file is located relative to the current working directory
        // line n1
//        File file = new File(filename);
//        String canonicalPath = file.getCanonicalPath();
//        FileInputStream fis = new FileInputStream(f);

//        Path file = Paths.get(filename);
//        Path canonicalPath = file.toAbsolutePath().toString();
//        FileInputStream fis = new FileInputStream(canonicalPath);

        Path file = Paths.get(filename);
        String canonicalPath = file.normalize().toString();
        FileInputStream fis = new FileInputStream(canonicalPath);

//        File file = new File(filename).getAbsoluteFile(); // La escluderei in quanto le altre 3 hanno canonicalPath
//        FileInputStream fis = new FileInputStream(file);
        // ...
    }
}