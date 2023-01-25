package question28;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
You must define the A exception class. The program execution must be terminated if the condition at line 19
is true and an A exception is thrown at line 20.
Which code fragment at line n1 defines A as per the requirement?
    class A extends Throwable {
*/
class A extends Throwable { /* line n1 */       // correct because is superclass of Exception
//    2. class A extends Exception {            // is incorrect because it goes on catch() and program continues
//    3. class A extends ArithmeticException {  // is incorrect because ArithmeticException is a specific exception type that's thrown when an exceptional arithmetic condition has occurred, like dividing by zero.
//    4. class A extends RuntimeException {     // is incorrect because RuntimeException is an unchecked exception, it doesn't need to be handled or declared.
    A() {
        super ("The Mandatory Criteria Yet to Meet");
    }
}
public class TestCE {
    public static void main(String[] args) throws A {
        int a = 10, b = 13;
        try {
            if (a < b) {
                throw new A();
            }
        }
        catch (Exception e) { System.out.println(e); }
        System.out.println("Continue...");
    }
}