import java.sql.SQLException;
import java.util.Scanner;

public class Control {
	
	public boolean tryLogin(){
		
		Database db = new Database();
		Scanner scan= new Scanner(System.in);
		System.out.println("Login\n");
		
		System.out.println("Inserisci username:" ); 
		String username = scan.nextLine();
		
		System.out.println("Inserisci password:"); 
	    String password = scan.nextLine();
		   
	    db.printLoginData();
		    
	    if(db.check(username,password)) 
	        return true;
		    
		return false;
	}
	
	
	public void cercaCC(){
		
		Database db = new Database();
		Paziente pa = new Paziente();
		Scanner scan= new Scanner(System.in);
	 
		
	    db.printPazienti();
		System.out.println("\nInserisci nome paziente:" ); 
		String nome = scan.nextLine();
		
		System.out.println("Inserisci cognome paziente:"); 
		  String cognome = scan.nextLine();
		   
		    scan.close();
		    
		    
		  
		    
		    String cf=db.findPaziente(nome,cognome);
		    
		    if(cf!=null) 
		        db.printSintomo(cf);
		    else
		    	System.out.println("\npaziente non trovato"); 
	}
	
	
	/* eseguo il login da medico(max 3 volte), inserisco nome e cognome paziente. 
	 * Il programma mi deve dire il sintomo di tale paziente.
	 * Ci sono 3 tabelle, login, paziente con nome cognome e cf, cartella clinica con cf e sintomo
	 */
	public static void main(String args[]) throws SQLException {
		
	    Control c = new Control();
		Integer tentativi = 3;
		
		while (tentativi-- > 0) 
	    {
	        if (c.tryLogin()) {
	            System.out.println("\nLogin effettuato!\n");
	            c.cercaCC();
	            return;
	        }
	        else 
	            System.out.println("\nLogin errato. Numero di tentativi rimasti: " + tentativi);        
	    }
			    
			    
	}

}
