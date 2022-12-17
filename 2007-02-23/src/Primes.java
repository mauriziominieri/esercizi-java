import java.util.*;

/*
 * 
 * . (Primes, 2007-2-23)
Denire una classe Primes che rappresenta l'insieme dei numeri primi. Il campo statico iterable
fornisce un oggetto su cui si può iterare, ottenendo l'elenco di tutti i numeri primi. Non deve
essere possibile per un'altra classe creare oggetti di tipo Primes.
Suggerimento: Primes potrebbe implementare sia Iterator<Integer> che Iterable<Integer>. In tal
caso, il campo iterable potrebbe puntare ad un oggetto di tipo Primes.
Esempio d'uso:
for (Integer i : Primes.iterable ) {
if (i > 20) break;
System.out.println(i );
}
Output dell'esempio d'uso:
1
3
5
7
11
13
17
19
 */
public class Primes {
	
	protected static Iterable<Integer> iterable = new Iterable<Integer>(){   //CLASSE ANONIMA

		@Override
		public Iterator<Integer> iterator() {
			return new Iterator<Integer>() {   //CLASSE ANONIMA
				
				private int n = 1;
				private int ret;
				
				@Override
				public boolean hasNext() {
					return n < 20;
				}

				@Override
				public Integer next() {
					
					if(primo(n)) {
						ret = n;
						n++;
					}
					else {
						n++;
						next();
					}
					
					return ret;	
				}
				
				
				public boolean primo(int n) {
					 
					int i,m=n/2,flag=0;    
		    
					if(n==1){
					   //System.out.println(n+" is not prime number");  
						  return true;  //per la traccia lo è
					}
					else {
					   for(i=2;i<=m;i++){    
						if(n%i==0){    
							 //System.out.println(n+" is not prime number");  
							 flag=1;    
							 break;    
						}    
					   }    
					   if(flag==0)  // System.out.println(n+" is prime number"); 
						   return true; 
					}
					  
					  return false;
				}
				
			};
		}
		
	};
}

class Test{
	public static void main(String[] args) {
		for (Integer i : Primes.iterable ) {
			if (i > 20) break;
				System.out.println(i);
			}
	}
}