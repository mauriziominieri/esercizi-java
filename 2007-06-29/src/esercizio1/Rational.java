package esercizio1;

import java.math.BigInteger;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class Rational implements Comparable<Rational> {

    private final int numeratore;

    private final int denominatore;

    public Rational(int numeratore, int denominatore) {
        if(denominatore < 0)
            throw new RuntimeException("denominatore negativo");
        int mcd = BigInteger.valueOf(numeratore).gcd(BigInteger.valueOf(denominatore)).intValue();
        this.numeratore = numeratore / mcd;
        this.denominatore = denominatore / mcd;
    }

    public Rational plus(Rational x) {
        // MASSIMO COMUN DIVISORE e MINIMO COMUNE MULTIPLO
        int mcd = BigInteger.valueOf(this.denominatore).gcd(BigInteger.valueOf(x.denominatore)).intValue();
        int mcm = (this.denominatore * x.denominatore) / mcd;
        return new Rational(mcm / this.denominatore * this.numeratore + mcm / x.denominatore * x.numeratore, mcm);
    }

    public Rational times(Rational x) {
        return new Rational(this.numeratore * x.numeratore, this.denominatore * x.denominatore);
    }

    @Override
    public String toString() {
        return numeratore + "/" + denominatore;
    }

    @Override
    public int compareTo(Rational o) {
//        if((double) this.numeratore / this.denominatore > (double) o.numeratore / o.denominatore) return 1;
//        else if((double) this.numeratore / this.denominatore < (double) o.numeratore / o.denominatore) return -1;
//        else return 0;
        return Double.compare((double) this.numeratore / this.denominatore, (double) o.numeratore / o.denominatore);    // versione smart
    }
}
