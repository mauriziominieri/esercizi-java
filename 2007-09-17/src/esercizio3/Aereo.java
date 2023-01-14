package esercizio3;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class Aereo {

    private Stato stato;

    private int nvoli;

    public Aereo() {
        this.stato = Stato.ATTERRATO;
    }

    public void decollo() {
        if(stato != Stato.ATTERRATO)
            throw new RuntimeException("Non puoi decollare, sei in " + stato);
        this.stato = Stato.DECOLLO;
    }

    public void crociera() {
        if(stato != Stato.DECOLLO)
            throw new RuntimeException("Non puoi andare in crociera, sei in " + stato);
        this.stato = Stato.CROCIERA;
    }

    public void atterraggio() {
        if(stato != Stato.CROCIERA)
            throw new RuntimeException("Non puoi andare in atterraggio, sei in " + stato);
        this.stato = Stato.ATTERRAGGIO;
    }

    public void atterrato() {
        if(stato != Stato.ATTERRAGGIO)
            throw new RuntimeException("Non puoi atterrare, sei in " + stato);
        this.stato = Stato.ATTERRATO;
        nvoli++;
    }

    public int nvoli() {
        return this.nvoli;
    }
}
