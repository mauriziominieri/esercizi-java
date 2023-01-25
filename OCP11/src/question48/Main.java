package question48;

import java.util.Comparator;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
Which code fragment rapresent a valid Comparator implementation?
    public class Comps implements Comparator {
        public int compare(String str1, String str2) {
            return str1.length() - str2.length();
        }
    }
}
 */
// Un Comparator ha il metodo astratto int compare(T t1, T t2), quindi bisogna overridarlo. Il metodo poi dovrebbe comparare i due oggetti in qualche modo. (1 se >, -1 se <, 0 se uguali)
public class Main {
    public static void main(String[] args) {
        new Comparator<String>() {
            public int compare(String str1, String str2) {
                return str1.compareTo(str2);
            }
        };
//        This is an anonymous inner class that implements the compare method. But it is not a complete implementation as it is not associated with any variable, it is not a standalone comparator, you should use it to create a variable and then use it for sorting or comparisons.
    }
}

