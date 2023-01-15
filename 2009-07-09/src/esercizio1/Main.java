package esercizio1;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
(Washer, 2009-7-9)
La seguente classe rappresenta le operazioni elementari di una lavatrice:
class Washer {
    public void setTemp(int temp) { System.out.println("Setting␣temperature␣to␣" + temp); }
    public void setSpeed(int rpm) { System.out.println("Setting␣speed␣to␣" + rpm); }
    public void addSoap() { System.out.println("Adding␣soap!"); }
}
Si implementi una classe Program, che rappresenta un programma di lavaggio per una lavatrice.
Il metodo addAction aggiunge una nuova operazione elementare al programma. Un’operazione
elementare può essere una delle tre operazioni elementari della lavatrice, oppure l’operazione
“Wait”, che aspetta un dato numero di minuti. Il metodo execute applica il programma ad una
data lavatrice.
Esempio d’uso:
    Washer w = new Washer();
    Program p = new Program();
    p.addAction(new Program.SetTemp(30));
    p.addAction(new Program.SetSpeed(20));
    p.addAction(new Program.Wait(10));
    p.addAction(new Program.AddSoap());
    p.addAction(new Program.SetSpeed(100));
    p.addAction(new Program.Wait(10));
    p.addAction(new Program.SetSpeed(0));
    p.execute(w);
Output dell’esempio d’uso:
    Setting temperature to 30
    Setting speed to 20
    Adding soap! (dopo 10 minuti)
    Setting speed to 100
    Setting speed to 0 (dopo 10 minuti)
 */

public class Main {
    public static void main(String[] args) {
        Washer w = new Washer();
        Program p = new Program();
        p.addAction(new Program.SetTemp(30));
        p.addAction(new Program.SetSpeed(20));
        p.addAction(new Program.Wait(10));
        p.addAction(new Program.AddSoap());
        p.addAction(new Program.SetSpeed(100));
        p.addAction(new Program.Wait(10));
        p.addAction(new Program.SetSpeed(0));
        p.execute(w);
    }
}
