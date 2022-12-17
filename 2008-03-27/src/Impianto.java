import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * (Impianto e Apparecchio, 2008-3-27)
Si implementi una classe Impianto che rappresenta un impianto elettrico, e una classe Apparecchio
che rappresenta un apparecchio elettrico collegabile ad un impianto. Un impianto è caratterizzato
dalla sua potenza massima erogata (in Watt). Ciascun apparecchio è caratterizzato dalla sua
potenza assorbita (in Watt). Per quanto riguarda la classe Impianto, il metodo collega collega
un apparecchio a questo impianto, mentre il metodo potenza restituisce la potenza attualmente
assorbita da tutti gli apparecchi collegati all'impianto ed accesi.
I metodi on e off di ciascun apparecchio accendono e spengono, rispettivamente, questo apparecchio. Se, accendendo un apparecchio col metodo on, viene superata la potenza dell'impianto a
cui è collegato, deve essere lanciata una eccezione.
Esempio d'uso:
Apparecchio tv = new Apparecchio(150);
Apparecchio radio = new Apparecchio(30);
Impianto i = new Impianto(3000);
i . collega (tv);
i . collega (radio);
System.out.println(i .potenza());
tv.on();
System.out.println(i .potenza());
radio.on();
System.out.println(i .potenza());
Output dell'esempio d'uso:
0
150
180
 */
public class Impianto {
	
	private int PMAX,potenza;
	private List<Apparecchio> top;
	
	public Impianto(int p) {
		PMAX= p;
		potenza=0;
		top = new ArrayList<>();
	}
	
	public void collega(Apparecchio a) {
		top.add(a);
		a.m.put(a, this);
	}
	
	public int potenza() {
		potenza = 0;
		
		for(Apparecchio a : top) {
			if(a.getStatus())
				potenza += a.getPotenza();
		}
		return potenza;
	}
	
	public int getPMax() {
		return PMAX;
	}

}

class Apparecchio {
	
	private int potenza;
	private boolean status = false;
	protected Map<Apparecchio,Impianto> m;
	
	public Apparecchio(int p) {
		potenza = p;
		m=new HashMap<>();
	}
	
	public void on() {
		
		status = true;
		
		if(this.getImpianto().getPMax()<this.getImpianto().potenza())
			throw new RuntimeException("Potenza massima raggiunta");
	}
	
	public void off() {
		status = false;
	}
	
	public Impianto getImpianto() {
		return m.get(this);
	}
	
	public int getPotenza() {
		return potenza;
	}
	
	public boolean getStatus() {
		return status;
	}
	
}

class Test {
	public static void main(String[] args) {
		Apparecchio tv = new Apparecchio(150);
		Apparecchio radio = new Apparecchio(30);
		Impianto i = new Impianto(3000);
		i.collega(tv);
		i.collega(radio);
		System.out.println(i.potenza());
		tv.on();
		System.out.println(i.potenza());
		radio.on();
		System.out.println(i.potenza());
	}
}