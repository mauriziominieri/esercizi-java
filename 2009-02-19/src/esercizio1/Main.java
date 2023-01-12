package esercizio1;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
(Container, 2009-2-19)
Si implementi la classe Container, che rappresenta un contenitore per liquidi di dimensione fissata.
Ad un contenitore, inizialmente vuoto, si può aggiungere acqua con il metodo addWater, che
prende come argomento il numero di litri. Il metodo getAmount restituisce la quantità d’acqua
presente nel contenitore. Il metodo connect prende come argomento un altro contenitore, e lo
collega a questo con un tubo. Dopo il collegamento, la quantità d’acqua nei due contenitori (e
in tutti quelli ad essi collegati) sarà la stessa.
Esempio d’uso:
    Container a = new Container(), b = new Container(),
    c = new Container(), d = new Container();
    a.addWater(12);
    d.addWater(8);
    a.connect(b);
    System.out.println(a.getAmount()+"␣"+b.getAmount()+"␣"+
    c.getAmount()+"␣"+d.getAmount());
    b.connect(c);
    System.out.println(a.getAmount()+"␣"+b.getAmount()+"␣"+
    c.getAmount()+"␣"+d.getAmount());
    c.connect(d);
    System.out.println(a.getAmount()+"␣"+b.getAmount()+"␣"+
    c.getAmount()+"␣"+d.getAmount());
Output dell’esempio
d’uso:
    6.0 6.0 0.0 8.0
    4.0 4.0 4.0 8.0
    5.0 5.0 5.0 5.0
 */

public class Main {
    public static void main(String[] args) {
        Container a = new Container(), b = new Container(), c = new Container(), d = new Container();
        a.addWater(12);
        d.addWater(8);
        a.connect(b);
        System.out.println(a.getAmount()+" "+b.getAmount()+" "+c.getAmount()+" "+d.getAmount());
        b.connect(c);
        System.out.println(a.getAmount()+" "+b.getAmount()+" "+c.getAmount()+" "+d.getAmount());
        c.connect(d);
        System.out.println(a.getAmount()+" "+b.getAmount()+" "+c.getAmount()+" "+d.getAmount());
    }
}
