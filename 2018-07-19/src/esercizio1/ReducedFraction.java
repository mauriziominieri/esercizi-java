package esercizio1;

import java.math.BigInteger;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class ReducedFraction extends Fraction {

    Integer numeratoreR;    // visibilit√† package-private

    Integer denominatoreR;  // visibilit√† package-private

    public ReducedFraction(Integer numeratore, Integer denominatore) {
        super(numeratore, denominatore);
        int mcd = BigInteger.valueOf(numeratore).gcd(BigInteger.valueOf(denominatore)).intValue();
        this.numeratoreR = numeratore / mcd;
        this.denominatoreR = denominatore / mcd;
    }

    @Override
    public Fraction times(Fraction fraction) {
        if(fraction instanceof ReducedFraction f)
            return new ReducedFraction(this.numeratoreR * f.numeratoreR, this.denominatoreR * f.denominatoreR);
        return new Fraction(this.numeratoreR * fraction.numeratore, this.denominatoreR * fraction.denominatore);
    }

    @Override
    public String toString() {
        return numeratoreR + "/" + denominatoreR;
    }
}
