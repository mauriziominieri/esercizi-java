package esercizio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import esercizio1.WiFi.Network;

/**
 * @author Maurizio Minieri
 * mauminieri@gmail.com
 * www.mauriziominieri.it 
 **/

public class WiFi implements Iterable<Network> {
	
	private List<Network> segnali;
   
	public WiFi() {
		segnali = new ArrayList<>();    
	}
	
	public Network addNetwork(String nome, double segnale) {
		Network network = new Network(nome,segnale);
		segnali.add(network);
		Collections.sort(segnali);
		return network;
	}
	
	public Network strongest() {
		return segnali.get(0);
	}
	
	class Network implements Comparable<Network> {
		
		private String nome;
		private double segnale;
		
		public Network() {
			throw new RuntimeException("Errore, devi usare il metodo addNetwork");
		}
		
		public Network(String nome, double segnale) {
			this.nome = nome;
			this.segnale = segnale;
		}

		public double getSegnale() {
			return segnale;
		}

		public void setSegnale(double segnale) {
			this.segnale = segnale;
		}

		public void updateStrength(double segnale) {
			segnali.remove(this);
			this.setSegnale(segnale);
			segnali.add(this);
			Collections.sort(segnali);
		}
		
		@Override
		public String toString() {
			return nome + " (" + segnale + " dBm)";
		}

		@Override
		public int compareTo(Network n) {
			return Double.compare(n.getSegnale(), this.getSegnale());
		}
	}

	@Override
	public Iterator<Network> iterator() {
		return segnali.iterator();
	}
}
