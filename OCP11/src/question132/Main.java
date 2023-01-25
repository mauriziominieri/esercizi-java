package question132;

import java.util.stream.IntStream;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
What is the result?
    The program prints nothing.
 */
/*
Il metodo peek() è una delle operazioni intermedie disponibili sugli stream in Java. Gli stream sono progettati per lavorare in modo "lazy", ovvero non eseguono alcuna operazione finché non viene chiamata un'operazione di terminazione.
Le operazioni intermedie, come peek(), vengono utilizzate per costruire la pipeline di elaborazione degli elementi dello stream.
Il metodo peek() accetta un parametro di tipo Consumer, che è una interfaccia funzionale che accetta un parametro di un certo tipo e non restituisce alcun valore.
Il metodo peek() esegue l'azione specificata dal consumer su ogni elemento dello stream senza modificarlo e restituisce un nuovo stream con gli stessi elementi.
In altre parole, peek() è utilizzato per "guardare" gli elementi dello stream mentre vengono elaborati senza modificarli e non termina lo stream.
Le operazioni di terminazione, come forEach(), count(), collect() e toArray() sono utilizzate per eseguire effettivamente le operazioni sugli elementi dello stream.
Per stampare i valori della variabile "i" è possibile utilizzare l'operazione di terminazione forEach().
Se al posto del secondo peek() ci fosse un forEach() allora avrei 123 e poi l'eccezione
 */
public class Main {
    public static void main(String[] args) {
        IntStream.range(1, 4)
            .peek(System.out::print)
            .peek(i -> {
                if (i == 3)
                    throw new RuntimeException("Exception thrown");
            });
    }
}