package esercizio1;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class Safe {

    int combinazione;   // package-private

    private final String secret;

    int tentativi;      // package-private

    public Safe(int combinazione, String secret) {
        this.combinazione = combinazione;
        this.secret = secret;
    }

    public String open(int combinazione) {
        if(this.tentativi == 3)
            throw new RuntimeException("Cassaforte irreversibilmente bloccata.");
        if(this.combinazione == combinazione) {
            this.tentativi = 0;
            return this.secret;
        }
        this.tentativi++;
        return null;
    }
}
