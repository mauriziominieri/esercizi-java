package esercizio1;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
(Wall, 2010-2-24)
La classe Wall rappresenta un muro di mattoni, ciascuno lungo 10cm, poggiati l’uno sull’altro. Il
costruttore accetta l’altezza massima (in file di mattoni) e la larghezza massima (in cm) del muro.
Il metodo addBrick aggiunge un mattone alla fila e alla posizione (in cm) specificata, restituendo
un oggetto di tipo Brick. Il metodo isStable della classe Brick restituisce vero se in quel momento
questo mattone è in una posizione stabile, indipendentemente dai mattoni eventualmente poggiati
sopra di esso.
Esempio d’uso:
    Wall w = new Wall(10, 100);
    w.addBrick(0,10);
    w.addBrick(0,30);
    Wall.Brick b3 = w.addBrick(1,2);
    Wall.Brick b4 = w.addBrick(1,13);
    Wall.Brick b5 = w.addBrick(1,36);
    System.out.println(b3.isStable ());
    System.out.println(b4.isStable ());
    System.out.println(b5.isStable ());
    w.addBrick(0,45);
    System.out.println(b5.isStable ());
Output dell’esempio d’uso: (Nota: l’esempio è accompagnato da una figura alla lavagna)
    false
    true
    false
    true
 */

public class Main {
    public static void main(String[] args) {
        Wall w = new Wall(10, 100);
        Wall.Brick b1 = w.addBrick(0,10);
        Wall.Brick b2 = w.addBrick(0,30);
        Wall.Brick b3 = w.addBrick(1,2);
        Wall.Brick b4 = w.addBrick(1,13);
        Wall.Brick b5 = w.addBrick(1,36);
        System.out.println(b3.isStable());
        System.out.println(b4.isStable());
        System.out.println(b5.isStable());
        Wall.Brick b6 = w.addBrick(0,45);
        System.out.println(b5.isStable());
    }
}
