package question45;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
Which statement is true?
    The code compiles successfully.
 */
public class ResourceTest {
    public static void main(String[] args) {
        final MyResource res1 = new MyResource();
        MyResource res2 = new MyResource();
        try(res1 ; res2) {
            // do something
        } catch(Exception e) {}
    }
    static class MyResource implements AutoCloseable {
        public void close() throws Exception {}
    }
}