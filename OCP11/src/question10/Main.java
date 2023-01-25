package question10;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
You want to implement the java.io.Serializable interface to the MyPersistenceData class.
Which method should be overriden?
    Nothing
 */
// L'interfaccia Serializable serve a marcare una classe in modo che le sue istanze possano essere convertite in un flusso di byte per poter essere salvate su un file o trasmesse in rete.
// L'interfaccia non ha metodi da implementare, è solo un'etichetta per indicare che la classe è serializzabile, il meccanismo di serializzazione è già implementato nel framework di Java.
class MyPersistenceData {
    String str;
    private void methodA() {
        System.out.println("methodA");
    }
}
public class Main {}