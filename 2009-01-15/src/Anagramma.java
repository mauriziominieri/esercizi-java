/*
 * . (Anagramma, 2009-1-15)
Si implementi un metodo statico che prende come argomenti due stringhe e restituisce vero se
sono l'una l'anagramma dell'altra e falso altrimenti.
 */
import java.util.Arrays;  
public class Anagramma {
	
	static boolean anagramma(String str1, String str2) {  
        String s1 = str1.replaceAll("\\s", "");  
        String s2 = str2.replaceAll("\\s", "");  
        boolean status = true;  
        
        if (s1.length() != s2.length())  
           return false;  
       
        char[] ArrayS1 = s1.toLowerCase().toCharArray();  
        char[] ArrayS2 = s2.toLowerCase().toCharArray();  
        Arrays.sort(ArrayS1);  
        Arrays.sort(ArrayS2);  
        if(Arrays.equals(ArrayS1, ArrayS2)) return true;
        else return false;
    }  

	public static void main(String[] args) {
		System.out.println(anagramma("tiziano","notizia"));
		System.out.println(anagramma("mela","alam"));
		System.out.println(anagramma("elam","mela"));
	}
}