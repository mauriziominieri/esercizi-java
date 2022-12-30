package esercizio1b;

import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
(Spartito, 2006-7-17)
Nel contesto di un software per la composizione musicale, si implementi una classe Nota, e una
classe Spartito. Ciascuna nota ha un nome e una durata. La durata può essere soltanto di 1, 2,
oppure 4 unità di tempo (semiminima, minima oppure semibreve). Uno spartito è una sequenza
di note, tale che più note possono cominciare (o terminare) nello stesso istante. Il metodo add
della classe Spartito prende come argomento una nota ed un istante di tempo t, ed aggiunge la
nota allo spartito, a partire dal tempo t. Quando si itera su uno spartito, ad ogni chiamata a
next viene restituito l’insieme di note presenti nell’unità di tempo corrente.
Implementare tutti i metodi necessari a rispettare il seguente caso d’uso.
public static void main(String[] x) {
    Spartito fuga = new Spartito();
    fuga.add(new Nota(‘‘Do’’, 4), 0);
    fuga.add(new Nota(‘‘Mi’’, 1), 0);
    fuga.add(new Nota(‘‘Mib’’, 2), 1);
    fuga.add(new Nota(‘‘Sol’’, 2), 2);
    for (Set<Nota> accordo : fuga)
        System.out.println(accordo);
}
Output del codice precedente:
    Do, Mi
    Do, Mib
    Do, Mib, Sol
    Do, Sol
 */

public class Main {
    public static void main(String[] args) {
        Spartito fuga = new Spartito();
        fuga.add(new Nota("Do", 4), 0);
        fuga.add(new Nota("Mi", 1), 0);
        fuga.add(new Nota("Mib", 2), 1);
        fuga.add(new Nota("Sol", 2), 2);
        // capisco che la classe Spartito deve implementare l'interfaccia Iterable che ci permette di rendere le sue istanze "scorribili" grazie al metodo iterator()
        // infatti fuga (che generalmente è una lista) per scorrere nel foreach usa i metodi hasNext(), che controlla se il for deve iterare
        // e il metodo next() che restituisce l'elemento (nel nostro caso un Set<Nota>)
        for (Set<Nota> accordo : fuga)
            System.out.println(accordo);
    }
}
