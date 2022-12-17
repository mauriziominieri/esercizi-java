import java.util.Scanner;

public class Paziente {

	public String nome;
	public String cognome;
	public String cf;
	

 	public void inserisci() {
		 
		 Scanner scanner= new Scanner(System.in);
		
		 
		 System.out.println("Inserire nome: ");
		 nome=scanner.nextLine();
		 
		 System.out.println("Inserire cognome: ");
		 cognome=scanner.nextLine();
		 
		 System.out.println("Inserire CF: ");
		 cf=scanner.nextLine();
		
		 scanner.close();
	 }
 	
 	

 
	public String getNome() {
		
		return nome;
	}
	public String getCognome() {
		
		return cognome;
	}
	public String getCF() {
		
		return cf;
	}

	public String toString() {
	      return "nome: "+nome+" cognome: "+cognome;
	  
	}
}
