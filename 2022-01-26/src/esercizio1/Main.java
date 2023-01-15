package esercizio1;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
(Exchange, 2022-1-26)
Realizzare la classe Exchange che rappresenta una borsa valori. Il metodo setPrice imposta il
prezzo corrente di un titolo quotato. Il metodo addLowAlert fa in modo che un dato runnable
venga eseguito la prima volta che il prezzo di un dato titolo raggiunge o scende sotto una data
soglia. Il runnable viene eseguito immediatamente se il prezzo di quel titolo è già inferiore o
uguale alla soglia. Simmetricamente, il metodo addHighAlert offre lo stesso servizio, quando il
prezzo raggiunge o sale al di sopra di una data soglia. E’ possibile impostare più alert per lo
stesso titolo, con soglie diverse o uguali tra loro.
La classe Exchange deve essere thread-safe.
L’implementazione deve rispettare il seguente esempio d’uso.
Esempio d’uso:
    Exchange borsa = new Exchange();
    borsa.setPrice("MaxiCom", 10.56);
    borsa.setPrice("MegaCorp", 18.2);
    borsa.setPrice("SuperMarkt", 3.91);
    borsa.addLowAlert("MegaCorp", 17.5, () −> { System.out.println("Below␣the␣threshold!"); });
    borsa.addHighAlert("MaxiCom", 12, () −> { System.out.println("More␣than␣12!"); });
    borsa.addHighAlert("MaxiCom", 20.5, () −> { System.out.println("More␣than␣20.5!"); });
    borsa.setPrice("MaxiCom", 12.3);
Output:
    More than 12!
 */

public class Main {
    public static void main(String[] args) {
        Exchange borsa = new Exchange();
        borsa.setPrice("MaxiCom", 10.56);
        borsa.setPrice("MegaCorp", 18.2);
        borsa.setPrice("SuperMarkt", 3.91);
        borsa.addLowAlert("MegaCorp", 17.5, () -> { System.out.println("Below the threshold!"); });
        borsa.addHighAlert("MaxiCom", 12, () -> { System.out.println("More than 12!"); });
        borsa.addHighAlert("MaxiCom", 20.5, () -> { System.out.println("More than 20.5!"); });
        borsa.setPrice("MaxiCom", 12.3);
    }
}
