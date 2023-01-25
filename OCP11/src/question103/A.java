package question103;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
Which makes class A thread safe?
    Make foo and setB synchronized.
 */
/*
1. Make foo and setB synchronized.
2. Make setB synchronized.
3. Make A synchronized.
4. Make foo synchronized.
5. Class A is thread safe.

Making both foo() and setB() synchronized would make class A thread-safe because it will ensure that only one thread can execute either of these methods at a time, preventing race conditions.
Making only setB() synchronized would not make class A thread-safe, because there could still be race conditions when multiple threads are trying to read and write to the variables a, b, and c.
Making class A synchronized would make the class thread-safe, but it would also make all the methods of the class synchronized, which can cause performance issues if the methods are called frequently.
Making only foo() synchronized would not make class A thread-safe, because there could still be race conditions when multiple threads are trying to read and write to the variables a, b, and c in setB().
Class A is not thread-safe by default, and it needs to be made thread-safe by synchronizing the methods that access shared variables.
 */
public class A {
    int a = 0;
    int b = 0;
    int c = 0;
    public void foo(int i) {
        a += b * i;
        c -= b * i;
    }
    public void setB(int i) {
        b = i;
    }
}