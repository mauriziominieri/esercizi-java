package esercizio1;

/**
 * @author Maurizio Minieri
 * mauminieri@gmail.com
 * www.mauriziominieri.it 
 **/

/*
40 punti
Realizzare le classi WiFi e Network, che rappresentano un clenco di reti WiFi e una singola rete.
La classe WiFi offre un costruttore senza argomenti e i seguenti metodi:
	• addNetwork: memorizza e restituisce una nuova rete, caratterizzata da nome (SSID) e intensità del segnale.
	• strongest: restituisce la rete con l'intensità più alta (più vicina allo zero).
Inoltre, gli oggetti WiFi devono essere iterabili, dando la poesibilità di scorrere le reti inserite, in ordine di intensità decrescente.
La classe Network offre soltanto il metodo updateStrength, che aggiorna l'intensità del segnale.
Fare in modo che l'unico modo per creare oggetti Network sia tramite il metodo addNetwork.
L'implementazione deve rispettare il seguente esempio d'uso.

Esempio d'uso:
	WiFi manager = new WiFi();
	WiFi.Network home = manager.addNetwork("Vodafone",-40.5);
	WiFi.Network hotel = manager.addNetwork("Hotel, Vesuvio", -53.05);
	WiFi.Network neighbor = manager.addNetwork("Casa Esposito",-48.95);
	neighbor.updateStrength(-39.6);
	WiFi.Network x = manager.strongest();
	System.out.println(x);
Output:
	Casa Esposito (-39.6 dBa)
*/

public class Main {
	public static void main(String[] args) {
		WiFi manager = new WiFi();
		WiFi.Network home = manager.addNetwork("Vodafone",-40.5);
		WiFi.Network hotel = manager.addNetwork("Hotel Vesuvio", -53.05);
		WiFi.Network neighbor = manager.addNetwork("Casa Esposito",-48.95);
		neighbor.updateStrength(-39.6);
		WiFi.Network x = manager.strongest();
		System.out.println(x);
	}
}
