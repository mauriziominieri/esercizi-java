import java.util.*;

/*
 * (CommonDividers, 2007-7-20)
Implementare una classe CommonDividers che rappresenta tutti i divisori comuni di due numeri
interi, forniti al costruttore. Su tale classe si deve poter iterare secondo il seguente caso d'uso.
Dei 30 punti, 15 sono riservati a coloro che realizzeranno l'iteratore senza usare spazio aggiuntivo.
Viene valutato positivamente l'uso di classi anonime laddove opportuno.
124
Esempio d'uso:
for (Integer n: new CommonDividers(12, 60))
System.out.print(n + " ");
Output dell'esempio d'uso:
1 2 3 4 6 12
 */

public class CommonDividers implements Iterable<Integer>{
	
	private int num1,num2;
	
	public CommonDividers(int a, int b) {
		num1 = a;
		num2 = b;
		iterator();
	}

	@Override
	public Iterator iterator() {
		return new Iterator() {   //creo un iteratore che restituisco, in termine tecnico si chiama CLASSE ANONIMA
			
			private int index = 1;
			private int value;
			
			@Override
			public boolean hasNext() {
				return value < num1;
			}

			@Override
			public Integer next() {
				
				for(int i=index; i<=num1; i++) {  //i parte da 1 e mi chiedo se 12 è divisibile, si, index ora è 2 e value = 1, i parte da 2 entro e index = 3 e value 2, i parte da 3 non entro nell'if quindi si incrementa a 4 ed entro...
					if(num1%i==0) {
						index = i+1;
						value = i;
						break;
					}
				}
				
				return value;
			}
		};
	}

}

class Test {
	public static void main(String[] args) {
		for (Integer n: new CommonDividers(12, 60))
			System.out.print(n + " ");
	}
}
