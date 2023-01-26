package question165;

import java.util.Locale;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
Which two assignments create Locale instances?
    1. Locale locale = Locale.getDefault();
    2. Locale locale = new Locale("en", "GB");
 */
public class Main {
    public static void main(String[] args) {
//        Locale locale1 = "en-USA";
        Locale locale2 = Locale.getDefault();
//        Locale locale3 = Locale.getAvailableLocales();
        Locale locale4 = new Locale("en", "GB");
//        Locale locale5 = "fr_FR";
    }
}