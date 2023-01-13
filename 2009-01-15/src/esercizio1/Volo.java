package esercizio1;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class Volo {

    private final int partenza;

    private final int arrivo;

    public Volo(int partenza, int arrivo) {
        if(arrivo <= partenza)
            throw new RuntimeException("L'arrivo: " + arrivo + " deve essere maggiore della partenza: " + partenza);
        this.partenza = partenza;
        this.arrivo = arrivo;
    }

    public void add(Passeggero passeggero) {
        for(Volo volo : passeggero.voloSet) {
            if((this.partenza >= volo.partenza && this.partenza <= volo.arrivo)   // il volo si accavalla
            || (volo.partenza >= this.partenza && volo.partenza <= this.arrivo))
                throw new RuntimeException("Errore volo: " + this + ". Il passeggero " + passeggero + " è già nel volo " + volo);
        }
        passeggero.voloSet.add(this);
    }

    @Override
    public String toString() {
        return "(" + partenza + ", " + arrivo + ")";
    }
}
