package question36;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
Why would you choose to use a peek operation instead of a forEach operation on a Stream?
    To process the current item and return a stream.
 */
/*
The peek operation is used to process the current item of a stream and return the same stream, allowing you to chain multiple operations together. It is commonly used for debugging or logging purposes, where you want to see the current value of the stream without modifying it.
For example, you can use the peek operation to print the current item of a stream:
stream.peek(System.out::println);
This will print each item in the stream without modifying the stream.
On the other hand, forEach operation consumes the stream and it doesn't return anything, it's useful when you want to iterate the elements of a stream and do something with each of them but it doesn't modify the stream.
stream.forEach(System.out::println);
This will also print each item in the stream but it will mark the end of the stream, so you can't perform any more operations on it.
It's important to note that you could use both operations to achieve the same goal, but peek is useful when you want to continue working with the stream after processing the current item, while forEach is useful when you just want to process the items in the stream and don't need to keep working with it.
 */
public class Main {}