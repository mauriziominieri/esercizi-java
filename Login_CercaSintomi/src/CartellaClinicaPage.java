import java.util.Scanner;

//Boundary/View
public class CartellaClinicaPage {

		private String sintomo;
		
		public CartellaClinicaPage(String s) {
			sintomo = s;
		}
		
		
		public void mostra(){	 
			
			  System.out.println("\n*----------------------*");
			  System.out.println("| CartellaClinica PAGE |"); 
			  System.out.println("*----------------------*");
			  
			  System.out.println("SINTOMO : "+sintomo);
		}
		
}
