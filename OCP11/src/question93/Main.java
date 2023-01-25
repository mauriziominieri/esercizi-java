package question93;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
Which two statements inserted independently at line 1 enable this code to print PRRT?
    1. break b;
    2. continue a;
 */
// ricorda doppia b e poi il suo opposto (l'opposto di break b è continue a)
public class Main {
    public static void main(String[] args) {
        StringBuilder txt1 = new StringBuilder("PPQRRRSTT");
        int i = 0;
        a:
        while (i < txt1.length()) {
            char x = txt1.charAt(i);
            int j = 0;
            i++;
            b:
            while (j < txt1.length()) {
                char y = txt1.charAt(j);
                if (i != j && y == x) {
                    txt1.deleteCharAt(j);
                    continue a; // line 1
                }
                j++;
            }
        }
        System.out.println(txt1);
    }
}