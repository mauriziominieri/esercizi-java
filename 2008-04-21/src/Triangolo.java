import java.text.DecimalFormat;
import java.text.NumberFormat;

/*
(Triangolo, 2008-4-21)
Nell'ambito di un programma di geometria, si implementi la classe Triangolo, il cui costruttore
accetta le misure dei tre lati. Se tali misure non danno luogo ad un triangolo, il costruttore deve
lanciare un'eccezione. Il metodo getArea restituisce l'area di questo triangolo. Si implementino
anche la classe Triangolo.Rettangolo, il cui costruttore accetta le misure dei due cateti, e la classe
Triangolo.Isoscele, il cui costruttore accetta le misure della base e di uno degli altri lati.
Si ricordi che:
• Tre numeri a, b e c possono essere i lati di un triangolo a patto che a < b + c, b < a + c e
c < a + b.
• L'area di un triangolo di lati a, b e c è data da:
radice p · (p − a) · (p − b) · (p − c) (formula di Erone)
dove p è il semiperimetro.
Esempio d'uso (fuori dalla classe Triangolo):
	Triangolo x = new Triangolo(10,20,25);
	Triangolo y = new Triangolo.Rettangolo(5,8);
	Triangolo z = new Triangolo.Isoscele(6,5);
	System.out.println(x.getArea());
	System.out.println(y.getArea());
	System.out.println(z.getArea());
Output dell'esempio d'uso:
	94.9918
	19.9999
	12.0
 */

public class Triangolo {
	
	private double a,b,c;
	private double semiperimetro;
	
	public Triangolo(double a,double b,double c) {
		if(a<b+c && b<a+c && c<a+b) {
			this.a=a;
			this.b=b;
			this.c=c;
			
			setSemiperimetro(a,b,c);
		}
		else throw new RuntimeException("Non è un triangolo!");
	}
	
	public Triangolo(double a,double b) {
		this.a=a;
		this.b=b;
		
		if(this.getClass()==Triangolo.Isoscele.class)
			this.c=b;
		else if(this.getClass()==Triangolo.Rettangolo.class)
			this.c=Math.sqrt((Math.pow(a,2)+Math.pow(b, 2)));
		
		setSemiperimetro(a,b,c);
	}
	
	public void setSemiperimetro(double a,double b,double c) {
		this.semiperimetro = (a+b+c)/2;
	}
	
	public double getArea() {
		double areaD;
		//System.out.println("semi: "+semiperimetro+",a: "+a+",b: "+b+",c: "+c);
		areaD = Math.sqrt(semiperimetro*(semiperimetro-a)*(semiperimetro-b)*(semiperimetro-c));
		
		//return round(areaD, 4);
		return areaD;
	}
	
	
	
	static class Rettangolo extends Triangolo{
		
		public Rettangolo(double c1,double c2) {
			super(c1,c2);
		}
		
		@Override 
		public double getArea() {    //override del metodo della superclasse, ho aggiunto la notazione override per essere certo che lo sia, infatti se scrivessi getarea() mi darebbe errore di override
			return super.getArea();
		}
	}
	
	static class Isoscele extends Triangolo {
		
		public Isoscele(double base,double lato) {
			super(base,lato);
		}
		
		@Override 
		public double getArea() {    //override del metodo della superclasse, ho aggiunto la notazione override per essere certo che lo sia, infatti se scrivessi getarea() mi darebbe errore di override
			return super.getArea();
		}
	}
}

class Test{
	public static void main(String[] args) {
		Triangolo x = new Triangolo(10,20,25);
		Triangolo y = new Triangolo.Rettangolo(5,8);
		Triangolo z = new Triangolo.Isoscele(6,5);
		System.out.println(x.getArea());
		System.out.println(y.getArea());
		System.out.println(z.getArea());
	}
}