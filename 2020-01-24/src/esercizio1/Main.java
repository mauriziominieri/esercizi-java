package esercizio1;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
Nell’ambito di un sistema di commercio elettronico, implementare le classi Product e Cart (carrello
della spesa). Un prodotto è caratterizzato da descrizione e prezzo. Il tentativo di istanziare due
oggetti prodotto con la stessa descrizione deve produrre un’eccezione.
Un carrello può contenere diversi prodotti, compresi eventuali duplicati, ed offre le seguenti funzionalità:
• Aggiungere un prodotto
• Rimuovere un prodotto
• Conoscere il prezzo totale dei prodotti inseriti
L’implementazione deve rispettare il seguente caso d’uso:
Esempio d’uso:
    Product sedia = new Product("Sedia␣elegante", 100);
    Product tavolo = new Product("Tavolo␣di␣cristallo", 200);
    Cart cart = new Cart();
    cart.add(sedia);
    cart.add(tavolo);
    cart.add(sedia);
    System.out.println(cart. totalPrice ());
    cart.remove(sedia);
    System.out.println(cart. totalPrice ());
    Product sedia2 = new Product("Sedia␣elegante", 150);
Output:
    400
    300
    Exception in thread "main"...
 */

public class Main {
    public static void main(String[] args) {
        Product sedia = new Product("Sedia elegante", 100);
        Product tavolo = new Product("Tavolo di cristallo", 200);
        Cart cart = new Cart();
        cart.add(sedia);
        cart.add(tavolo);
        cart.add(sedia);
        System.out.println(cart.totalPrice());
        cart.remove(sedia);
        System.out.println(cart.totalPrice());
        Product sedia2 = new Product("Sedia elegante", 150);
    }
}
