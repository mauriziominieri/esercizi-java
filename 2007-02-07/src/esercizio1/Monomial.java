package esercizio1;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class Monomial extends Polynomial {

    private int grado;

    private int coefficiente;

    public Monomial(int grado, int coefficiente) {
        super(new double[grado + 1]);
        super.value[grado] = coefficiente;
        this.grado = grado;
        this.coefficiente = coefficiente;
    }
}
