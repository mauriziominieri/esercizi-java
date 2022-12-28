package esercizio1;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class Crosswords {

    private final int righe;

    private final int colonne;

    private final char[][] schema;

    private final char[][] schemaTemp;

    static boolean H;

    static boolean V = true;

    public Crosswords(int righe, int colonne) {
        this.righe = righe;
        this.colonne = colonne;
        schema = new char[righe][colonne];
        schemaTemp = new char[righe][colonne];
    }

    public boolean addWord(int x, int y, String word, boolean direction) {
//      faccio prima le prove sullo schemaTemp
        try {
            setStar(x, y, direction, -1, '*', schemaTemp);
            for(int i = 0; i < word.length(); i++) {
                if (getChar(x, y, direction, i) == '\0' || getChar(x, y, direction, i) == word.charAt(i))
                    setChar(x, y, direction, i, word.charAt(i), schemaTemp);
                else
                    return false;   // se trova una lettera differente (non incastrabile)
            }
            setStar(x, y, direction, word.length(), '*', schemaTemp);
        }
        catch (ArrayIndexOutOfBoundsException e) { return false; }

        // la parola è valida quindi la inserisco nello schema ufficiale
        setStar(x, y, direction, -1, '*', schema);
        for(int i = 0; i < word.length(); i++)
            setChar(x, y, direction, i, word.charAt(i), schema);
        setStar(x, y, direction, word.length(), '*', schema);
        return true;
    }

    public char getChar(int r, int c, boolean d, int x) {
        return d == H ? schema[r][c + x] : schema[r + x][c];
    }

    public void setChar(int r, int c, boolean d, int x, char character, char[][] schema) {
        if(d == H)
            schema[r][c + x] = character;
        else
            schema[r + x][c] = character;
    }

    // inserisce il carattere '*' prima e dopo la parola
    public void setStar(int r, int c, boolean d, int x, char character, char[][] schema) {
        if(d == H) {
            if (c + x == -1) return;    // se la parola inizia sul bordo sinistro (colonna 0) non ci vuole il '*'
            if (c + x == this.colonne) return;   // se la parola finisce sul bordo destro (colonna == this.colonne)
        }
        if(d == V) {
            if (r + x == -1) return;    // se la parola inizia sul bordo superiore (riga 0)
            if (r + x == this.righe) return;    // se la parola finisce sul bordo inferiore (riga == this.righe)
        }
        if (getChar(r, c, d, x) != '*' && getChar(r, c, d, x) != '\0')  // se provo ad inserirlo dove già c'è una lettera (non '*')
            throw new ArrayIndexOutOfBoundsException();
        setChar(r, c, d, x, character, schema);
    }

    @Override
    public String toString() {
        String s = "";
        for(int i = 0; i < 6; i++) {
            for(int j = 0; j < 8; j++)
                s = s + schema[i][j] + " ";
            s = s + "\n";
        }
        return s;
    }
}
