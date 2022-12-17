import java.util.*;
import java.lang.*;
/*
 * (PartiallyComparable, 2010-6-28)
L'interfaccia PartComparable (per partially comparable) rappresenta un tipo i cui elementi sono
parzialmente ordinati.
public interface PartComparable<T> {
public PartComparison compareTo(T x);
}

public enum PartComparison {
SMALLER, EQUAL, GREATER, UNCOMP;
}
Implementare la classe POSet (per partially ordered set), che rappresenta un insieme parzialmente
ordinato, i cui elementi implementano l'interfaccia PartComparable. Un oggetto di questo insieme
è detto massimale se nessun altro oggetto nell'insieme è maggiore di lui.
Il metodo add aggiunge un oggetto all'insieme, mentre il metodo isMaximal restituisce vero se
l'oggetto passato come argomento è uno degli oggetti massimali dell'insieme, restituisce falso se
tale oggetto appartiene all'insieme, ma non è massimale, ed infine solleva un'eccezione se l'oggetto
non appartiene all'insieme. Il metodo isMaximal deve terminare in tempo costante.
// Stringhe, ordinate parzialmente dalla relazione di presso
class POString implements PartComparable<POString> { ...
}
POSet<POString> set = new POSet<POString>();
set .add(new POString("architetto"));
set .add(new POString("archimede"));
set .add(new POString("archi"));
set .add(new POString("bar"));
set .add(new POString("bari"));
System.out.println(set .isMaximal(new POString("archimede")));
System.out.println(set .isMaximal(new POString("bar")));
set .add(new POString("archimedeo"));
System.out.println(set .isMaximal(new POString("archimede")));
Output dell'esempio d'uso:
true
false
false
 */

interface PartComparable<T> {
	public PartComparison compareTo(T x);
}

enum PartComparison {
	SMALLER, EQUAL, GREATER, UNCOMP;
}

class POString<T> implements Comparable<T> {
	
	private String nome;
	
	public POString(String s) {
		nome = s;
	}
	
	//@Override
	/*public PartComparison compareTo(POString x) {
		
		/*if(x instanceof String) {
			System.out.println("stringa");
			return PartComparison.GREATER;
		}
		else {
			System.out.println("non stringa");
			return PartComparison.GREATER;
		}
		
		if (this.nome.compareTo(x.nome)>0) return PartComparison.GREATER;   //vado a prendere il metodo compareTo della classe Stringa
		else if (this.nome.compareTo(x.nome)<0) return PartComparison.SMALLER; 
		else return PartComparison.EQUAL; 
	}*/
	
	public String getNome() {
		return nome;
	}
	
	public String toString() {
		return ""+nome;
	}


	@Override
	public int compareTo(T o) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
}


public class POSet<T>{   //per il treeset

	TreeSet<String> s;
	
	public POSet() {
		s = new TreeSet<String>();
	}
	
	public void add(POString p) {
		s.add(p.getNome());
	}
	
	public boolean isMaximal(POString p) {
		System.out.println(s);
		if(p.equals(s.iterator().next())) return true;  //p è un oggetto massimale dell'insieme?
		return false;
	}

	

	
}

class Test{
	public static void main(String[] args) {
		POSet<POString> set = new POSet<POString>();
		set.add(new POString("architetto"));
		set.add(new POString("archimede"));
		set.add(new POString("archi"));
		set.add(new POString("bar"));
		set.add(new POString("bari"));
		System.out.println(set.isMaximal(new POString("archimede")));
		System.out.println(set.isMaximal(new POString("bar")));
		set.add(new POString("archimedeo"));
		System.out.println(set .isMaximal(new POString("archimede")));
	}
}