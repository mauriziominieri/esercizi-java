package esercizio1;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
(Component e Configuration, 2018-10-18)
Un sito vuole consentire agli utenti di ordinare computer assemblati. Data l’enumerazione:
enum Type { CPU, BOARD, RAM; }
implementare le classi Component, che rappresenta un componente di un PC, e Configuration, che
rappresenta un PC da assemblare.
Un componente è caratterizzato dalla sua tipologia (Type) e da una descrizione (stringa). Il suo
metodo setIncompatible dichiara che questo componente è incompatibile con un altro componente,
passato come argomento. Un componente può essere incompatibile con diversi altri componenti.
Il metodo add di Configuration aggiunge un componente a questo PC e restituisce true, ma solo
se il componente è compatibile con quelli già inseriti, ed è di tipo diverso da quelli già inseriti,
altrimenti non lo inserisce e restituisce false.
Suggerimento: Una classe Component ben progettata non nominerà le 3 istanze di Type.
L’implementazione deve rispettare il seguente esempio d’uso.
Esempio d’uso:
    Component cpu1 = new Component(Type.CPU, "Ryzen␣5␣2600"),
    cpu2 = new Component(Type.CPU, "Core␣i5␣7500"),
    board1 = new Component(Type.BOARD, "Prime␣X470"),
    board2 = new Component(Type.BOARD, "Prime␣Z370"),
    ram = new Component(Type.RAM, "DDR4␣8GB");
    cpu1.setIncompatible(board2);
    board1.setIncompatible(cpu2);
    Configuration pc = new Configuration();
    System.out.println(pc.add(cpu1));
    System.out.println(pc.add(cpu2)); // due cpu!
    System.out.println(pc.add(board2)); // incompatibile !
    System.out.println(pc.add(board1));
    System.out.println(pc.add(ram));
Output:
    true
    false
    false
    true
    true
 */

public class Main {
    public static void main(String[] args) {
        Component cpu1 = new Component(Type.CPU, "Ryzen 5 2600"),
                cpu2 = new Component(Type.CPU, "Core i5 7500"),
                board1 = new Component(Type.BOARD, "Prime X470"),
                board2 = new Component(Type.BOARD, "Prime Z370"),
                ram = new Component(Type.RAM, "DDR4 8GB");
        cpu1.setIncompatible(board2);
        board1.setIncompatible(cpu2);
        Configuration pc = new Configuration();
        System.out.println(pc.add(cpu1));
        System.out.println(pc.add(cpu2));   // due cpu!
        System.out.println(pc.add(board2)); // incompatibile !
        System.out.println(pc.add(board1));
        System.out.println(pc.add(ram));
    }
}
