package esercizio2;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
(Anagramma, 2009-1-15)
Si implementi un metodo statico che prende come argomenti due stringhe e restituisce vero se
sono l’una l’anagramma dell’altra e falso altrimenti.
 */

public class Main {

    public static boolean isAnagram(String string1, String string2) {
        if (string1.length() != string2.length())
            return false;
        char[] string1A = string1.toCharArray();
        char[] string2A = string2.toCharArray();
        Arrays.sort(string1A);
        Arrays.sort(string2A);
        return Arrays.equals(string1A, string2A);
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("tiziano","notizia"));
        System.out.println(isAnagram("mela","alam"));
        System.out.println(isAnagram("elam","mela"));
        System.out.println(isAnagram("amaa","mela"));
    }
}
