package esercizio1b;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
(CommonDividers, 2007-7-20)
Implementare una classe CommonDividers che rappresenta tutti i divisori comuni di due numeri
interi, forniti al costruttore. Su tale classe si deve poter iterare secondo il seguente caso d'uso.
Dei 30 punti, 15 sono riservati a coloro che realizzeranno l'iteratore senza usare spazio aggiuntivo.
Viene valutato positivamente l'uso di classi anonime laddove opportuno.
Esempio d'uso:
	for (Integer n: new CommonDividers(12, 60))
	System.out.print(n + " ");
Output dell'esempio d'uso:
	1 2 3 4 6 12
 */

public class Main {
    public static void main(String[] args) {
        for (Integer n: new CommonDividers(12, 60))
            System.out.print(n + " ");
    }
}
