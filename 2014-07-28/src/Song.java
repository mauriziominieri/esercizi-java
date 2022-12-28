import java.util.*;

/*
(Playlist, 2014-7-28)
Implementare le classi Song e Playlist. Una canzone è caratterizzata dal nome e dalla durata in
secondi. Una playlist è una lista di canzoni, compresi eventuali duplicati, ed offre il metodo add,
che aggiunge una canzone in coda alla lista, e remove, che rimuove tutte le occorrenze di una
canzone dalla lista. Infine, la classe Playlist è dotata di ordinamento naturale basato sulla durata
totale di ciascuna playlist.
Sono preferibili le implementazioni in cui il confronto tra due playlist avvenga in tempo costante.
Esempio d'uso:
	Song one = new Song("One", 275), two = new Song("Two", 362);
	Playlist a = new Playlist(), b = new Playlist();
	a.add(one); a.add(two); a.add(one);
	b.add(one); b.add(two);
	System.out.println(a.compareTo(b));
	a.remove(one);
	System.out.println(a.compareTo(b));
Output:
	1
	-1
 */

public class Song {

	private String nome;
	private Integer durata;
	
	public Song(String n,Integer d) {
		nome=n;
		durata=d;
	}
	
	public Integer getDurata() {
		return durata;
	}
}

class Playlist implements Comparable<Playlist>{
	
	private ArrayList<Song> top;
	private int durata = 0;
	
	public Playlist() {
		top = new ArrayList();
	}
	
	public void add(Song s) {
		durata = durata + s.getDurata();
		top.add(s);
	}
	
	public void remove(Song s) {
		
		for(int i=0;i<top.size();i++)
			if(top.get(i).equals(s)) {
				durata = durata - top.get(i).getDurata();
				top.remove(i);
			}
	}
	
	public ArrayList<Song> getDurata() {
		return top;
	}

	@Override
	public int compareTo(Playlist p) {  //ordinamento naturale basato sulla durata totale della playlist
		if(this.durata>p.durata) return 1;
		if(this.durata<p.durata) return -1;
		else return 0;
	}
}

class Test{
	public static void main(String[] args) {
		Song one = new Song("One", 275), two = new Song("Two", 362);
		Playlist a = new Playlist(), b = new Playlist();
		a.add(one); a.add(two); a.add(one); b.add(one); b.add(two);
		System.out.println(a.compareTo(b));
		a.remove(one);
		System.out.println(a.compareTo(b));
	}
}
