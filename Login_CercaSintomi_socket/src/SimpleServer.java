import java.net.*; 
import java.io.*;

public class SimpleServer {
	
	private int port; 
	private ServerSocket server;

	public SimpleServer (int port) { 
		
		this.port = port; if(!startServer()) System.err.println("Errore durante la creazione del Server"); 
	}

	private boolean startServer() { 
		
		try { 
			server = new ServerSocket(port); 
		} 
		catch (IOException ex) { 
			ex.printStackTrace(); 
			return false; 
		} 
		
		System.out.println("Server creato con successo!"); 
		return true; 
	}
	

	public void runServer() { 
		while (true) { 
			try { // Il server resta in attesa di una richiesta 
				System.out.println("Server in attesa di richieste…"); 
				Socket s1 = server.accept(); 
				System.out.println("Un client si e’ connesso…");
			
				// Ricava lo stream di output associate al socket e definisce una classe wrapper di tipo BufferedWriter per semplificare le operazioni di scrittura 
				OutputStream s1out = s1.getOutputStream(); 
				BufferedWriter bw = new BufferedWriter( new OutputStreamWriter(s1out));
			
				// Il server invia la risposta al client 
				bw.write("Benvenuto sul server!n");
			
				// Chiude lo strema di output e la connessione 
				bw.close(); s1.close(); 
				System.out.println("Chiusura connessione effettuata"); 
			} 
			catch (IOException ex) { 
				ex.printStackTrace(); 
			} 
		} 
	}

	public static void main (String args[]) { 
		// Crea un oggetto di tipo SimpleServer in ascolto 
		// sulla porta 7777 
		SimpleServer ss = new SimpleServer(7777); 
		ss.runServer(); 
	}
}
