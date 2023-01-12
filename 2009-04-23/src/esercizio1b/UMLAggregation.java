package esercizio1b;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class UMLAggregation {

    static int INFINITY = -1;

    public UMLAggregation(UMLClass umlClass1, UMLClass umlClass2, int cardMin, int cardMax) {
        umlClass1.relatedClassMinMap.put(umlClass2.name, cardMin);
        umlClass1.relatedClassMaxMap.put(umlClass2.name, cardMax);
    }
}
