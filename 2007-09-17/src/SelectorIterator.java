import java.util.*;

/*
 * (Selector, 2007-9-17)
L'interfaccia parametrica Selector prevede un metodo select che restituisce un valore booleano
per ogni elemento del tipo parametrico.
public interface Selector<T> {
boolean select(T x);
}
Implementare una classe SelectorIterator che accetta una collezione e un selettore dello stesso
tipo, e permette di iterare sugli elementi della collezione per i quali il selettore restituisce true.
Esempio d'uso:
Integer [] a = { 1, 2, 45, 56, 343, 22, 12, 7, 56};
List<Integer> l = Arrays.asList(a);
Selector<Integer> pari = new Selector<Integer>() {
public boolean select(Integer n) {
return (n % 2) == 0;
}
};
for (Integer n: new SelectorIterator<Integer>(l, pari))
System.out.print(n + " ");
Output dell'esempio d'uso:
2 56 22 12 56
 */

interface Selector<T> {
	boolean select(T x);
}

public class SelectorIterator<T> implements Selector<T>,Iterable<T> {
	
	private List<T> list;
	private Selector<T> mySel;
	private T r;
	
	public SelectorIterator(List<T> l, Selector<T> s) {
		list = l;
		mySel = s;
		iterator();
	}

	@Override
	public boolean select(T x) {
		System.out.println("qui");
		return false;
	}

	@Override
	public Iterator<T> iterator() {
		return new Iterator<T>() {    //creo un nuovo iteratore da restituire overridandogli i metodi. CLASSE ANONIMA
			
			private int index = 0;
			private T value = null;

			@Override
			public boolean hasNext() {
				return index < list.size();
			}

			@Override
			public T next() {
				
				if(mySel.select(list.get(index))) {
					value = list.get(index);
					index++;
				}
				else {
					index++;
					next();
				}
				
				return value;
			}
			
		};
	}

}

class Test {
	public static void main(String[] args) {
		
		Integer [] a = { 1, 2, 45, 56, 343, 22, 12, 7, 56};
		List<Integer> l = Arrays.asList(a);
		Selector<Integer> pari = new Selector<Integer>() {      //qua crea un nuovo selector implementando il suo metodo
			public boolean select(Integer n) {
				return (n % 2) == 0;
			}
		};
		for (Integer n: new SelectorIterator<Integer>(l, pari))
			System.out.print(n + " ");
	}
}
