import java.util.*;
/*
 * (TwoSteps, 2006-7-17)
Implementare un metodo statico twoSteps che accetta come argomento un iteratore e restituisce
un iteratore dello stesso tipo, che compie due passi per ogni chiamata a next.
Come esempio, si consideri il seguente caso d'uso.
Esempio d'uso:
List<Integer> l = new LinkedList<Integer>();
l .add(3); l .add(5); l .add(7); l .add(9);
Iterator<Integer> iter1 = twoSteps(l.iterator ());
System.out.println("Iterazione 1:");
System.out.println( iter1 .next());
System.out.println( iter1 .next());
Iterator<Integer> iter2 = twoSteps(l.iterator ());
System.out.println("Iterazione 2:");
while (iter2.hasNext())
System.out.println( iter2 .next());
Output dell'esempio d'uso:
Iterazione 1:
3
7
Iterazione 2:
3
7
 */
public class Test{
	
	public static Iterator<Integer> twoSteps(Iterator<Integer> i){    //l'iteratore non è altro che un indice che segue gli elementi di una lista
		return new Iterator<Integer>() {  //classe anonima, cioè io voglio restituire un MIO iteratore
			
			private int value1;
			
			@Override
			public boolean hasNext() {
				return i.hasNext();    //hasNext dell'iteratore, non questo qui personale
			}

			@Override
			public Integer next() {
				value1=i.next();    //vado a prendere il primo elemento della lista lo metto in value1 e vado avanti
				i.next();           //vado avanti
				return value1;     //stamperò quindi value1 quando nel main verrà chiamato questo metodo next
			}
		};
	}
	
	
	public static void main(String[] args) {
		List<Integer> l = new LinkedList<Integer>();
		l.add(3); 
		l.add(5); 
		l.add(7); 
		l.add(9);
		Iterator<Integer> iter1 = twoSteps(l.iterator ());
		System.out.println("Iterazione 1:");
		System.out.println( iter1 .next());
		System.out.println( iter1 .next());
		Iterator<Integer> iter2 = twoSteps(l.iterator ());
		System.out.println("Iterazione 2:");
		while (iter2.hasNext())
			System.out.println( iter2 .next());
	}

	
}
