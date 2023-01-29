package question39;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
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
Assuming all referenced paths exist within the file system, what is the result?
    false false true
 */
/*
The first line creates a Path object v1 using the Paths.get() method, which takes a string as an argument that represents the path. In this case, the path is "/./forest" which would resolve to the same directory as "forest" directory and then it is concatenated with "tree.txt".
The second line creates a Path object v2 using the toPath() method on a File object, which takes a string as an argument that represents the path. In this case, the path is "/forest/./water../tree.txt" which would resolve to the same directory as "/forest/water/tree.txt".
The first print statement uses the Files.isSameFile() method, which compares the two Path objects and returns true if they refer to the same file in the file system. In this case, v1 and v2 are not the same file, so the method will return false.
The second print statement compares the two Path objects using the equals() method. The equals() method compares the two Path objects and returns true if they are equal. In this case, the two Path objects v1 and v2 are not equal, so the method will return false.
The third print statement, uses the normalize() method on both paths before comparing them using the equals() method. normalize() method eliminates any redundant elements such as "." and ".." from the path. In this case, the method will normalize the path of v1 to "/forest/tree.txt" and the path of v2 to "/forest/water/tree.txt", and then compares them using the equals() method which will return true because the two Paths are now pointing to the same file.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Path v1 = Paths.get("/./forest").resolve(Paths.get("tree.txt"));
        Path v2 = new File("/forest/./water../tree.txt").toPath();
        System.out.print(Files.isSameFile(v1,v2));
        System.out.print(" " + v1.equals(v2));
        System.out.print(" " + v1.normalize().equals(v2.normalize()));
    }
}