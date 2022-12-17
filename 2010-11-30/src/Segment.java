import java.util.*;

/*
 * (Segment, 2010-11-30)
Implementare la classe Segment, che rappresenta un segmento collocato nel piano cartesiano. Il
costruttore accetta le coordinate dei due vertici, nell'ordine x1, y1, x2, y2. Il metodo getDistance
restituisce la distanza tra la retta che contiene il segmento e l'origine del piano. Ridenire il
metodo equals in modo che due segmenti siano considerati uguali se hanno gli stessi vertici. Fare
in modo che i segmenti siano clonabili.
Si ricordi che:
• L'area del triangolo con vertici di coordinate (x1, y1), (x2, y2) e (x3, y3) è data da:
					
					|x1(y2 − y3) − x2(y1 − y3) + x3(y1 − y2)|/2

.
Esempio d'uso:
Segment s1 = new Segment(0.0, −3.0, 4.0, 0.0);
Segment s2 = new Segment(4.0, 0.0, 0.0, −3.0);
Segment s3 = s2.clone();
System.out.println(s1.equals(s2));
System.out.println(s1.getDistance());
Output dell'esempio d'uso:
true
2.4
 */


//dato che farò l'override del metodo equals farò anche quello del hashcode, infatti i due sono sempre associati dato il fatto che se sono uguali per equals dovrebbero avere anche 
//la stessa locazione di memoria e quindi lo stesso hashcode
public class Segment implements Cloneable {
	
	private double x1,x2,y1,y2;
	private static int generalCode = 1;
	private int code;

	public Segment(double x1,double y1,double x2, double y2) {
		this.x1=x1;
		this.x2=x2;
		this.y1=y1;
		this.y2=y2;
		
		code=generalCode++;
	}
	
	
	public Segment clone() {
		
		try {
	         Segment s = (Segment) super.clone();
	         return s;    
		 }    
		 catch(CloneNotSupportedException e ){
		     return null;
		 }
	}
	
	@Override
	public boolean equals(Object obj) {
		
		Segment s = (Segment) obj;
		if(s.x1 == this.x1 && s.y1 == this.y1 && s.x2 == this.x2 && s.y2 == this.y2) {
			s.code = this.code;
			return true;
		}
		
		if(s.x1 == this.x2 && s.y1 == this.y2 && s.x2 == this.x1 && s.y2 == this.y1) {
			s.code = this.code;
			return true;
		}
			
		return false;
	}
	
	@Override
	public int hashCode() {
		return code;
	}
	
	public double getDistance() {
		
		double area = Math.abs(this.x1*(this.y2-0.0) - this.x2*(this.y1-0.0))/2;
		double ipotenusa = Math.sqrt(Math.pow(this.x2-this.x1,2) + Math.pow(this.y2-this.y1,2));
		double h = (2*area)/ipotenusa;    //altezza triangolo rettangolo con area e ipotenusa
		
		//double medioX = (this.x1 + this.x2)/2;  //punto medio (non necessario)
		//double medioY = (this.y1 + this.y2)/2;
		//double pX = 0.0;  //il 3 punto, cioè il centro del piano cartesiano
		//double pY = 0.0;
		//double c1 = Math.sqrt(Math.pow(this.x1-pX,2) + Math.pow(this.y1-pY,2));
		//double c2 = Math.sqrt(Math.pow(this.x2-pX,2) + Math.pow(this.y2-pY,2));
		//double h1 = (c1*c2)/ipotenusa;      //altezza con cateti e ipotenusa
		
		return h;
	}
}

class Test {
	public static void main(String[] args) {
		Segment s1 = new Segment(0.0, -3.0, 4.0, 0.0);
		Segment s2 = new Segment(4.0, 0.0, 0.0, -3.0);
		Segment s3 = s2.clone();
		System.out.println(s1.equals(s2));
		System.out.println(s1.getDistance());
	}
}