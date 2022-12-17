import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CartellaClinica {
	
	private String filepath="src/CC.csv";

	public List<String> fornisceDati() throws FileNotFoundException, IOException, NullPointerException{
		
	   
		String line,sintomo=null;
	    BufferedReader buffer;
	    List<String> records = new ArrayList();
		
		try {
			
			buffer = new BufferedReader (new FileReader(filepath));;
			
			while((line = buffer.readLine()) != null) {
			    records.add(line);
				//System.out.println(paz);
				/*if (paz.contains(cf)) {
			    	sintomo = paz.split(";")[1];
			        return sintomo;
			    }*/
			}
			
			buffer.close();
		}
		catch (IOException e) {
			System.err.print("File non trovato");
			e.printStackTrace();
		}
		
		
		return records;
	}
	
	
	/* public List<String> fornisceDati() throws FileNotFoundException {
		 
		 System.out.println("sono dentro la entity cartella clinica");
	    	
	    	List<String> records = new ArrayList();
	    	
	    	try {
	    		Scanner scan2 = new Scanner(new File(filepath1));
	    		scan2.reset();
	    		
	    		
	    		while(scan2.hasNext()) {
		    		 System.out.println("sono dentro al while");
		    		 records.add(scan2.next());
		    		  //System.out.println("records: "+records);
		    	}
		    	
		    	scan2.close();
	   	   }
	   	   catch(FileNotFoundException e) {
	   		   System.out.println("Non riesco a trovare il file");
	   	   }
	   	   
	    	
	    	return records;
	    }*/
}
