package esercizio1;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public abstract class Piece {

    Direction direction;    // package-private

    public Piece() {
        direction = Direction.UP;
    }

    public abstract void put(boolean board[][], int x, int y);

    public void rotate() {
        switch(direction) {
            case UP -> direction = Direction.RIGHT;
            case RIGHT -> direction = Direction.BOTTOM;
            case BOTTOM -> direction = Direction.LEFT;
            case LEFT -> direction = Direction.UP;
        }
    }

    // controlla se una cella della board è già true (se già è presente una parte di un Piece)
    public void check(boolean[][] board, int x, int y) {
        if(board[x][y])
            throw new ArrayIndexOutOfBoundsException();
        board[x][y] = true;
    }

    public static void print_board(boolean board[][]) {
        for(int i = 0; i < 36; i++)
            System.out.print("-");
        System.out.println();
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 12; j++) {
                if(board[i][j]) System.out.print(" X ");
                else System.out.print(" - ");
            }
            System.out.println();
        }
    }
}
