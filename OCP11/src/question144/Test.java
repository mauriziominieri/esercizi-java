package question144;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
What is the output?
    Object value 25
 */
/*
In Java, when you perform arithmetic operations such as addition, subtraction, multiplication, or division, the result is always promoted to a larger data type to prevent loss of precision.
In the case of adding two short values, the result is promoted to an int data type because int is the next larger data type than short and can hold all possible values of short. This is known as "binary numeric promotion".
This is done to ensure that the result of the operation can hold the full range of possible values, even if the operands are at the upper or lower limits of their respective data types.
Ricorda inoltre che un tipo primitivo andrebbe comunque in un metodo con parametro Object in quanto poco prima verrebbe convertito in classe wrapper.
 */
public class Test {
    public void process(byte v) {
        System.out.println("Byte value "+v);
    }
    public void process(short v) {
        System.out.println("Short value "+v);
    }
    public void process(Object v) {
        System.out.println("Object value "+v);
    }
    public static void main(String[] args) {
        byte x = 12;
        short y = 13;
        new Test().process(x+y); // line 1
    }
}