package question18;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
Which two methods modify field values?
    1. setGCount
    2. setAllCounts
 */
class DNASynth {
    int aCount;
    int tCount;
    int cCount;
    int gCount;
    void setAcount(int cCount) {
        cCount = cCount;
    }
    void setTCount() {
        this.tCount = tCount;
    }
    int setCCount() {
        return cCount;
    }
    int setGCount(int g) {
        gCount = g;
        return gCount;
    }
    void setAllCounts(int x) {
        aCount = tCount = this.cCount = setGCount(x);
    }
}
public class Main {}