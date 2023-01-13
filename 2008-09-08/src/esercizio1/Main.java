package esercizio1;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
(PostIt, 2008-9-8)
Un oggetto di tipo PostIt rappresenta un breve messaggio incollato (cioè, collegato) ad un oggetto.
Il costruttore permette di specificare il messaggio e l’oggetto al quale incollarlo. Il metodo
statico getMessages prende come argomento un oggetto e restituisce l’elenco dei PostIt collegati
a quell’oggetto, sotto forma di una lista, oppure null se non c’è nessun PostIt collegato.
Esempio d’uso:
    Object frigorifero = new Object();
    Object libro = new Object();
    new PostIt( frigorifero , "comprare␣il␣latte");
    new PostIt(libro, "Bello !! ");
    new PostIt(libro, " restituire ␣a␣Carlo");
    List<PostIt> pl = PostIt.getMessages(libro);
    for (PostIt p: pl)
    System.out.println(p);
Output dell’esempio d’uso:
    Bello!!
    restituire a Carlo
 */

public class Main {
    public static void main(String[] args) {
        Object frigorifero = new Object();
        Object libro = new Object();
        new PostIt(frigorifero, "comprare il latte");
        new PostIt(libro, "Bello!!");
        new PostIt(libro, "restituire a Carlo");
        List<PostIt> pl = PostIt.getMessages(libro);
        for (PostIt p: pl)
            System.out.println(p);
    }
}
