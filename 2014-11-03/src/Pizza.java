import java.util.*;
/*
 * (Pizza, 2014-11-3)
[CrowdGrader] Realizzare la classe Pizza, in modo che ad ogni oggetto si possano assegnare
degli ingredienti, scelti da un elenco fissato. Ad ogni ingrediente è associato il numero di calorie
che apporta alla pizza. Gli oggetti di tipo Pizza sono dotati di ordinamento naturale, sulla base
del numero totale di calorie. Infine, gli oggetti di tipo Pizza sono anche clonabili.
Esempio d'uso:
Pizza margherita = new Pizza(), marinara = new Pizza();
margherita.addIngrediente(Pizza.Ingrediente.POMODORO);
margherita.addIngrediente(Pizza.Ingrediente.MOZZARELLA);
marinara.addIngrediente(Pizza.Ingrediente.POMODORO);
marinara.addIngrediente(Pizza.Ingrediente.AGLIO);
Pizza altra = margherita.clone();
System.out.println( altra .compareTo(marinara));
Output:
1
 */


//Comparable per l'ordinamento naturale
//Cloneable per gli oggetti clonabili
public class Pizza implements Comparable<Pizza>,Cloneable{
	
	enum Ingrediente {
		POMODORO(5),
		MOZZARELLA(15),
		AGLIO(1);
		
		private final int calorie;

        Ingrediente(final int c) {
            calorie = c;
        }

        public int getCalorie() { return calorie; }
	}
	
	private ArrayList<Ingrediente> top;
	private int totCal=0;
	
	public Pizza() {
		top = new ArrayList<Ingrediente>();
	}
	
	public void addIngrediente(Ingrediente i) {
		top.add(i);
		totCal = totCal + i.getCalorie();
	}

	@Override
	public int compareTo(Pizza p) {  //ordinamento naturale sul numero delle calorie
		if(this.totCal>p.totCal) return 1;
		else if(this.totCal<p.totCal) return -1;
		else return 0;
	}
	
	public Pizza clone() {
		
		try {
			Pizza p = (Pizza) super.clone();
			return p;
		}
		catch(CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}
	
	
}

class Test {
	public static void main(String[] args) {
		Pizza margherita = new Pizza(), marinara = new Pizza();
		margherita.addIngrediente(Pizza.Ingrediente.POMODORO);
		margherita.addIngrediente(Pizza.Ingrediente.MOZZARELLA);
		marinara.addIngrediente(Pizza.Ingrediente.POMODORO);
		marinara.addIngrediente(Pizza.Ingrediente.AGLIO);
		Pizza altra = margherita.clone();
		System.out.println( altra.compareTo(marinara));
	}
}