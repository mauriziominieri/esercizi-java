/*
(Interval, 2009-1-29)
Si implementi la classe Interval, che rappresenta un intervallo di numeri reali. Un intervallo
può essere chiuso oppure aperto, sia a sinistra che a destra. Il metodo contains prende come
argomento un numero x e restituisce vero se e solo se x appartiene a questo intervallo. Il metodo
join restituisce l'unione di due intervalli, senza modicarli, sollevando un'eccezione nel caso in
cui questa unione non sia un intervallo. Si implementino anche le classi Open e Closed, in modo
da rispettare il seguente caso d'uso.
Esempio d'uso:
	Interval i1 = new Interval.Open(5, 10.5);
	Interval i2 = new Interval.Closed(7, 20);
	Interval i3 = i1. join (i2);
	System.out.println(i1.contains(5));
	System.out.println(i1);
	System.out.println(i2);
	System.out.println(i3);
Output dell'esempio d'uso:
	false
	(5, 10.5)
	[7, 20]
	(5, 20]
 */

public class Interval {
	
	protected double min,max; 
	private static int minType,maxType;
	
	public Interval(double a,double b) {
		this.min = a;
		this.max = b;
	}
	
	public Interval join(Interval i) {
		if(this.getClass().equals(Open.class) && i.getClass().equals(Open.class)) {
			if(this.min<i.min) min=this.min; 
			else min=i.min;
			
			if(this.max>i.max) max=this.max; 
			else max=i.max;
			
			minType=0; maxType=0;
		}
		else if(this.getClass().equals(Closed.class) && i.getClass().equals(Closed.class)) {
			if(this.min<i.min) min=this.min; 
			else min=i.min;
			
			if(this.max>i.max) max=this.max; 
			else max=i.max;
			
			minType=1; maxType=1;
		}
		else if(this.getClass().equals(Open.class) && i.getClass().equals(Closed.class)){
			if(this.min<i.min) {min=this.min; minType=0;}
			else {min=i.min; minType=1;}
			
			if(this.max>i.max) {max=this.max; maxType=0;}
			else {max=i.max; maxType=1;}
		}
		else {
			if(this.min<i.min) {min=this.min; minType=1;}
			else {min=i.min; minType=0;}
			
			if(this.max>i.max) {max=this.max; maxType=1;}
			else {max=i.max; maxType=0;}
		}
		
		Interval newInterval = new Interval(min,max);
		return newInterval;
	}
	
	public String toString() {
		
		if (minType == 0 && maxType == 0)
			return "("+min+" ,"+max+")"; 
		else if (minType == 0 && maxType == 1)
			return "("+min+" ,"+max+"]"; 
		else if (minType == 1 && maxType == 0)
			return "["+min+" ,"+max+")"; 
		else
			return "["+min+" ,"+max+"]"; 
	}
	
	public boolean contains(double x) {
		if (this.getClass().equals(Open.class)) {
			if(this.min<x && this.max>x)
				return true;
		}
		
		if (this.getClass().equals(Closed.class)) {
			if(this.min<=x && this.max>=x)
				return true;
		}
		
		return false;
	}
	
	static class Open extends Interval{
		public Open(double a,double b) {
			super(a,b);
		}
		
		public String toString() {
			return "("+min+" ,"+max+")";
		}
	}
	
	static class Closed extends Interval{
		public Closed(double a,double b) {
			super(a,b);
		}
		
		public String toString() {
			return "["+min+" ,"+max+"]";
		}
	}
}

class Test{
	public static void main(String[] args) {
		Interval i1 = new Interval.Open(5, 10.5);
		Interval i2 = new Interval.Closed(7, 20);
		Interval i3 = i1.join(i2);
		System.out.println(i1.contains(5));
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
	}
}