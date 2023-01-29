package question182;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
What is the result?
    The compilation fails.
 */
class MyType<T> {
    private T value;
    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }
}
public class Test {
    public static void main(String... args) {
        MyType<String> strType = new MyType<>();
        MyType<Integer> intType = new MyType<>();
        MyType<?> type = intType;
        strType.setValue("test");
//        type.setValue(1234); // compilation error
        System.out.println(strType.getValue() + ":" + type.getValue());
    }
}