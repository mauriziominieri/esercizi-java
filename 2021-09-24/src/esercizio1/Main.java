package esercizio1;

/**
 * @author Maurizio Minieri
 * mauminieri@gmail.com
 * www.mauriziominieri.it 
 **/

/*
  Realizzare le classi Radio e Channel che rappresentano una radio e una stazione radiofonica.
  La classe radio offre un costruttore senza argomenti e i seguenti metodi:
  	- addChannel: memorizza e restituisce una nuova stazione, caratterizzata da nome e frequenza.
  	  Il tentativo di memorizzare una stazione che ha la stessa frequenza di una stazione già memorizzata deve 
  	  provocare un'eccezione.
  	- nearest: accetta una frequenza e restituisce la stazione con a frequenza più vicina a quella data
  Inoltre, se si itera su un oggetto Radio si ottiene la sequenza di stazioni inserite, in ordine crescente di frequenza.
  Fare in modo che l'unico modo per creare oggetti Channel sia tramite il metodo addChannel.
*/

public class Main {
	public static void main(String[] args) {
		Radio r = new Radio();
		Radio.Channel rai1 = r.addChannel("Rai Radio Uno", 89.3);
		Radio.Channel kk = r.addChannel("Radio Kiss Kiss", 101.4);
		Radio.Channel rmc = r.addChannel("Radio Monte Carlo", 96.4);
		for (Radio.Channel c : r) {
			System.out.println(c);
		}
		System.out.println(r.nearest(98.1));
	}
}
