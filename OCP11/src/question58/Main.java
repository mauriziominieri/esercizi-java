package question58;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
Which three code fragments, at line n1, prints SPRING?
    1. System.out.println(sA[1]);
    2. System.out.println(Season.SPRING);
    3. System.out.println(Season.valueOf("SPRING"));
 */
enum Season {
    WINTER('w'), SPRING('s'), SUMMER('h'), FALL('f');
    char c;
    private Season(char c) {
        this.c= c;
    }
}
public class Main {
    public static void main(String[] args) {
        Season[] sA = Season.values();
        // line n1
        System.out.println(sA[1]);
        System.out.println(Season.SPRING);
        System.out.println(Season.valueOf("SPRING"));
    }
}