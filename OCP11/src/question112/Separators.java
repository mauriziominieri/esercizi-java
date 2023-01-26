package question112;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*  TODO: dubbi al riguardo, tecnicamente si usa l'encapsulation per i fields, ma basta usare i metodi set per modificarli, con la enum e l'interfaccia i fields diventano final e quindi entrambe sono valide... se devono rimanere public static allora direi l'interfaccia
To secure this code, you want to make sure that the client code cannot modify the public static fields.
Which code will accomplish this?
    interface Separators {
        String separator = "/";
        String pathSeparator = ":";
    }
 */
/*
1.  enum Separators {
        separator,
        pathSeparator
    }
2.  interface Separators {
        String separator = "/";
        String pathSeparator = ":";
    }
3.  abstract class Separators {
        public static String separator = "/";
        public static String pathSeparator = ":";
    }
4.  class Separators {
        private static String separator = "/";
        private static String pathSeparator = ":";
    }
 */
public class Separators {
    public static String separator = "/";
    public static String pathSeparator = ":";
}