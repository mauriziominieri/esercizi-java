package question44;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
You want to display the value of currency as $100.00.
Which code inserted on line 1 will accomplish this?
    NumberFormat formatter = NumberFormat.getCurrencyInstance(locale);
 */
public class Main {
    public static void main(String[] args) {
        Locale locale = Locale.US;
        NumberFormat formatter = NumberFormat.getCurrencyInstance(locale); // line 1
        double currency = 1_00.00;
        System.out.println(formatter.format(currency));
    }
}