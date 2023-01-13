package esercizio1;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class Elemento {

    private String sigla;

    public Elemento(String sigla) {
        this.sigla = sigla;
    }

    @Override
    public String toString() {
        return sigla;
    }
}
