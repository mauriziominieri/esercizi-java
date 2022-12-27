package esercizio1;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class L extends Piece {

    @Override
    public void put(boolean[][] board, int x, int y) {
        try {
            switch (direction) {
                case UP -> {
                    check(board, x, y);
                    check(board, x + 1, y);
                    check(board, x + 2, y);
                    check(board, x + 2, y + 1);
                }
                case RIGHT -> {
                    check(board, x, y);
                    check(board, x, y + 1);
                    check(board, x, y + 2);
                    check(board, x + 1, y);
                }
                case BOTTOM -> {
                    check(board, x, y);
                    check(board, x, y + 1);
                    check(board, x + 1, y + 1);
                    check(board, x + 2, y + 1);
                }
                case LEFT -> {
                    check(board, x, y + 2);
                    check(board, x + 1, y);
                    check(board, x + 1, y + 1);
                    check(board, x + 1, y + 2);
                }
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            throw new RuntimeException("Non c'è posto per il pezzo alle coordinate (" + x + ", " + y + ")");
        }
    }
}
