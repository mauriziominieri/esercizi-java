package esercizio1;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
(Controller, 2015-6-24)
Realizzare la classe Controller, che rappresenta una centralina per autoveicoli, e la classe Function,
che rappresenta una funzionalità del veicolo, che può essere accesa o spenta. Alcune funzionalità
sono incompatibili tra loro, per cui accenderne una fa spegnere automaticamente l’altra.
La classe Controller ha due metodi: addFunction aggiunge al sistema una nuova funzionalità con
un dato nome; printOn stampa a video i nomi delle funzionalità attive. La classe Function ha tre
metodi: turnOn e turnOff per attivarla e disattivarla; setIncompatible accetta un’altra funzionalità
x e imposta un’incompatibilità tra this e x.
Leggere attentamente il seguente caso d’uso, che mostra, tra le altre cose, che l’incompatibilità è
automaticamente simmetrica, ma non transitiva.
Caso d’uso:
    Controller c = new Controller();
    Controller.Function ac = c.addFunction("Aria␣condizionata");
    Controller.Function risc = c.addFunction("Riscaldamento");
    Controller.Function sedile = c.addFunction("Sedile␣riscaldato");
    ac.setIncompatible(risc );
    ac.setIncompatible(sedile );
    ac.turnOn();
    c.printOn();
    System.out.println("−−−−");
    risc .turnOn();
    sedile .turnOn();
    c.printOn();
Output:
    Aria condizionata
    ----
    Sedile riscaldato
    Riscaldamento
 */

public class Main {
    public static void main(String[] args) {
        Controller c = new Controller();
        Controller.Function ac = c.addFunction("Aria condizionata");
        Controller.Function risc = c.addFunction("Riscaldamento");
        Controller.Function sedile = c.addFunction("Sedile riscaldato");
        ac.setIncompatible(risc);
        ac.setIncompatible(sedile);
        ac.turnOn();
        c.printOn();
        System.out.println("−−−−");
        risc.turnOn();
        sedile.turnOn();
        c.printOn();
    }
}
