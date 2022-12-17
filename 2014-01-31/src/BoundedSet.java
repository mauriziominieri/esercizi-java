import java.util.*;
/*
 * (BoundedSet, 2014-1-31)
Realizzare la classe BoundedSet, che rappresenta un insieme di capacità limitata. Il costruttore
accetta la capacità massima dell'insieme. La classe deve implementare i metodi add, contains e size
secondo il contratto previsto dall'interfaccia Set. Se però l'insieme è alla sua capacità massima e
si tenta di inserire un nuovo elemento con add, prima dell'inserimento sarà cancellato dall'insieme
l'elemento che vi è stato inserito prima (cioè, l'elemento più vecchio presente nell'insieme).
Fare in modo che sia add sia contains funzionino in tempo costante.
9
1 Java Collection Framework (collezioni)
Esempio d'uso:
BoundedSet<Integer> s = new BoundedSet<Integer>(3);
s.add(3); s.add(8); s.add(5); s.add(5);
System.out.println(s. size ());
System.out.println(s.contains(3));
s.add(14);
System.out.println(s. size ());
System.out.println(s.contains(3));
Output:
3
true
3
false
 */
public class BoundedSet<T> {
	
	private T first=null;
	private int cap; 
	private Set<T> set;  //elementi univoci

	
	public BoundedSet(int c) {
		cap = c;
		set = new HashSet<>();
	}
	
	public void add(T x) {
		
		if(first==null) first = x;
		set.add(x);
		
		if(set.size()>cap) {
			set.remove(first);
			first = set.iterator().next();
		}
	}
	
	public boolean contains(T x) {
		if(set.contains(x)) return true;
		else return false;
	}
	
	public int size() {
		return set.size();
	}
}

class Test {
	public static void main(String[] args) {
		BoundedSet<Integer> s = new BoundedSet<Integer>(3);
		s.add(3); s.add(8); s.add(5); s.add(5);
		System.out.println(s. size ());
		System.out.println(s.contains(3));
		s.add(14);
		System.out.println(s. size ());
		System.out.println(s.contains(3));
	}
}
