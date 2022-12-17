import java.util.*;
/*
 * . (DataSeries, 2015-1-20)
Realizzare la classe DataSeries, che rappresenta una serie storica di dati numerici (ad es., la
popolazione di una regione anno per anno). Il metodo set imposta il valore della serie per un
dato anno. Il metodo statico comparatorByYear accetta un anno e restituisce un comparatore tra
serie di dati che confronta il valore delle due serie per quell'anno.
Esempio d'uso:
DataSeries pop1 = new DataSeries(),
pop2 = new DataSeries();
pop1.set(2000, 15000.0); pop1.set(2005, 18500.0); pop1.set(2010, 19000.0);
pop2.set(2000, 12000.0); pop2.set(2005, 16000.0); pop2.set(2010, 21000.0);
Comparator<DataSeries> c2005 = DataSeries.comparatorByYear(2005),
c2010 = DataSeries.comparatorByYear(2010);
System.out.println(c2005.compare(pop1, pop2));
System.out.println(c2010.compare(pop1, pop2));
Output:
1
-1
 */
public class DataSeries {
	
	private int anno;
	private double popolazione;
	private Map<Integer,Double> m;
	
	public DataSeries() {
		m = new HashMap<Integer, Double>();
	}

	public void set(int a,double p) {
		m.put(a, p);
	}
	
	public static Comparator<DataSeries> comparatorByYear(int y){
		return new Comparator<DataSeries>() {  //classe anonima

			@Override
			public int compare(DataSeries o1, DataSeries o2) {
				if(o1.m.get(y)>o2.m.get(y)) return 1;
				else if(o1.m.get(y)<o2.m.get(y)) return -1;
				else return 0;
			}  
			
		};
	}
}

class Test{
	public static void main(String[] args) {
		DataSeries pop1 = new DataSeries(),pop2 = new DataSeries();
		pop1.set(2000, 15000.0); pop1.set(2005, 18500.0); pop1.set(2010, 19000.0);
		pop2.set(2000, 12000.0); pop2.set(2005, 16000.0); pop2.set(2010, 21000.0);
		Comparator<DataSeries> c2005 = DataSeries.comparatorByYear(2005), c2010 = DataSeries.comparatorByYear(2010);
		System.out.println(c2005.compare(pop1, pop2));
		System.out.println(c2010.compare(pop1, pop2));
	}
}