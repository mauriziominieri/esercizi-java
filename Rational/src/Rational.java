import java.util.*;

/*
 * (Rational, 2007-6-29)
• (18 punti) Si implementi una classe Rational che rappresenti un numero razionale in maniera
esatta. Il costruttore accetta numeratore e denominatore. Se il denominatore è negativo,
viene lanciata una eccezione. Il metodo plus prende un altro Rational x come argomento e
restituisce la somma di this e x. Il metodo times prende un altro Rational x come argomento
e restituisce il prodotto di this e x.
• (9 punti) La classe deve assicurarsi che numeratore e denominatore siano sempre ridotti ai
minimi termini. (Suggerimento: la minimizzazione della frazione può essere compito del
costruttore)
• (7 punti) La classe deve implementare l'interfaccia Comparable<Rational>, in base al normale ordinamento tra razionali.
Esempio d'uso:
Rational n = new Rational(2,12); // due dodicesimi
Rational m = new Rational(4,15); // quattro quindicesimi
Rational o = n.plus(m);
Rational p = n.times(m);
System.out.println(n);
System.out.println(o);
System.out.println(p);
Output dell'esempio d'uso:
1/6
13/30
2/45
 */


public class Rational implements Comparable<Rational>{
	
	int numeratore,denominatore;
	
	public Rational(int n,int d) throws RuntimeException {
		numeratore=n;
		denominatore=d;
		
		int MCD=mcd(n,d);
		
		if(denominatore<0)
			throw new RuntimeException("denominatore negativo");
		
		numeratore=n/MCD;
		denominatore=d/MCD;
		
	}
	
	public static int mcd(int a, int b)
    {   
        if (a == b) return a;
        else if (a > b) return mcd(a - b, b);
	    else return mcd(b, a);
    }
	
	public static int mcm(int a, int b){
		return (a * b) / mcd(a, b);
	}
	
	public Rational plus(Rational r) {
		
		int MCM=mcm(this.denominatore,r.denominatore);
		
		int a=(MCM/this.denominatore)*this.numeratore;
		int b=(MCM/r.denominatore)*r.numeratore;
		
		Rational ret = new Rational(a+b,MCM);
		return ret;
	}
	
	public Rational times(Rational r) {
		Rational ret = new Rational(this.numeratore*r.numeratore,this.denominatore*r.denominatore);
		return ret;
	}
	
	public String toString() {
		return numeratore+"/"+denominatore;
	}

	@Override
	public int compareTo(Rational o) {
		if(this.numeratore/this.denominatore>o.numeratore/o.denominatore) return 1;
		else if(this.numeratore/this.denominatore<o.numeratore/o.denominatore) return -1;
		else return 0;
		
	}

}

class Test{
	public static void main(String[] args) {
		Rational n = new Rational(2,12); // due dodicesimi
		Rational m = new Rational(4,15); // quattro quindicesimi
		Rational o = n.plus(m);
		Rational p = n.times(m);
		System.out.println(n);
		System.out.println(o);
		System.out.println(p);
	}
}
