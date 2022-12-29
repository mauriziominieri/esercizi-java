package esercizio1;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class Polynomial {

    private final double[] coefficienti;

    private final int degree;

    public Polynomial(double[] coefficienti) {
        this.coefficienti = coefficienti;
        this.degree = coefficienti.length;
    }

    public int getDegree() {
        return degree - 1;
    }

    public Polynomial times(Polynomial polynomial) {
        double[] d = new double[this.degree + polynomial.degree - 1];
        for(int i = 0; i < this.degree; i++)
            for(int j = 0; j < polynomial.degree; j++)
                d[i + j] += this.coefficienti[i] * polynomial.coefficienti[j];
        return new Polynomial(d);
    }

    @Override
    public String toString() {
        String response = "";
        response += coefficienti[0];
        for(int i = 1; i < coefficienti.length; i++)
            response += " + " + coefficienti[i] + " x^" + i;
        return response;
    }
}
