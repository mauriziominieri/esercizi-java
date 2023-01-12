package esercizio1b;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
(UML, 2009-4-23)
Nell’ambito di un programma per la progettazione del software, si implementino la classi UMLClass e UMLAggregation, che rappresentano una classe ed una relazione di aggregazione, all’interno
di un diagramma delle classi UML. Il costruttore di UMLAggregation accetta le due classi tra le
quali vale l’aggregazione, la cardinalità minima e quella massima.
Esempio d’uso:
    UMLClass impianto = new UMLClass(‘‘Impianto’’);
    UMLClass apparecchio = new UMLClass(‘‘Apparecchio’’);
    UMLClass contatore = new UMLClass(‘‘Contatore’’);
    new UMLAggregation(apparecchio, impianto, 1, 1);
    new UMLAggregation(impianto, apparecchio, 0,
    UMLAggregation.INFINITY);
    new UMLAggregation(impianto, contatore, 0, 1);
    System.out.println(impianto);
Output dell’esempio d’uso:
    Classe: Impianto
    Aggregazioni:
    Impianto-Apparecchio,
        cardinalita’: 0..infinito
    Impianto-Contatore,
        cardinalita’: 0..1
 */

public class Main {
    public static void main(String[] args) {
        UMLClass impianto = new UMLClass("Impianto");
        UMLClass apparecchio = new UMLClass("Apparecchio");
        UMLClass contatore = new UMLClass("Contatore");
        new UMLAggregation(apparecchio, impianto, 1, 1);
        new UMLAggregation(impianto, apparecchio, 0, UMLAggregation.INFINITY);
        new UMLAggregation(impianto, contatore, 0, 1);
        System.out.println(impianto);
    }
}
