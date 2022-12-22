package esercizio1;

import java.util.Objects;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class Fraction {

    Integer numeratore;     // visibilità package-private

    Integer denominatore;   // visibilità package-private

    public Fraction(Integer numeratore, Integer denominatore) {
        this.numeratore = numeratore;
        this.denominatore = denominatore;
    }

    public Fraction times(Fraction fraction) {
        if(fraction instanceof ReducedFraction f)
            return new Fraction(this.numeratore * f.numeratoreR, this.denominatore * f.denominatoreR);
        return new Fraction(this.numeratore * fraction.numeratore, this.denominatore * fraction.denominatore);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        Fraction fraction = (Fraction) o;
        return Objects.equals(numeratore, fraction.numeratore) && Objects.equals(denominatore, fraction.denominatore);
    }

    @Override
    public String toString() {
        return numeratore + "/" + denominatore;
    }
}
