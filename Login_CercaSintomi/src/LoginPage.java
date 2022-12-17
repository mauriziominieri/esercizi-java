import java.util.Scanner;

//Boundary/View
public class LoginPage {
	
	private String username, password; 
	
	public void mostra(){	 
		
		  System.out.println("*------------*");
		  System.out.println("| Login PAGE |"); 
		  System.out.println("*------------*");
	}
	
	public void mostraLoginEffettuato(){	 
		 System.out.println("\nLogin effettuato!\n"); 
	}
	
	public void mostraLoginErrato(int tentativi){	 
		  System.out.println("\nLogin errato. Numero di tentativi rimasti: " + tentativi);   
	}
    
	public void InserisciCredenziali(){	 //i dati che l'operatore mette nella pagina
		 	
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Inserisci username:" ); 
		username = scan.nextLine();
		
		System.out.println("Inserisci password:"); 
	    password = scan.nextLine();
	   
	   // scan.close();
	}
	
	public String getName() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}

}


