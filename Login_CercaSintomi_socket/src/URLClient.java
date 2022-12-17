import java.io.*; 
import java.net.*;

public class URLClient { 
	
	private String strURL;

	public URLClient(String strURL){ 
		this.strURL = strURL; 
	}

	public String retrievePage (){ 
		
		StringBuffer document = new StringBuffer();

		try { 
			
			URL url = new URL(strURL); 
			URLConnection conn = url.openConnection(); 
			BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));

			String line = null;

			while ((line = reader.readLine()) != null) document.append(line + "n");

			reader.close(); 
		} 
		catch (MalformedURLException e) { 
			
			System.out.println("MalformedException durante la connessione"); 
		} 
		catch (IOException e) { 
			
			System.out.println("IOException durante la connessione"); 
		}

		return document.toString(); 
	}

	public static void main(String[] args) { 
		
		URLClient client = new URLClient("http://www.html.it"); 
		String webPage = client.retrievePage();

		try { 
			
			FileWriter out = new FileWriter ("htmlit.html"); 
			out.write(webPage); out.close(); 
		} 
		catch (Exception ex) { 
			
			ex.printStackTrace(); 
		}
	} 

}