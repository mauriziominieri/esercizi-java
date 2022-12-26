package esercizio1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class Product {

    private String descrizione;

    private final int prezzo;

    private static List<String> descriptionList = new ArrayList<>();

    public Product(String descrizione, int prezzo) {

        if (descriptionList.contains(descrizione))
            throw new RuntimeException("Tentativo di istanziare due oggetti prodotto con la stessa descrizione");
        else
            descriptionList.add(descrizione);

        this.descrizione = descrizione;
        this.prezzo = prezzo;
    }

    public int getPrezzo() {
        return prezzo;
    }
}
