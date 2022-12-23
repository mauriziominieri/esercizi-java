package esercizio1;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
Realizzare la classe Engine, che rappresenta un motore a combustione, caratterizzato da cilindrata (in cm3
) e potenza (in cavalli). Normalmente, due oggetti Engine sono uguali
se hanno la stessa cilindrata e la stessa potenza. Il metodo byVolume converte questo Engine in
modo che venga confrontata solo la cilindrata. Analogamente, il metodo byPower converte questo
Engine in modo che venga confrontata solo la potenza.
L’implementazione deve rispettare il seguente esempio d’uso.
Esempio d’uso:
    Engine a = new Engine(1200, 69), b = new Engine(1200, 75), c =
    new Engine(1400, 75);
    System.out.println(a);
    System.out.println(a.equals(b));
    Engine aVol = a.byVolume(), bVol = b.byVolume();
    System.out.println(aVol);
    System.out.println(aVol.equals(bVol));
    System.out.println(a==aVol);
    Engine bPow = b.byPower(), cPow = c.byPower();
    System.out.println(bPow);
    System.out.println(bPow.equals(cPow));
Output:
    (1200.0 cm3, 69.0 CV)
    false
    (1200.0 cm3, 69.0 CV)
    true
    false
    (1200.0 cm3, 75.0 CV)
    true
 */

public class Main {
    public static void main(String[] args) {
        Engine a = new Engine(1200, 69), b = new Engine(1200, 75), c = new Engine(1400, 75);
        System.out.println(a);
        System.out.println(a.equals(b));
        Engine aVol = a.byVolume(), bVol = b.byVolume();
        System.out.println(aVol);
        System.out.println(aVol.equals(bVol));
        System.out.println(a==aVol);
        Engine bPow = b.byPower(), cPow = c.byPower();
        System.out.println(bPow);
        System.out.println(bPow.equals(cPow));
    }
}
