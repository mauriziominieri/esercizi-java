package esercizio1;

import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
(Bug, 2018-1-24)
Realizzare la classe Bug, che rappresenta un errore in un programma. Il costruttore accetta
una descrizione dell’errore. Inizialmente, l’errore non è assegnato ad alcuno sviluppatore. Il
metodo assignTo assegna l’errore ad uno sviluppatore, identificato dal nome, che sarà incaricato
di risolvere l’errore.
Il metodo statico getUnassigned restituisce in tempo costante l’insieme degli errori non ancora
assegnati. Il metodo statico getAssignedTo restituisce in tempo costante l’insieme degli errori
assegnati ad uno sviluppatore dato.
Nota: un bug assegnato ad uno sviluppatore può essere riassegnato ad un altro.
L’implementazione deve rispettare il seguente esempio d’uso:
Esempio d’uso:
    Bug b1 = new Bug("Application␣crashes␣on␣Windows␣8"),
    b2 = new Bug("Application␣freezes␣after␣2␣hours"),
    b3 = new Bug("Application␣does␣not␣print␣on␣laser␣
    printer"),
    b4 = new Bug("Data␣missing␣after␣partial␣save");
    Set<Bug> unassigned = Bug.getUnassigned();
    System.out.println(unassigned.size ());
    b2.assignTo("Paolo");
    b3.assignTo("Filomena");
    b4.assignTo("Filomena");
    System.out.println(unassigned.size ());
    Set<Bug> filo = Bug.getAssignedTo("Filomena");
    System.out.println( filo );
Output:
    4
    1
    [("Data missing after partial save", assigned to Filomena), ("Application does not print on laser printer", assigned to Filomena)]
 */

public class Main {
    public static void main(String[] args) {
        Bug b1 = new Bug("Application crashes on Windows 8"),
            b2 = new Bug("Application freezes after 2 hours"),
            b3 = new Bug("Application does not print on laser printer"),
            b4 = new Bug("Data missing after partial save");
        Set<Bug> unassigned = Bug.getUnassigned();
        System.out.println(unassigned.size());
        b2.assignTo("Paolo");
        b3.assignTo("Filomena");
        b4.assignTo("Filomena");
        System.out.println(unassigned.size());
        Set<Bug> filo = Bug.getAssignedTo("Filomena");
        System.out.println( filo );
    }
}
