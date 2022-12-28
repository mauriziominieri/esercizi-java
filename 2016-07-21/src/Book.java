import java.util.*;
/*
(Book, 2016-7-21)
Implementare la classe Book, che rappresenta un libro diviso in capitoli. Il metodo addChapter aggiunge un capitolo in coda al libro, caratterizzato da titolo e contenuto. I capitoli sono
automaticamente numerati a partire da 1. Il metodo getChapterName(i) restituisce il titolo del
capitolo i-esimo, mentre il metodo getChapterContent(i) ne restituisce il contenuto.
Gli oggetti Book devono essere clonabili. Inoltre, la classe deve essere dotata di ordinamento
naturale, basato sul numero di capitoli.
L'implementazione deve rispettare il seguente esempio d'uso.
Esempio d'uso:
	Book b = new Book();
	b.addChapter("Prefazione", "Sono passati pochi anni...");
	b.addChapter("Introduzione", "Un calcolatore digitale...");
	b.addChapter("Sistemi di elaborazione", "Un calcolatore...");
	Book bb = b.clone();
	System.out.println(bb.getChapterContent(1));
	System.out.println(bb.getChapterTitle(2));
Output:
	Sono passati pochi anni...
	Introduzione
 */

//dato che gli oggetti della classe devono essere clonabili allora deve implementare l'interfaccia Cloneable
//dato che la classe deve essere dotata di ordinamento naturale allora deve implementare l'interfaccia Comparable
public class Book implements Cloneable,Comparable<Book>{
	
	ArrayList<Chapter> top;    //lista dei capitoli
	
	public Book() {
		top=new ArrayList();
	}
	
	
	public void addChapter(String t,String c) {
		Chapter ch =new Chapter(t,c);
		top.add(ch);
		
	}
	
	public String getChapterContent(Integer i) {
		return top.get(i-1).getContent();     //dato che i capitoli sono numerati a partire da 1
	}
	
	public String getChapterTitle(Integer i) {
		return top.get(i-1).getTitle();
	}
	
	public Book clone() {
		
		try {
	         Book b = (Book) super.clone();
	         return b;    
	      }    
	      catch(CloneNotSupportedException e ){
	         return null;
	      }
	}

	@Override
	public int compareTo(Book o) {
		return this.top.size() - o.top.size();   //induco l'ordinamento in base al numero di capitoli
	}
}


class Chapter{
	
	private String title;
	private String content;
	
	public Chapter(String t,String c) {
		title=t;
		content=c;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getContent() {
		return content;
	}
	
	public String toString() {
		return title;
	}
}

class Test{
	public static void main(String[] args) {
		Book b = new Book();
		b.addChapter("Prefazione", "Sono passati pochi anni...");
		b.addChapter("Introduzione", "Un calcolatore digitale...");
		b.addChapter("Sistemi di elaborazione", "Un calcolatore...");
		Book bb = b.clone();
		System.out.println(bb.getChapterContent(1));
		System.out.println(bb.getChapterTitle(2));
		
		
		
		
		/*Book b1 = new Book();
		b1.addChapter("Prefazione1", "Sono passati pochi anni1");
		b1.addChapter("Prefazione2", "Sono passati pochi anni1");
		b1.addChapter("Prefazione3", "Sono passati pochi anni1");
		b1.addChapter("Prefazione1", "Sono passati pochi anni1");
		
		int n=b.compareTo(b1);
		if(n>0)
			System.out.println(b+" ha più capitoli");
		else if(n<0)
			System.out.println(b+" ha meno capitoli");
		else
			System.out.println("Stesso numero di capitoli");
			*/
	}
}
