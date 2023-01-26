package question174;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
Which two actions, independently, enable the code to compile?
    1. Replacing the catch block with:
       catch (Exception e) { }
    2. Adding throws IOException declaration at the main() method
 */
/*
L'oggetto FileInputStream è dichiarato e inizializzato all'interno del blocco try con la parola chiave try (...). Questo è conosciuto come try-with-resources statement e garantisce che l'oggetto FileInputStream venga chiuso automaticamente una volta che il blocco try è stato completato, indipendentemente dal fatto che ci sia stato un errore o meno.
Quando finisce il try quindi viene chiamato in automatico il metodo public void close() throws IOException della FileInputStream e quindi il catch della FileNotFoundException non basta (è una sottoclasse della IOException), devo insomma dichiarare o gestire l'eccezione IOException.
Se l'oggetto FileInputStream è dichiarato e inizializzato fuori dal blocco try deve essere chiuso manualmente all'interno del blocco finally o utilizzando una funzionalità simile per evitare problemi di memoria o altri problemi di gestione delle risorse.
In generale, si consiglia di utilizzare il try-with-resources statement quando si lavora con oggetti che implementano l'interfaccia AutoCloseable, in quanto garantisce che le risorse vengano chiuse in modo sicuro e automatico.
 */
public class FileHandler {
    public static void main(String[] args) throws IOException {
        try (FileInputStream in = new FileInputStream("foo.txt")) { }
        catch (FileNotFoundException e) { }
    }
}