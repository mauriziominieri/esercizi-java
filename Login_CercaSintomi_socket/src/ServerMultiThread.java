import java.net.*; 
import java.io.*;

public class ServerMultiThread { 
	
	private int port; private ServerSocket server; private Socket client;

	public ServerMultiThread (int port) { 
		this.port = port; if(!startServer()) System.err.println("Errore durate la creazione del Server"); 
	}
	
	private boolean startServer() { 
		try { 
			server = new ServerSocket(port); 
		} 
		catch (IOException ex) { ex.printStackTrace(); return false; } 
		System.out.println("Server multi thread creato con successo!"); 
		return true; 
	}

	public void runServer() { 
		while (true) { 
			try { // Il server resta in attesa di una richiesta 
				System.out.println("Server in attesa di richieste…"); 
				client = server.accept(); 
				System.out.println("Un client si e’ connesso…"); 
				ParallelServer pServer = new ParallelServer(client); 
				Thread t = new Thread (pServer); t.start(); 
			} 
			catch (IOException ex) { ex.printStackTrace(); } 
		} 
	}

	public class ParallelServer implements Runnable { 
		
		private Socket client; 
		public ParallelServer (Socket client) { 
			this.client = client; 
		}

		public void run() { 
			try { 
				// Ricava lo stream di output associate al socket e definisce una classe wrapper di tipo BufferedWriter per semplificare le operazioni di scrittura 
				OutputStream s1out = client.getOutputStream(); 
				BufferedWriter bw = new BufferedWriter( new OutputStreamWriter(s1out));
			
				// Il server invia la risposta al client 
				bw.write("Benvenuto sul server!n");
	
				// Chiude lo stream di output e la connessione 
				bw.close(); 
				client.close(); 
				System.out.println("Chiusura connessione effettuata"); 
			} 
			catch (IOException ex){ ex.printStackTrace(); } 
			catch (Exception e){ e.printStackTrace(); } 
		} 
	}

	public static void main (String args[]) { 
		SimpleServer ss = new SimpleServer(7777); 
		ss.runServer(); 
	}
}