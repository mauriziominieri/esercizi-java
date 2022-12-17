import java.util.*;
/*
 * (Time, 2010-9-14)
Implementare la classe Time, che rappresenta un orario della giornata (dalle 00:00:00 alle 23:59:59).
Gli orari devono essere confrontabili secondo Comparable. Il metodo minus accetta un altro orario x come argomento e restituisce la dierenza tra questo orario e x, sotto forma di un nuovo
oggetto Time. La classe fornisce anche gli orari predeniti MIDDAY e MIDNIGHT.
Esempio d'uso:
Time t1 = new Time(14,35,0);
Time t2 = new Time(7,10,30);
Time t3 = t1.minus(t2);
System.out.println(t3);
System.out.println(t3.compareTo(t2));
System.out.println(t3.compareTo(Time.MIDDAY));
Output dell'esempio d'uso:
7:24:30
1
-1
 */
public class Time implements Comparable<Time>{
	
	protected static Time MIDDAY = new Time(12,0,0);
	protected static Time MIDNIGHT = new Time(0,0,0);
	private int ora,minuti,secondi;

	public Time(int h,int m,int s) {
		ora = h;
		minuti = m;
		secondi = s;
	}
	
	public Time minus(Time t) {
		
		if(this.secondi<t.secondi) {
			this.secondi = this.secondi + 60;
			this.minuti = this.minuti - 1;
		}
		
		if(this.minuti<t.minuti) {
			this.minuti = this.minuti + 60;
			this.ora = this.ora - 1;
		}
		
		if(this.ora<t.ora)
			this.ora = this.ora + 24;
		
		secondi = this.secondi-t.secondi;
		minuti = this.minuti-t.minuti;
		ora = this.ora-t.ora;
		
		Time newT = new Time(ora,minuti,secondi);
		return newT;
	}

	@Override
	public int compareTo(Time t) {
		if(this.ora>t.ora) return 1;
		else if(this.ora<t.ora) return -1;
		else {
			if(this.minuti>t.minuti) return 1;
			else if(this.minuti<t.minuti) return -1;
			else {
				if(this.secondi>t.secondi) return 1;
				else if(this.secondi<t.secondi) return -1;
				else return 0;
			}
		}
	}
	
	public String toString() {
		return ora+":"+minuti+":"+secondi;
	}
}

class Test {
	public static void main(String[] args) {
		Time t1 = new Time(14,35,0);
		Time t2 = new Time(7,10,30);
		Time t3 = t1.minus(t2);
		System.out.println(t3);
		System.out.println(t3.compareTo(t2));
		System.out.println(t3.compareTo(Time.MIDDAY));
	}
}