package question115;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
What is the result?
    Dec 17, 2018
    12/17/18
 */
/*
The output you see in IntelliJ may be different from what I have described, because the format of the date is dependent on the default locale of your system and the JVM that IntelliJ is running on.

The code you provided creates a new Locale object with the language "en" (English) and the country "US" (United States) but it's not used to format the date.

The format method of LocalDate uses the default locale of the system to format the date. The default locale is determined by the system's settings and it may be different from the one you created in the code.

If you want to ensure that the output is the same as what you expect, you can pass the Locale object to the format method, like this:
mToday = today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).withLocale(l));
sToday = today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(l));

This way the date will be formatted according to the locale passed as an argument, which is "en_US" in this case.

You can also check the default locale of your system by running the code:
System.out.println(Locale.getDefault());

This will give you the information about the default locale of your system, and you can compare it with the one you created in the code.
 */
public class Main {
    public static void main(String[] args) {
        Locale l = new Locale("en", "US");
        LocalDate today = LocalDate.of(2018, 12, 17);
        String mToday = today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        String sToday = today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        System.out.println(mToday);
        System.out.println(sToday);
    }
}