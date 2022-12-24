package esercizio1;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class Polynomial {

    double[] value; // package-private -> modificabile dalla sottoclasse

    public Polynomial(double[] value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        Polynomial that = (Polynomial) o;
        return Arrays.equals(value, that.value);
    }

    @Override
    public String toString() {
        String s = "";
        for(int i = value.length - 1; i >= 0; i--) {
            if(value[i] != 0) {
                if(i == value.length - 1)
                    s += value[i] + " x^" + i;
                else if(i == 0)
                    s += (value[i] > 0 ? " +" : " ") + value[i];
                else
                    s += (value[i] > 0 ? " +" : " ") + value[i] + " x^" + i;
            }
        }
        return s;
    }
}
