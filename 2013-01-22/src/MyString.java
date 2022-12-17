import java.util.*;

/*
 * (Insieme di lettere, 2013-1-22)
La classe MyString rappresenta una stringa. Due oggetti di tipo MyString sono considerati uguali
(da equals) se utilizzano le stesse lettere, anche se in numero diverso. Ad esempio, casa è uguale
a cassa e diverso da sa; culle è uguale a luce e diverso da alluce. La classe MyString deve
essere clonabile e deve orire un'implementazione di hashCode coerente con equals e non banale
(che non restituisca lo stesso codice hash per tutti gli oggetti).
Suggerimento: Nella classe String è presente il metodo public char charAt(int i), che restituisce l'i-esimo carattere della stringa, per i compreso tra 0 e length()-1.
Esempio d'uso:
MyString a = new MyString("freddo");
MyString b = new MyString("defro");
MyString c = new MyString("caldo");
MyString d = c.clone();
System.out.println(a.equals(b));
System.out.println(b.equals(c));
System.out.println(a.hashCode()==b.hashCode());
Output dell'esempio d'uso:
true
false
true
 * 
 */

//deve essere clonabile quindi implemento l'interfaccia Cloneable
public class MyString implements Cloneable{
	
	private String val;
	private static int generalCode = 1;
	private int code;
	
	public MyString(String v) {
		val=v;
		code=generalCode++;  //il primo oggetto avrà codice hashcode 1, il secondo 2, il terzo 3...
	}
	
	public MyString clone() {
		
		try {
	         MyString b = (MyString) super.clone();
	         return b;    
		 }    
		 catch(CloneNotSupportedException e ){
		     return null;
		 }
	}
	
	
    //equals è un metodo della classe Object che restituisce true se entrambi i riferimenti puntano alla stessa istanza. Noi lo overrideamo
	@Override
    public boolean equals(Object obj) {
       
        MyString ms = (MyString) obj;
        String s1 = this.val;
        String s2 = ms.val;
       
        for(int i=0;i<s1.length();i++) {
	        if(s2.indexOf(s1.charAt(i))==-1)  //indexOf restituisce l'indice del carattere parametrizzato oppure -1 se non lo trova
	        	return false;
        }
        
        for(int i=0;i<s2.length();i++) {
	        if(s1.indexOf(s2.charAt(i))==-1)
	        	return false; 
        }
   
        ms.code = this.code;      //anche il loro codice hashcode sarà uguale
        return true;
    }
	
	//hashCode è un metodo della classe Object che restituisce l'indirizzo dell'area di memoria dove l'oggetto è allocato con un intero univoco intero quindi 10 cifre massimo). Noi lo overrideamo
	@Override
	public int hashCode() {
		return code;
        //ovviamente in questo caso l'hashcode sarà un semplice intero al massimo di 2 cifre (se creo max 99 oggetti) ma in genere l'hashcode è un numero di 10 cifre
	}
}

/*
 * (MaxBox, 2013-1-22)
Implementare la classe parametrica MaxBox, che funziona come un contenitore che conserva solo
l'elemento massimo che vi sia mai stato inserito. L'ordinamento tra gli elementi può essere
stabilito in due modi diversi: se al costruttore di MaxBox viene passato un oggetto Comparator,
quell'oggetto verrà usato per stabilire l'ordinamento; altrimenti, verrà utilizzato l'ordinamento
naturale fornito da Comparable. In quest'ultimo caso, se la classe degli elementi non implementa
Comparable, viene sollevata un'eccezione.
130
Esempio d'uso:
MaxBox<String> bb1 = new MaxBox<String>();
MaxBox<String> bb2 = new MaxBox<String>(
new Comparator<String>() {
public int compare(String a, String b) {
return a.length() − b.length();
}
});
bb1.insert ("dodici");
bb1.insert ("sette");
bb2.insert ("dodici");
bb2.insert ("sette");
System.out.println(bb1.getMax());
System.out.println(bb2.getMax());
Output:
sette
dodici
 */


class MaxBox<T> implements Comparable<T>{
	
	private T max;
	private Comparator<T> comparator = null;
	
	public MaxBox(){
		System.out.println("qui1");
	}
	
	public MaxBox(Comparator<T> c){
		System.out.println("qui2");
		comparator = c;
	}
	
	public void insert(T s) {
		max=s;
		/ma come si fa
			
	}
	
	public T getMax() {
		return max;
	}

	@Override
	public int compareTo(T o) {
		
		if(comparator == null) { //vedo se è stato scelto il costruttore senza comparator, uso quello
			return 1;
		}
		else {   //scelgo quel compaatore passato
			comparator.compare(max, o);
			return 0;
		}
		
	}
}


class Test{
	public static void main(String[] args) {
		/*MyString a = new MyString("freddo");
		MyString b = new MyString("defro");
		MyString c = new MyString("caldo");
		MyString d = c.clone();
		System.out.println(a.equals(b));
		System.out.println(b.equals(c));
		
		/*System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(c.hashCode());
		System.out.println(d.hashCode());
		
		System.out.println(a.hashCode()==b.hashCode());
		System.out.println(b.hashCode()==c.hashCode());
		*/
		
		
		
		MaxBox<String> bb1 = new MaxBox<String>();   //costruttore vuoto
		MaxBox<String> bb2 = new MaxBox<String>(     //costruttore che accetta un comparatore
			new Comparator<String>() {                //CLASSE ANONIMA
				public int compare(String a, String b) {
					System.out.println("comparatore main");
					return a.length() - b.length();
				}
			});
		bb1.insert ("dodici");
		bb1.insert ("sette");
		bb2.insert ("dodici");
		bb2.insert ("sette");
		System.out.println(bb1.getMax());
		System.out.println(bb2.getMax());
		
		
	}
}