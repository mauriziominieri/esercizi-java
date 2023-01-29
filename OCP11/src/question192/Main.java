package question192;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
Which two code snippets inserted independently inside println method print Mondial:domainmodel?
    1. new Main().prefix + new Main().name
    2. Main.prefix + Main.getName()
 */
public class Main {
    static String prefix = "Mondial:";
    private String name = "domainmodel";
    public static String getName(){
        return new Main().name;
    }
    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(Main.prefix + Main.getName() /* Insert code here */ );
    }
}