package esercizio1b;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
(Highway, 2007-6-29)
Implementare una classe Highway, che rappresenti un’autostrada a senso unico. Il costruttore
accetta la lunghezza dell’autostrada in chilometri. Il metodo insertCar prende un intero x come
argomento ed aggiunge un’automobile al chilometro x. L’automobile inserita percorrerà l’autostrada alla velocità
di un chilometro al minuto, (60 km/h) fino alla fine della stessa. Il metodo
nCars prende un intero x e restituisce il numero di automobili presenti al chilometro x. Il metodo
progress simula il passaggio di 1 minuto di tempo (cioè fa avanzare tutte le automobili di un chilometro).
Si supponga che thread multipli possano accedere allo stesso oggetto Highway.
Dei 25 punti, 8 sono riservati a coloro che implementeranno progress in tempo indipendente dal
numero di automobili presenti sull’autostrada.
Esempio d’uso:
    Highway h = new Highway(10);
    h.insertCar(3); h.insertCar(3); h.insertCar(5);
    System.out.println(h.nCars(4));
    h.progress() ;
    System.out.println(h.nCars(4));
Output:
    0
    2
 */

public class Main {
    public static void main(String[] args) {
        Highway h = new Highway(10);
        h.insertCar(3); h.insertCar(3); h.insertCar(5);
        System.out.println(h.nCars(4));
        h.progress();
        System.out.println(h.nCars(4));
    }
}
