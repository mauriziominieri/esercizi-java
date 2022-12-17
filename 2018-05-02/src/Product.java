import java.util.*;
/*
 * (Product, 2018-5-2)
[CrowdGrader] Realizzare la classe Product, che rappresenta un prodotto di un supermercato,
caratterizzato da descrizione e prezzo. I prodotti sono dotati di ordinamento naturale, in base
alla loro descrizione (ordine alfabetico). Il metodo getMostExpensive restituisce il prodotto più
costoso. Il campo comparatorByPrice contiene un comparatore tra prodotti, che confronta i prezzi.
L'implementazione deve rispettare il seguente esempio d'uso.
Esempio d'uso:
Product a = new Product("Sale", 0.60),
b = new Product("Zucchero", 0.95),
c = new Product("Cae'", 2.54);
System.out.println(Product.getMostExpensive());
System.out.println(b.compareTo(c));
System.out.println(Product.comparatorByPrice.compare(b, c));
Output:
Caffe', 2.54
1
-1
 */

//dato che la classe deve essere dotata di ordinamento naturale allora deve implementare l'interfaccia Comparable
public class Product implements Comparable<Product>{

	private String descrizione;
	private Double prezzo;
	private static Product pMax;
	
	protected static Comparator<Product> comparatorByPrice = new Comparator<Product>() {

		@Override
		public int compare(Product p1, Product p2) {
			if(p1.prezzo>p2.prezzo) return 1;
			else if(p1.prezzo<p2.prezzo) return -1;
			else return 0;
		}
		
	};
	
	public Product(String d,Double p) {
		descrizione = d;
		prezzo = p;
		
		if(pMax == null || pMax.prezzo<p)
			pMax = this;
	}
	
	public static Product getMostExpensive() {
		return pMax;
	}
	
	
	@Override
	public int compareTo(Product p) {
		if(this.descrizione.compareTo(p.descrizione)>0) return 1;
		else if(this.descrizione.compareTo(p.descrizione)<0) return -1;
		else return 0;
	}
	
	
	
	public String toString() {
		return descrizione+", "+prezzo;
	}
	
	

}

class Test {
	public static void main(String[] args) {
		Product a = new Product("Sale", 0.60),b = new Product("Zucchero", 0.95),c = new Product("Caffe'", 2.54);
		System.out.println(Product.getMostExpensive());
		System.out.println(b.compareTo(c));   //capisco che ci deve essere l'interfaccia comparable
		System.out.println(Product.comparatorByPrice.compare(b, c));
	}
}