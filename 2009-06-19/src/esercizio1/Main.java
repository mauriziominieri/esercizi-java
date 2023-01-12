package esercizio1;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
(Tutor, 2009-6-19)
Un tutor è un dispositivo per la misurazione della velocità media in autostrada. Una serie di
sensori identifica i veicoli in base alle targhe e ne calcola la velocità, misurando il tempo che il
veicolo impiega a passare da un sensore al successivo (e, naturalmente, conoscendo la distanza
tra i sensori).
Si implementi la classe Tutor e la classe Detector (sensore). Il metodo addDetector di Tutor crea
un nuovo sensore posto ad un dato kilometro del tracciato. Il metodo carPasses di Detector
rappresenta il passaggio di un veicolo davanti a questo sensore: esso prende come argomenti la
targa di un veicolo ed un tempo assoluto in secondi, e restituisce una stima della velocità di
quel veicolo, basata anche sui dati dei sensori che lo precedono. Tale metodo restituisce −1 se il
sensore non ha sufficienti informazioni per stabilire la velocità.
Si supponga che le chiamate ad addDetector avvengano tutte all’inizio e con kilometri crescenti,
come nel seguente esempio d’uso.
Esempio d’uso:
    Tutor tang = new Tutor();
    Tutor.Detector a = tang.addDetector(2);
    Tutor.Detector b = tang.addDetector(5);
    Tutor.Detector c = tang.addDetector(9);
    // nuovo veicolo
    System.out.println(a.carPasses("NA12345", 0));
    // 3km in 1200 sec (20 minuti), quindi 9km/h
    System.out.println(b.carPasses("NA12345", 1200));
    // nuovo veicolo
    System.out.println(b.carPasses("SA00001", 1200));
    // 4km in 120 sec (2 minuti), quindi 120km/h
    System.out.println(c.carPasses("NA12345", 1320));
    // 4km in 180 sec (3 minuti), quindi 80km/h
    System.out.println(c.carPasses("SA00001", 1380));
Output dell’esempio d’uso:
    -1
    9
    -1
    120
    80
 */

public class Main {
    public static void main(String[] args) {
        Tutor tang = new Tutor();
        Tutor.Detector a = tang.addDetector(2);
        Tutor.Detector b = tang.addDetector(5);
        Tutor.Detector c = tang.addDetector(9);
        // nuovo veicolo
        System.out.println(a.carPasses("NA12345", 0));
        // 3km in 1200 sec (20 minuti), quindi 9km/h
        System.out.println(b.carPasses("NA12345", 1200));
        // nuovo veicolo
        System.out.println(b.carPasses("SA00001", 1200));
        // 4km in 120 sec (2 minuti), quindi 120km/h
        System.out.println(c.carPasses("NA12345", 1320));
        // 4km in 180 sec (3 minuti), quindi 80km/h
        System.out.println(c.carPasses("SA00001", 1380));
    }
}
