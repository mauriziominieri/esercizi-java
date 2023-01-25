package question129;

import java.net.URI;
import java.net.URISyntaxException;
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
Which two expressions create a valid Java Path instance?
    1. Paths.get("foo");
    2. Paths.get(URI.create("file:///domains"));
 */
// Paths ha il metodo get()
public class Main {
    public static void main(String[] args) throws URISyntaxException {
//        new Path("foo");
//        Paths.getPath("too");
//        Path.get(new URI("file:///domains/oracle/test.txt"));
        Paths.get("foo");
        Paths.get(URI.create("file:///domains/oracle/test.txt"));
    }
}