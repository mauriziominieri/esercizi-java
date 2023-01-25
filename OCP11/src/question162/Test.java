package question162;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
What is the result?
    test:null
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
        MyType<? extends Number> type = new MyType<>();
        strType.setValue("test");
        type.setValue(null);
        System.out.println(strType.getValue() + ":" + type.getValue());
    }
}