package esercizio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import esercizio1.Radio.Channel;

/**
 * @author Maurizio Minieri
 * mauminieri@gmail.com
 * www.mauriziominieri.it 
 **/

public class Radio implements Iterable<Channel> {
	
	private List<Channel> canali;
	
	public Radio() {
		canali = new ArrayList<>();
	}
	
	public Channel addChannel(String nome, double frequenza) {
		Channel c = new Channel(nome,frequenza);
		for (Channel channel : canali) {
			if(channel.getFrequenza() == frequenza)
				throw new RuntimeException("Frequenza già presente");
		}
		canali.add(c);
		return c;
	}
	
	public Channel nearest(double frequenza) {
		
		double minF = frequenza;
		Channel minC = null;
		
		for (Channel channel : canali) {
			if(Math.abs(channel.getFrequenza() - frequenza) < minF) {
				minC = channel;
				minF = Math.abs(channel.getFrequenza() - frequenza);
			}
		}
		return minC;
	}

	class Channel implements Comparable<Channel> {
		
		private String nome;
		private double frequenza;
		
		public Channel() {
			throw new RuntimeException("Puoi creare una stazione radiofonica solo attraverso addChannel()");
		}
		
		public Channel(String nome, double frequenza) {
			this.nome = nome;
			this.frequenza = frequenza;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public double getFrequenza() {
			return frequenza;
		}

		public void setFrequenza(double frequenza) {
			this.frequenza = frequenza;
		}

		@Override
		public String toString() {
			return nome + "(" + frequenza + ")";
		}

		@Override
		public int compareTo(Channel c) {
			return Double.compare(this.getFrequenza(), c.getFrequenza());
		}
	}

	@Override
	public Iterator<Channel> iterator() {
		Collections.sort(canali);
		return canali.iterator();
	}

}
