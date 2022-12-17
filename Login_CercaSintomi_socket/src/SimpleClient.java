import java.net.*; 
import java.io.*;

public class SimpleClient { 
	
	public static void main(String args[]) { 
		
		try { // Apre una connessione verso un server in ascolto sulla porta 7777. In questo caso utilizziamo localhost che corrisponde all’indirizzo IP 127.0.0.1 
			System.out.println("Apertura connessione…"); 
			Socket s1 = new Socket ("127.0.0.1", 7777);
		
			// Ricava lo stream di input dal socket s1 ed utilizza un oggetto wrapper di classe BufferedReader per semplificare le operazioni di lettura 
			InputStream is = s1.getInputStream(); 
			BufferedReader dis = new BufferedReader( new InputStreamReader(is));
			
			// Legge l’input e lo visualizza sullo schermo 
			System.out.println("Risposta del server: " + dis.readLine());
			
			// Al termine, chiude lo stream di comunicazione e il socket. 
			dis.close(); 
			s1.close(); 
			System.out.println("Chiusura connessione effettuata"); 
		} 
		catch (ConnectException connExc) { 
			System.err.println("Errore nella connessione "); } 
		catch (IOException ex) { 
			ex.printStackTrace(); 
		} 
	}
}