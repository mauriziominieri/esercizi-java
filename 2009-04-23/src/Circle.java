/*
(Circle, 2009-4-23)
Nell'ambito di un programma di geometria, la classe Circle rappresenta una circonferenza sul
piano cartesiano. Il suo costruttore accetta le coordinate del centro ed il valore del raggio. Il
metodo overlaps prende come argomento un'altra circonferenza e restituisce vero se e solo se le
due circonferenze hanno almeno un punto in comune.
Fare in modo che Circle implementi Comparable, con il seguente criterio di ordinamento: una
circonferenza è minore di un'altra se è interamente contenuta in essa, mentre se nessuna delle
due circonferenze è contenuta nell'altra, esse sono considerate uguali. Dire se tale criterio di
ordinamento è valido, giusticando la risposta.
Esempio d'uso:
	Circle c1 = new Circle(0,0,2);
	Circle c2 = new Circle(1,1,1);
	System.out.println(c1.overlaps(c2));
	System.out.println(c1.compareTo(c2));
Output dell'esempio d'uso:
	true
	0
 */

public class Circle implements Comparable<Circle>{
	
	private Integer CX,CY,raggio;

	public Circle(int cx,int cy,int r) {
		CX=cx;
		CY=cy;
		raggio=r;
	}
	
	public int interna(Circle c1,Circle c2) {
		
		double distanza = Math.sqrt(Math.pow(c1.CX-c2.CY,2)+Math.pow(c1.CX-c2.CY,2));
		int somma=c1.raggio+c2.raggio;
		int differenza=Math.abs(c1.raggio-c2.raggio);
		
		if(differenza>distanza) return 1;
		if(somma<distanza) return -1;
		else return 0;
	}
	
	public boolean calcoladistanza(Circle c1,Circle c2) {
		
		double distanza = Math.sqrt(Math.pow(c1.CX-c2.CY,2)+Math.pow(c1.CX-c2.CY,2));
		int somma=c1.raggio+c2.raggio;
		int differenza=Math.abs(c1.raggio-c2.raggio);
		
		if(somma<distanza)  //esterne = 0 punti in comune
			return false;
		if(somma==distanza)   //tangenti esternamente = 1 punto in comune
			return true;
		if(distanza<somma && distanza>differenza)  //secanti = 2 punti in comune
			return true;
		if(differenza==distanza)  //tangenti internamente = 1 punto in comune
			return true;
		if(differenza>distanza)  //interne = 0 punti in comune
			return false;
		if(distanza==0 && c1.raggio==c2.raggio)  //coincidenti = infiniti punti in comune
			return true;
		else if(distanza==0 && c1.raggio!=c2.raggio) //concentriche = 0 punti in comune
			return false;
		
		return false;	
	}
	
	public boolean overlaps(Circle c) {
		/*
		 * Due circonferenze si dicono esterne se la somma dei loro raggi è strettamente minore della distanza tra i loro centri. 
		 * In formule, OA+O′A′<OO′. Due circonferenze in tale posizione non hanno punti in comune.
		 */
		
			
			
		/*Due circonferenze si dicono tangenti esternamente se la somma dei loro raggi è uguale alla distanza tra i loro centri. In formule, OT+O′T=OO′.
		 *  Due circonferenze in tale posizione hanno un solo punto in comune, detto di tangenza.
		 */
		 
			
				
			/*Due circonferenze si dicono secanti se la distanza dei loro centri è, al contempo, minore della somma e maggiore della differenza in valore assoluto dei loro raggi. In formule

			|OA–O′A′|<OO′<OA+O′A′
			Due circonferenze in tale posizione hanno due punti in comune, detti d’intersezione.*/
				
			
			
			/*Definizione 4: Definizione di circonferenze tangenti internamente
				Due circonferenze si dicono tangenti internamente se la differenza in valore assoluto dei loro raggi è uguale alla distanza tra i loro centri.
 				In formule, |OT–O′T|=OO′. Due circonferenze in tale posizione hanno un solo punto in comune, detto di tangenza.
			* 
			 */
				
				
			/*Due circonferenze si dicono interne se la differenza in valore assoluto dei loro raggi è maggiore della distanza tra i loro centri. 
			 * In formule, |OT−O′T|<OO′. Due circonferenze in tale posizione non hanno punti in comune.
			 */
			
			/*Due circonferenze si dicono concentriche se la distanza tra i loro centri è pari a 0. Se inoltre i due raggi hanno uguale misura, 
			 * le circonferenze si dicono coincidenti. Due circonferenze concentriche non coincidenti non hanno punti in comune, al contrario due 
			 * circonferenze coincidenti ne hanno infiniti.
			 */
		
		
		return calcoladistanza(this,c);
	}

	@Override
	public int compareTo(Circle c) {
		return interna(this,c);
	}
}

class Test{
	public static void main(String[] args) {
		Circle c1 = new Circle(0,0,2);
		Circle c2 = new Circle(1,1,1);
		System.out.println(c1.overlaps(c2));
		System.out.println(c1.compareTo(c2));
	}
}