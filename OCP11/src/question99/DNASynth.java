package question99;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*  TODO: 3 righe inserite alla line 1 modificano variabili di istanza, non 2...
Which two lines of code when inserted in line 1 correctly modifies instance variables?
    1. aCount = a;
    2. setGCount(g);
 */
public class DNASynth {
    int aCount;
    int tCount;
    int cCount;
    int gCount;

    DNASynth(int a, int tCount, int c, int g) {
        // line 1
        aCount = a;
        tCount = tCount;
        cCount = setCCount(c); // in realtà la modifica, ma bo, la escluderei perché restituisce e poi modifico (?)
        setGCount(g);
//        setCCount(c) = cCount;
    }
    int setCCount(int c) {
        return c;
    }
    void setGCount(int gCount) {
        this.gCount = gCount;
    }

    public static void main(String[] args) {
        DNASynth dna = new DNASynth(0, 0, 0, 0);
        System.out.println("int aCount: " + dna.aCount +
                "    int tCount: " + dna.tCount +
                "    int cCount: " + dna.cCount +
                "    int gCount: " + dna.gCount);

        DNASynth dna1 = new DNASynth(1, 2, 3, 4);
        System.out.println("int aCount: " + dna1.aCount +
                "    int tCount: " + dna1.tCount +
                "    int cCount: " + dna1.cCount +
                "    int gCount: " + dna1.gCount);
    }
}