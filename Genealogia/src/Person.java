import java.util.*;

/*
 * (Genealogia, 2007-4-26)
Nell'ambito di un programma di genealogia, si implementi la classe (o interfaccia) Person e le
sottoclassi Man e Woman, con le seguenti caratteristiche. Una persona è dotata di nome e
cognome. Il metodo addChild di Person prende una persona x come argomento e segnala che x
è figlia di this. Il metodo marries di Person prende una persona x come argomento e segnala che
x è sposata con this. Il metodo marries lancia un'eccezione se x è dello stesso genere di this. Il
metodo statico areSiblings prende come argomenti due persone x e y e restituisce vero se x ed y
sono fratelli o sorelle e falso altrimenti.

Esempio d'uso:
Person a = new Man("Mario", "Rossi");
Person b = new Woman("Luisa", "Verdi");
Person c = new Man("Luca", "Rossi");
Person d = new Woman("Anna", "Rossi");
Person e = new Woman("Daniela", "Rossi");
a.marries(b);
a.addChild(c);
b.addChild(d);
c.addChild(e);
System.out.println(Person.areSiblings (a, b));
System.out.println(Person.areSiblings (c, d));
Output dell'esempio d'uso:
false
true
 */



public class Person {

	private String nome,cognome;
	private Person coniuge;
	private Person genitore;
	
	public Person(String n,String c) {
		nome=n;
		cognome=c;
	}
	
	public void addChild(Person x) {
		
		if(this == x)
			throw new RuntimeException(this+" non può essere figlio di se stesso");
		
		if(x.genitore!=null)
			throw new RuntimeException(x+" ha già un genitore: "+x.genitore);
		
		x.genitore = this;
	}
	
	public void marries(Person x) {
		
		if(this.getClass() == x.getClass())
			throw new RuntimeException("Stesso genere...(un pò razzista a mio parere)");
		
		this.coniuge=x;
		x.coniuge=this;
	}
	
	public static boolean areSiblings(Person x, Person y) {
		
	    Person genitore1 = x.genitore;
	    Person genitore2 = y.genitore;
	    
	   // System.out.println(genitore1);
	   // System.out.println(genitore2);
	    
	    if(genitore1==null || genitore2==null)
	    	return false;
	    
	    if(genitore1.coniuge == genitore2) 
	    	return true;
	    
	    if(genitore1 == genitore2)
	    	return true;
		
		return false;
	}
	
	public String toString() {
		return nome+" "+cognome;
	}
	
}

class Man extends Person{
	
	public Man(String n,String c) {
		super(n,c);
	}
}

class Woman extends Person{
	
	public Woman(String n,String c) {
		super(n,c);
	}
}

class Test{
	public static void main(String[] args) {
		Person a = new Man("Mario", "Rossi");
		Person b = new Woman("Luisa", "Verdi");
		Person c = new Man("Luca", "Rossi");
		Person d = new Woman("Anna", "Rossi");
		Person e = new Woman("Daniela", "Rossi");
		Person z = new Woman("Maria", "Rossi");
		Person f = new Woman("Luisa", "Rossi");
		a.marries(b);
		a.addChild(c);
		a.addChild(z);
		b.addChild(d);
		c.addChild(e);
		c.addChild(f);
		
		System.out.println(Person.areSiblings (a, b));
		System.out.println(Person.areSiblings (c, d));
		System.out.println(Person.areSiblings (c, e));
		System.out.println(Person.areSiblings (z, d));
		System.out.println(Person.areSiblings (d, z));
	}
}