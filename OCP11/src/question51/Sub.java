package question51;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
Which line of code results in a compilation error?
    line n4
 */
class Super {
    final int num;  // line n1
    public Super(int num) {
        this.num = num;
    }
    final void method() {
        System.out.println("Output from Super");
    }
}
public class Sub extends Super {
    int num;  // line n2
    Sub(short num) {    // line n3
        super(num);
    }
//    protected void method() {   // line n4  // il metodo che vuole overridare è final
//        System.out.println("Output from Sub");
//    }
}