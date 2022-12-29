package esercizio1;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class ParkingLot {

    private int m;

    private int n;

    private int[][] mat;

    private Date date;

    public ParkingLot(int m, int n) {
        this.m = m;
        this.n = n;
        mat = new int[m][n];
    }

    public Pair<Integer> carIn() {
        for(int i = 0; i < m; i++)
            for(int j = 0; j < n; j++)
                if(this.mat[i][j] == 0) {
                    this.mat[i][j] = 1;
                    this.date = new Date();
                    return new Pair<>(i, j);
                }
//        throw new RuntimeException("Parcheggio pieno");
        return null;
    }

    public int carOut(Pair<Integer> pair) {
        try {
            if (mat[pair.getX()][pair.getY()] == 0)
                return -1;   // dalla traccia vuole null, ma restituisce un intero
            long diffInMillies = Math.abs(new Date().getTime() - this.date.getTime());
            int diffInSeconds = (int) (diffInMillies / 1000);
            return diffInSeconds;
        }
        catch(ArrayIndexOutOfBoundsException e) {
            throw new RuntimeException("Coordinate non valide");
        }
    }
}
