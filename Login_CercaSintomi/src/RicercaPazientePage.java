import java.util.Scanner;

//Boundary/View
public class RicercaPazientePage {

	private String nome;
	private String cognome;
	
	
	public void mostra(){	 
		
		  System.out.println("*---------------*");
		  System.out.println("| Paziente PAGE |"); 
		  System.out.println("*---------------*");
	}
	
 	public void InserisciDatiPaziente() {   //i dati del paziente che l'operatore mette nella pagina
		
		 Scanner scanner= new Scanner(System.in);
		// inserire nome,cognome e codice fiscale da tastiera;
		 
		 System.out.println("inserire nome paziente: ");
		 nome=scanner.nextLine();
		 
		 System.out.println("inserire cognome paziente: ");
		 cognome=scanner.nextLine();
	 }
 	
 	public void mostraPazienteNonTrovato() {
 		System.out.println("\npaziente non trovato\n\n");
 	}

 
	public String getnome() {
		
		return nome;
	}
	public String getcognome() {
		
		return cognome;
	}
	
	public String toString() {
		
		return nome+" "+cognome;
	}

}
