package esercizio1;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
(Shape, 2014-4-28)
Per un programma di geometria piana, realizzare la classe astratta Shape e la
sottoclasse concreta Circle. La classe Shape dispone dei metodi width, height, posX e posY, che
restituiscono rispettivamente la larghezza, l’altezza, la posizione sulle ascisse e la posizione sulle
ordinate del più piccolo rettangolo che contiene interamente la figura in questione (le coordinate
restituite da posX e posY si riferiscono all’angolo in basso a sinistra del rettangolo).
Il costruttore di Circle accetta le coordinate del centro e il raggio, mentre il metodo setRadius
consente di modificare il raggio.
Inoltre, le classi offrono le seguenti funzionalità:
a) Gli oggetti Circle sono uguali secondo equals se hanno lo stesso centro e lo stesso raggio.
b) Gli oggetti Shape sono clonabili.
c) Gli oggetti Shape sono dotati di ordinamento naturale, sulla base dell’area del rettangolo
che contiene la figura.
Esempio d’uso:
    Shape c1 = new Circle(2.0, 3.0, 1.0) ;
    Shape c2 = c1.clone();
    System.out.println(c1.posX() + ",␣" + c1.posY());
    System.out.println(c1.width() + ",␣" + c1.height());
    System.out.println(c1.equals(c2));
    (( Circle ) c2).setRadius(2.0);
    System.out.println(c2.posX() + ",␣" + c2.posY());
Output:
    1.0, 2.0
    2.0, 2.0
    true
    0.0, 1.0
 */

public class Main {
    public static void main(String[] args) {
        Shape c1 = new Circle(2.0, 3.0, 1.0) ;
        Shape c2 = c1.clone();
        System.out.println(c1.posX() + ", " + c1.posY());
        System.out.println(c1.width() + ", " + c1.height());
        System.out.println(c1.equals(c2));
        (( Circle ) c2).setRadius(2.0);
        System.out.println(c2.posX() + ", " + c2.posY());
    }
}
