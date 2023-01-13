package esercizio1;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
(Recipe, 2008-1-30)
Si implementi una classe Recipe che rappresenta una ricetta. Il costruttore accetta il nome della
ricetta. Il metodo setDescr imposta la descrizione della ricetta. Il metodo addIngr aggiunge
un ingrediente alla ricetta, prendendo come primo argomento la quantità (anche frazionaria)
dell’ingrediente, per una persona, e come secondo argomento una stringa che contiene l’unità di
misura e il nome dell’ingrediente. Se un ingrediente è difficilmente misurabile, si imposterà la
sua quantità a zero, e verrà visualizzato come “q.b.” (“quanto basta”). Il metodo toString prende
come argomento il numero di coperti n e restituisce una stringa che rappresenta la ricetta, in cui
le quantità degli ingredienti sono state moltiplicate per n.
Esempio d’uso:
    Recipe r = new Recipe("Spaghetti␣aglio␣e␣olio");
    r.addIngr(100, "grammi␣di␣spaghetti");
    r.addIngr(2, "cucchiai␣d’ olio ␣d’ oliva ");
    r.addIngr(1, "spicchi␣d’ aglio");
    r.addIngr(0, "sale");
    r.setDescr("Mischiare␣tutti␣ gli ␣ingredienti ␣e␣servire .");
    System.out.println(r. toString(4));
Output dell’esempio d’uso:
    Spaghetti aglio e olio

    Ingredienti per 4 persone:
    400 grammi di spaghetti
    8 cucchiai d’olio d’oliva
    4 spicchi d’aglio
    q.b. sale

    Preparazione:
    Mischiare tutti gli
    ingredienti e servire.
 */

public class Main {
    public static void main(String[] args) {
        Recipe r = new Recipe("Spaghetti aglio e olio");
        r.addIngr(100, "grammi di spaghetti");
        r.addIngr(2, "cucchiai d'olio d'oliva");
        r.addIngr(1, "spicchi d'aglio");
        r.addIngr(0, "sale");
        r.setDescr("Mischiare tutti gli ingredienti e servire.");
        System.out.println(r.toString(4));
    }
}
