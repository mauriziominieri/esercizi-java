package esercizio3;

/**
 * @author Maurizio Minieri
 * mauminieri@gmail.com
 * www.mauriziominieri.it 
 **/

public class Main {

	public static void main(String[] args) {
		Short s = 10;
		Integer a = 10;
		Double b = 11.0;
		Number aa = a;	//tipo effettivo Integer
		Number bb = b;	//tipo effettivo Double
		
		System.out.println(((Object) s) == ((Object) a));		 //falsa, sono due oggetti differenti
		System.out.println(aa == a);							 //confronta il contenuto del wrapper, quindi 10 = 10
		System.out.println(a.getClass().equals(aa.getClass()));  //confronta i tipi effettivi
		System.out.println(aa.getClass().equals(bb.getClass())); //confronta i tipi effettivi
		Object o = s;											 //tipo effettivo Short
		System.out.println(o.getClass().equals(Short.class));	 //confronta i tipi effettivi
	}

}
