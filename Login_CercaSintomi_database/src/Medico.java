import java.util.Scanner;

public class Medico {

	private String username, password; 
    
	
	public void setCredenziali(){	 
		 	
		Scanner scan= new Scanner(System.in);
		System.out.println("Inserimento credenziali nel database\n");
		
		System.out.println("Inserisci username:" ); 
		username = scan.nextLine();
		
		System.out.println("Inserisci password:"); 
	    password = scan.nextLine();
	   
	    scan.close();
	   }
	
	
	public String getName() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}
}
