package esercizio1b;

/*
(Version, 2010-2-24)
La classe Version rappresenta una versione di un programma. Una versione può avere due o tre
parti intere ed, opzionalmente, un'etichetta alpha o beta. (15 punti)
La classe Version deve implementare l'interfaccia Comparable<Version>, in modo che una versione
sia minore di un'altra se la sua numerazione è precedente a quella dell'altra. Le etichette alpha
e beta non inuiscono sull'ordinamento. (12 punti)
Rispettare il seguente caso d'uso, compreso il formato dell'output.
Esempio d'uso:
    Version v1 = new Version(1, 0);
    Version v2 = new Version(2, 4, Version.alpha);
    Version v3 = new Version(2, 6, 33);
    Version v4 = new Version(2, 6, 34, Version.beta);
    System.out.println(v1);
    System.out.println(v2);
    System.out.println(v3);
    System.out.println(v4);
    System.out.println(v1.compareTo(v2));
    System.out.println(v4.compareTo(v3));
Output dell'esempio d'uso:
    1.0
    2.4alpha
    2.6.33
    2.6.34beta
    -1
    1
 */

public class Main {
    public static void main(String[] args) {
        Version v1 = new Version(1, 0);
        Version v2 = new Version(2, 4, Version.alpha);
        Version v3 = new Version(2, 6, 33);
        Version v4 = new Version(2, 6, 34, Version.beta);
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
        System.out.println(v4);
        System.out.println(v1.compareTo(v2));
        System.out.println(v4.compareTo(v3));
    }
}
