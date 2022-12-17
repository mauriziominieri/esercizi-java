import java.util.*;

/*
 * (Component e Conguration, 2018-10-18)
Un sito vuole consentire agli utenti di ordinare computer assemblati. Data l'enumerazione: enum Type { CPU, BOARD, RAM; }
implementare le classi Component, che rappresenta un componente di un PC, e Configuration, che rappresenta un PC da assemblare.
Un componente è caratterizzato dalla sua tipologia (Type) e da una descrizione (stringa). Il suo
metodo setIncompatible dichiara che questo componente è incompatibile con un altro componente,
passato come argomento. Un componente può essere incompatibile con diversi altri componenti.
Il metodo add di Configuration aggiunge un componente a questo PC e restituisce true, ma solo
se il componente è compatibile con quelli già inseriti, ed è di tipo diverso da quelli già inseriti,
altrimenti non lo inserisce e restituisce false.
Suggerimento: Una classe Component ben progettata non nominerà le 3 istanze di Type.
L'implementazione deve rispettare il seguente esempio d'uso.
3
1 Java Collection Framework (collezioni)
Esempio d'uso:
Component cpu1 = new Component(Type.CPU, "Ryzen 5 2600"),
cpu2 = new Component(Type.CPU, "Core i5 7500"),
board1 = new Component(Type.BOARD, "Prime X470"),
board2 = new Component(Type.BOARD, "Prime Z370"),
ram = new Component(Type.RAM, "DDR4 8GB");
cpu1.setIncompatible(board2);
board1.setIncompatible(cpu2);
Conguration pc = new Conguration();
System.out.println(pc.add(cpu1));
System.out.println(pc.add(cpu2)); // due cpu!
System.out.println(pc.add(board2)); // incompatibile !
System.out.println(pc.add(board1));
System.out.println(pc.add(ram));
Output:
true
false
false
true
true
 */

enum Type {
	CPU,BOARD, RAM;
}

public class Component {

	protected Type tipologia;
	private String descrizione;
	protected static HashMap<Component, HashSet<Component>> M = new HashMap();

	public Component(Type t, String d) {
		tipologia = t;
		descrizione = d;
	}

	public void setIncompatible(Component c) {

		HashSet<Component> set = M.get(this);

		if(set == null)
			set = new HashSet();

		set.add(c);
		M.put(this, set);
	}

	public String toString() {
		return descrizione;
	}
}

class Configuration {

	private ArrayList<Component> pc;

	public Configuration() {
		pc = new ArrayList();
	}

	public Boolean add(Component c) {

		if(pc.isEmpty()) {
			pc.add(c);
			return true;
		}

		for (Component component : pc) {
			//vado a scorrere gli elementi della lista e
			//vado a prendere il set collegato alla chiave, vedo se in questo set c'è il componente parametrizzato ||
			//se già c'è una tipologia doppione...
			if(Component.M.get(component).contains(c) || component.tipologia == c.tipologia)
				return false;
		}

		pc.add(c);
		return true;
	}

}

class Test {
	public static void main(String[] args) {
		Component cpu1 = new Component(Type.CPU, "Ryzen 5 2600"),
				cpu2 = new Component(Type.CPU, "Core i5 7500"),
				board1 = new Component(Type.BOARD, "Prime X470"),
				board2 = new Component(Type.BOARD, "Prime Z370"),
				ram = new Component(Type.RAM, "DDR4 8GB");
		cpu1.setIncompatible(board2);
		board1.setIncompatible(cpu2);
		Configuration pc = new Configuration();
		System.out.println(pc.add(cpu1));
		System.out.println(pc.add(cpu2)); // due cpu!
		System.out.println(pc.add(board2)); // incompatibile !
		System.out.println(pc.add(board1));
		System.out.println(pc.add(ram));
	}
}