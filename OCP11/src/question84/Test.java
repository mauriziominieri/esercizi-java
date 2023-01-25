package question84;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*  TODO: qual è la risposta corretta? Tecnicamente 2 sono valide, forse gestire la RuntimeException è considerato un errore, quindi opterei più per catch(L e)
What change on line 1 will make this code compile?
    Add catch(L | N e)  // catcho anche la RuntimeException, il che non è necessario
    Add catch(L e)
 */
/*
Le checked exception sono dovute a circostanze esterne che il programmatore non può evitare, il compilatore vuole sapere cosa fare nel caso si verifichi l'eccezione.
Quindi solo loro devono essere DICHIARATE (con throws sul metodo) o GESTITE (con try catch)
 */
public class Test {
    class L extends Exception {}
    class M extends L {}
    class N extends RuntimeException {}
    public void p() throws L { throw new M(); }
    public void q() throws N { throw new N(); }
    public static void main(String[] args) {
        try {
            Test t = new Test();
            t.p();
            t.q();  // unchecked exception, non è necessario gestirla
        } catch(L e) /* line 1 */ {
            System.out.println("Exception caught");
        }
    }
}