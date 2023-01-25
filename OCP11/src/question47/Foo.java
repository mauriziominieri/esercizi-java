package question47;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
Which change would make Foo more secure?
    public static final String ALPHA = "alpha";
 */
public class Foo {
    public static String ALPHA = "alpha";
    protected String beta = "beta";
    private final String delta;
    public Foo(String d) {
        delta = ALPHA + d;
    }
    public String foo() {
        return beta += delta;
    }
}