import java.util.*;
/*
 * (Box, 2015-2-5)
Realizzare la classe Box, che rappresenta una scatola, caratterizzata dalle sue tre dimensioni:
altezza, larghezza e profondità. Due scatole sono considerate uguali (da equals) se hanno le
stesse dimensioni. Le scatole sono dotate di ordinamento naturale basato sul loro volume. Inne,
il metodo tsIn, invocato su una scatola x, accetta un'altra scatola y e restituisce true se e solo
se y è sufficientemente grande da contenere x.
Esempio d'uso:
Box grande = new Box(20, 30, 40), grande2 = new Box(30, 20, 40),
piccolo = new Box(10, 10, 50);
System.out.println(grande.equals(grande2));
System.out.println(grande.compareTo(piccolo));
System.out.println(piccolo.fitsIn (grande));
Output:
false
1
false
 */

//ordinamento naturale si usa comparable
public class Box implements Comparable<Box>{
	
	private double altezza,larghezza,profondita,volume;

	public Box(int a,int l,int p) {
		altezza = a;
		larghezza = l;
		profondita = p;
		volume = a*l*p;
	}
	
	@Override
	public boolean equals(Object o) {    //override del metodo equals della classe Object
		Box b = (Box) o;
		if(this.altezza == b.altezza && this.larghezza == b.larghezza && this.profondita == b.profondita) return true;
		return false;
	}

	@Override
	public int compareTo(Box o) {  //ordinamento naturale
		if(this.volume>o.volume) return 1;
		else if(this.volume<o.volume) return -1;
		else return 0;
	}
	
	public boolean fitsIn(Box b) {
		if(this.volume>b.volume) return true;
		else return false;
	}
	
	
}

class Test {
	public static void main(String[] args) {
		Box grande = new Box(20, 30, 40), grande2 = new Box(30, 20, 40),piccolo = new Box(10, 10, 50);
		System.out.println(grande.equals(grande2));
		System.out.println(grande.compareTo(piccolo));
		System.out.println(piccolo.fitsIn(grande));
	}
}