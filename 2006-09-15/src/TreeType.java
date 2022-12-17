import java.util.*;

/*
 * (TreeType, 2006-9-15)
Implementare le classi TreeType e Tree. TreeType rappresenta un tipo di albero (pino, melo, etc.),
mentre Tree rappresenta un particolare esemplare di albero. Ogni TreeType è caratterizzato dal
suo nome. Ogni Tree ha un tipo base ed eventualmente degli innesti di altri tipi di alberi. Il
metodo addGraft di Tree aggiunge un innesto ad un albero, purchèE non sia dello stesso tipo
dell'albero stesso. Il metodo getCounter di Tree restituisce il numero di alberi che sono stati creati. 
Il metodo getCounter di TreeType restituisce il numero di alberi di quel tipo che sono stati creati. (32 punti)
Ridenire il metodo clone di Tree, facendo attenzione ad eseguire una copia profonda laddove sia necessario. (8 punti)
Esempio d'uso:
TreeType melo = new TreeType("melo");
TreeType pero = new TreeType("pero");
Tree unMelo = new Tree(melo);
Tree unAltroMelo = new Tree(melo);
unAltroMelo.addGraft(pero);
unAltroMelo.addGraft(pero);
System.out.println("Sono stati creati "+ melo.getCounter() + " meli no a questo momento.");
System.out.println("Sono stati creati "+ Tree.getCounter() + " alberi no a questo momento.");
System.out.println(unAltroMelo);
unAltroMelo.addGraft(melo);
Output dell'esempio d'uso:
Sono stati creati 2 meli fino a questo momento.
Sono stati creati 2 alberi fino a questo momento.
tipo: melo
innesti:
pero
Exception in thread "main":
java.lang.RuntimeException
 * 
 */

public class TreeType {
	
	private String nome;
	protected int num;
	
	public TreeType(String n) {
		nome = n;
	}
	
	public int getCounter() {
		return this.num;
	}
	
	public String toString() {
		return nome;
	}

}

class Tree implements Cloneable {
	
	private static ArrayList<Tree> alberi = new ArrayList<Tree>();
	private ArrayList<TreeType> innesti;
	private TreeType tipo;
	
	public Tree(TreeType t) {
		
		alberi.add(this);
		
		innesti = new ArrayList<TreeType>();
		tipo = t;
		t.num++;
	}
	
	public void addGraft(TreeType t) {
		
		if(t.equals(tipo))
			throw new RuntimeException("Errore");
		
		if(!innesti.contains(t))
			innesti.add(t);
	}
	
	public static int getCounter() {
		return alberi.size();
	}
	
	public Tree clone() {
		try {
			Tree t = (Tree) super.clone();
			return t;
		}
		catch(CloneNotSupportedException e) {
			return null;
		}
	}
	
	public String toString() {
		
		String s = "";
		
		for (TreeType t: innesti ) {
			s = s + t + "\n";
		}
		
		return "\ntipo: "+tipo+"\ninnesti:\n"+s;
	}
}




class Test{
	public static void main(String[] args) {
		//esercizio 1
		/*TreeType melo = new TreeType("melo");
		TreeType pero = new TreeType("pero");
		Tree unMelo = new Tree(melo);
		Tree unAltroMelo = new Tree(melo);
		unAltroMelo.addGraft(pero);
		unAltroMelo.addGraft(pero);
		System.out.println("Sono stati creati "+ melo.getCounter() + " meli fino a questo momento.");
		System.out.println("Sono stati creati "+ Tree.getCounter() + " alberi fino a questo momento.");
		System.out.println(unAltroMelo);
		unAltroMelo.addGraft(melo);*/
		
	}
}