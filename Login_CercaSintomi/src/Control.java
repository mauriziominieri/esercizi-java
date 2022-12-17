import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

//Control/Controller
public class Control {
	
	public String verifica_datiPaziente(String nome,String cognome,List<String> records){
	
	String paz,pazNome=null,pazCognome,pazCF=null;
	
			
		for (int i=0;i<records.size();i++) {
			
			//divido paz in parole divise dal carattere ";" e le assegno
			pazNome=records.get(i).split(";")[0].toLowerCase();
			pazCognome=records.get(i).split(";")[1].toLowerCase();
			if (pazNome.equals(nome.toLowerCase()) && pazCognome.equals(cognome.toLowerCase())) {
				pazCF=records.get(i).split(";")[2];
				return pazCF;
			}
		}
			
		return pazCF;
     }
	
	public String recuperoCartellaClinica(String cf,List<String> records){
		
		String pazCF=null,cc=null;
				
		for (int i=0;i<records.size();i++) {
			
			
			//divido paz in parole divise dal carattere ";" e le assegno
			pazCF=records.get(i).split(";")[0];
			
			if (pazCF.equals(cf)) {
				cc=records.get(i).split(";")[1];
				return cc;
			}
			
		}
				
			return cc;
	   }
	
	
	//cerca paziente page
   public void esegui() throws FileNotFoundException, NullPointerException, IOException {
   	
   	   //parte di codice della ricerca nella cartella clinica
	   RicercaPazientePage pr = new RicercaPazientePage();
	   CartellaClinica cc=new CartellaClinica();
	   Control c = new Control();
	   String pazCF=null;
	   pr.mostra();
	   
	   do{   //facciamo inserire i dati del paziente finchè non li trova (concorde al diagramma)
			
			pr.InserisciDatiPaziente();
			String nome =  pr.getnome();
			String cognome =  pr.getcognome();
			
			Paziente p= new Paziente();
			
			List<String> recordsPaziente=p.fornisceDati();
			System.out.println(recordsPaziente); 
			pazCF=c.verifica_datiPaziente(nome,cognome,recordsPaziente);
			

			if(pazCF != null){ 
				//String sintomo = cc.Cerca_CC(pazCF);
				List<String> recordsCC = cc.fornisceDati();
				String cartellaClinica = c.recuperoCartellaClinica(pazCF,recordsCC);
				CartellaClinicaPage ccp = new CartellaClinicaPage(cartellaClinica);
				ccp.mostra();
			}
			else
				pr.mostraPazienteNonTrovato();
		}
	    while(pazCF==null);
		
	}
   
   
   public Boolean verificaDati() throws FileNotFoundException {
		
		 String user,pass;
	    
		 LoginPage lp = new LoginPage(); 
		 lp.mostra();
		 lp.InserisciCredenziali();     //inserimento dei dati nella boundary
		 user = lp.getName();           //il controller prende il dato name dalla boundary
		 pass = lp.getPassword();        //il controller prende il dato password dalla boundary
		 String user_pass_da_tastiera = (user + pass);  //ElenaXX
		 
		 Operatore o = new Operatore();
		 List<String> records_da_file = o.fornisceDati();  //dati che ci vengono forniti dalla entity Operatore
		// System.out.println("records nel main: "+records_da_file);
		 
		 if (records_da_file.contains(user_pass_da_tastiera)) //verifica di tali dati
			 return true;
		
		 return false;
	}

	public static void main(String[] args) throws FileNotFoundException, NullPointerException, IOException {
		
		Control c = new Control();   //controller unico
		Integer tentativi = 3;
		LoginPage lp=new LoginPage();
		
		Operatore o=new Operatore();
		
		while (tentativi-- > 0)  //Finchè i tentativi sono maggiori di 0 (all'inizio sono 3)
	    {
	        if (c.verificaDati()) {   //se la funzione ci restituisce true
	        	lp.mostraLoginEffettuato();
	            c.esegui();
	            return;
	        }
	        else    //se la funzione ci restituisce false
	        	lp.mostraLoginErrato(tentativi);
	           
	    }
		
		LoginBloccatoPage lb = new LoginBloccatoPage();
		lb.mostra();
	}

}
