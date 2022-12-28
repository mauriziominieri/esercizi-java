package esercizio1;

import static esercizio1.Piece.print_board;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
(Tetris, 2010-7-26)
Il Tetris è un videogioco il cui scopo è incastrare tra loro pezzi bidimensionali di 7 forme predefinite, all’interno di uno schema rettangolare. Implementare la classe astratta Piece, che rappresenta
un generico pezzo, e le sottoclassi concrete T ed L, che rappresentano i pezzi dalla forma omonima.
La classe Piece deve offrire i metodi put, che aggiunge questo pezzo alle coordinate date di un
dato schema, e il metodo rotate, che ruota il pezzo di 90 gradi in senso orario (senza modificare
alcuno schema). Il metodo put deve lanciare un’eccezione se non c’è posto per questo pezzo alle
coordinate date. Uno schema viene rappresentato da un array bidimensionale di valori booleani
(false per libero, true per occupato).
E’ opportuno raccogliere quante più funzionalità è possibile all’interno della classe Piece. Il
seguente caso d’uso assume che print_board sia un opportuno metodo per stampare uno schema.
Esempio d’uso:
    boolean board[][] = new boolean[5][12];
    Piece p1 = new T();
    p1.put(board, 0, 0);
    Piece p2 = new L();
    p2.put(board, 0, 4);
    print_board(board);
    p2.rotate () ;
    p2.put(board, 2, 7);
    print_board(board);
Output dell’esempio d’uso:
    --------------------------
    X X
    XXX X
    XX
    --------------------------
    X X
    XXX X
    XX XXX
    X
 */

public class Main {
    public static void main(String[] args) {
        boolean board[][] = new boolean[5][12];
        Piece p1 = new T();
        p1.put(board, 0, 0);
        Piece p2 = new L();
        p2.put(board, 0, 4);
        print_board(board);
        p2.rotate();
        p2.put(board, 2, 7);
        print_board(board);
    }
}
