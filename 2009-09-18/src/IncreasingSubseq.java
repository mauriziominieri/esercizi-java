import java.util.*;
/*
 * (IncreasingSubsequence, 2009-9-l'8)
Implementare la classe IncreasingSubseq che, data una lista di oggetti tra loro confrontabili,
rappresenta la sottosequenza crescente che inizia col primo elemento.
Attenzione: la classe deve funzionare con qualunque tipo di dato che sia confrontabile (non solo con Integer).
Sarà valutato negativamente l'uso di strutture di appoggio, ovvero di spazio aggiuntivo di dimensione non costante.
Esempio d'uso:
List<Integer> l = new LinkedList<Integer>();
l .add(10); l .add(3);
l .add(5); l .add(12);
l .add(11); l .add(35);
for (Integer i : new IncreasingSubseq<Integer>(l))
System.out.println(i );
Output dell'esempio d'uso:
10
12
35
 */



//Un iteratore non è altro che un oggetto che associato ad una lista ci permette di scorrerla. Si usa quindi prendendo l'iteratore con list.iterator();
// e poi sarà possibile usare iterator.hasNext() per vedere se ha un prossimo elemento e iterator.next() per prendere l'elemento e passare al prossimo
//Ovviamente questi due metodi sono quelli dell'interfaccia Iterator, quindi sì, creiamo un banale iteratore da cui prendere i metodi

//Sappiamo che dobbiamo confrontare due oggetti di tipo generico quindi estendiamo l'interfaccia Comparable
public class IncreasingSubseq <T extends Comparable<T>> implements Iterable<T> {

	List<T> list;
	
	public IncreasingSubseq(List<T> l) {
	    list = l;   //list punta ad l
		iterator();   //chiamo il metodo iterator che ho overridato da Iterable
	}

	@Override
	public Iterator<T> iterator() {  //il metodo overridato
	    return new Iterator<T>() {   //devo creare un iteratore diverso dal normale, quindi devo modificare il metodo next(), ovviamente devo overridare anche gli altri metodi astratti
	        private int index = 0;
	        private T value = null;

	        @Override
	        public boolean hasNext() {
	            return index < list.size();
	        }
	        
	        @Override
	        public T next() {
	            if (hasNext()) {
	            	if(value==null) {
	            	    value = list.get(index);
	            		index++;
	            	}
	            	else if (value.compareTo(list.get(index))>0) {
	            		index++;
	            		next();
	            	}
	            	else {
						value = list.get(index);
						index++;
	            	}
	            	
	                return value;
	            }
	            throw new NoSuchElementException("No more positions available");
	        }

	        @Override
	        public void remove() {
	           list.remove(index);
	        }
	    };
	}
}

class Test {
	public static void main(String[] args) {
		List<Integer> l = new LinkedList<Integer>();
		l .add(10); 
		l .add(3);
		l .add(5); 
		l .add(12);
		l .add(11); 
		l .add(35);
		for (Integer i : new IncreasingSubseq<Integer>(l))   // capisco che la classe deve restituirmi un iteratore di tipo parametrico. 
			System.out.println(i);
	}
}
