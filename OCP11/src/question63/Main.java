package question63;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
Which "for" loop produces the same output?
    for(int d = 0; d < 10; ) {
        System.out.print(d);
        ++d;
    }
 */
public class Main {
    public static void main(String[] args) {
        int x = 0;
        while(x < 10) {
            System.out.print(x++);
        }
        System.out.println();
        for(int d = 0; d < 10; ) {
            System.out.print(d);
            ++d;
        }
    }
}