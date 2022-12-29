package esercizio1b;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
(TreeType, 2006-9-15)
Implementare le classi TreeType e Tree. TreeType rappresenta un tipo di albero (pino, melo, etc.),
mentre Tree rappresenta un particolare esemplare di albero. Ogni TreeType è caratterizzato dal
suo nome. Ogni Tree ha un tipo base ed eventualmente degli innesti di altri tipi di alberi. Il
metodo addGraft di Tree aggiunge un innesto ad un albero, purchèE non sia dello stesso tipo
dell’albero stesso. Il metodo getCounter di Tree restituisce il numero di alberi che sono stati
creati. Il metodo getCounter di TreeType restituisce il numero di alberi di quel tipo che sono stati
creati. (32 punti)
Ridefinire il metodo clone di Tree, facendo attenzione ad eseguire una copia profonda laddove sia
necessario. (8 punti)
Esempio d’uso:
    TreeType melo = new TreeType("melo");
    TreeType pero = new TreeType("pero");
    Tree unMelo = new Tree(melo);
    Tree unAltroMelo = new Tree(melo);
    unAltroMelo.addGraft(pero);
    unAltroMelo.addGraft(pero);
    System.out.println("Sono stati creati " + melo.getCounter() + " meli fino a questo momento.");
    System.out.println("Sono stati creati " + Tree.getCounter() + " alberi fino a questo momento.");
    System.out.println(unAltroMelo);
    unAltroMelo.addGraft(melo);
Output dell’esempio d’uso:
    Sono stati creati 2 meli fino a questo momento.
    Sono stati creati 2 alberi fino a questo momento.

    tipo: melo
    innesti:
    pero

    Exception in thread "main":
    java.lang.RuntimeException
 */

public class Main {
    public static void main(String[] args) {
        TreeType melo = new TreeType("melo");
        TreeType pero = new TreeType("pero");
        Tree unMelo = new Tree(melo);
        Tree unAltroMelo = new Tree(melo);
        unAltroMelo.addGraft(pero);
        unAltroMelo.addGraft(pero);
        System.out.println("Sono stati creati " + melo.getCounter() + " meli fino a questo momento.");
        System.out.println("Sono stati creati " + Tree.getCounter() + " alberi fino a questo momento.");
        System.out.println(unAltroMelo);
        unAltroMelo.addGraft(melo);
    }
}
