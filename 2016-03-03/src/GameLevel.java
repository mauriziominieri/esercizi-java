/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class GameLevel {

    private int larghezza;

    private int altezza;

    private int[][] mat;

    public GameLevel(int larghezza, int altezza) {
        this.larghezza = larghezza;
        this.altezza = altezza;
        mat = new int[altezza][larghezza];
    }

    public void setWall(int x, int y) {
        if(x < 0 || y < 0 || x >= altezza || y >= larghezza)
            throw new RuntimeException("Coordinate non valide");
        mat[x][y] = 1;
    }

    // ogni chiamata ad areConnected deve usare una matrice "vuota", fatta da tutti 0 e i muri (1), se usassi this.mat allora
    // avrei il percorso fatto (tutti i -1) già salvato dalla chiamata precedente fatta dal main
    public boolean areConnected(int x1, int y1, int x2, int y2) {
        int[][] mat2 = new int[altezza][larghezza];
        return areConnectedR(x1, y1, x2, y2, mat2);
    }

    // se negli if facessi direttamente return areConnectedR accadrebbe che per il percorso (0, 0, 0, 2) con un muro in (0, 1) avrei false.
    // con questi controlli invece dopo aver percorso (1, 0) (1, 1) (1, 2) (2, 2) (2, 1) (2, 0) e tornato indietro con la ricorsione in (1, 2)
    // andrò nell'ultimo if che mi porta all'obiettivo e restituirò true.
    public boolean areConnectedR(int x1, int y1, int x2, int y2, int[][] mat2) {
        boolean response = false;
        mat2[x1][y1] = -1;
        if(x1 == x2 && y1 == y2)
            return true;
        if(isValid(x1, y1 + 1, mat2))   // RIGHT
            response = areConnectedR(x1, y1 + 1, x2, y2, mat2);
        if(!response && isValid(x1 + 1, y1, mat2))  // BOTTOM
            response = areConnectedR(x1 + 1, y1, x2, y2, mat2);
        if(!response && isValid(x1, y1 - 1, mat2))  // LEFT
            response = areConnectedR(x1, y1 - 1, x2, y2, mat2);
        if(!response && isValid(x1 - 1, y1, mat2))  // UP
            response = areConnectedR(x1 - 1, y1, x2, y2, mat2);
        return response;
    }

    public boolean isValid(int x, int y, int[][] mat2){
        return x >= 0 && y >= 0 && x < altezza && y < larghezza && mat[x][y] == 0 && mat2[x][y] == 0;
    }
}
