import java.io.BufferedReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



//Entity/Model Operatore, il suo compito è solo quello di prendere i dati dal file operatore.txt e fornirli al controller
public class Operatore{
	
	private String filepath = "src/operatore.txt";
    
    public List<String> fornisceDati() throws FileNotFoundException {
    	
    	Scanner scan = null;
    	List<String> records = new ArrayList();
    	
    	try {
    		scan = new Scanner(new File(filepath));
   	   }
   	   catch(FileNotFoundException e) {
   		   System.out.println("Non riesco a trovare il file");
   	   }
   	   
    	while(scan.hasNext()) {
    		
    		 records.add(scan.next());
    		 // System.out.println("records: "+records);
    	}
    	
    	scan.close();
    	return records;
    }

}








