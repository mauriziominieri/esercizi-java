package esercizio1;

import java.util.*;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class Clinica {

    private final Map<Specialista, Set<String>> prenotazioniMap;

    public Clinica() {
        prenotazioniMap = new HashMap<>();
    }

    public void prenota(Specialista specialista, String paziente) {
        for(Specialista key : prenotazioniMap.keySet())
            if(prenotazioniMap.get(key) != null && prenotazioniMap.get(key).contains(paziente))
                return;
        Set<String> pazientiSet = prenotazioniMap.get(specialista) == null ? new HashSet<>() : prenotazioniMap.get(specialista);
        pazientiSet.add(paziente);
        prenotazioniMap.put(specialista, pazientiSet);
    }

    public void cancellaPrenotazione(Specialista specialista, String paziente) {
        if(prenotazioniMap.get(specialista) != null)
            prenotazioniMap.get(specialista).remove(paziente);
    }

    public Collection<String> getPrenotati(Specialista specialista) {
        return prenotazioniMap.get(specialista);
    }
}
