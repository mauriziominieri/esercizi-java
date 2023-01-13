package esercizio1;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class Impianto {

    final int potenzaMassima;   // package-private per comodità

    private final Set<Apparecchio> apparecchioSet;  // un impianto è collegato a più apparecchi

    public Impianto(int potenzaMassima) {
        this.potenzaMassima = potenzaMassima;
        apparecchioSet = new HashSet<>();
    }

    public void collega(Apparecchio apparecchio) {
        apparecchioSet.add(apparecchio);
        apparecchio.impianto = this;
    }

    public int potenza() {
        int potenza = 0;
        for(Apparecchio apparecchio : apparecchioSet)
            if(apparecchio.acceso)
                potenza += apparecchio.potenzaAssorbita;
        return potenza;
    }
}
