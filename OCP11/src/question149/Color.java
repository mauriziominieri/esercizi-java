package question149;

import java.util.Comparator;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
What is the result?
    An exception is thrown at runtime.
 */
// l'utilizzo del metodo sort() su una lista creata con List.of() genera un'eccezione UnsupportedOperationException.
public class Color {
    String hue;
    int value;
    public Color(String hue, int value) {
        this.hue = hue;
        this.value = value;
    }
    public String toString() {
        return this.hue + ":" + this.value;
    }
    public static void main(String[] args) {
        List clrs = List.of(new Color("Red", 100),
                            new Color("Yellow", 50),
                            new Color("Red", 75),
                            new Color("Yellow", 75));
        Comparator<Color> hueSrtr = (h1, h2) -> h1.hue.compareTo(h2.hue);
        Comparator<Color> valueSrtr = (h1, h2) -> { if (h1.value >= h2.value) {
                                                        return 1;
                                                    } else {
                                                        return -1;
                                                    }
        };
        clrs.sort(hueSrtr.thenComparing(valueSrtr)); // java.lang.UnsupportedOperationException
        System.out.println(clrs);
    }
}