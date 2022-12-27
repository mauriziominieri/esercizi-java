package esercizio1;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class ResettableSafe extends Safe {

    public ResettableSafe(int combinazione, String secret) {
        super(combinazione, secret);
    }

    public boolean changeKey(int old, int _new) {
        if(tentativi == 3)
            throw new RuntimeException("Cassaforte irreversibilmente bloccata.");
        if(old == combinazione) {
            this.combinazione = _new;
            this.tentativi = 0;
            return true;
        }
        this.tentativi++;
        return false;
    }
}
