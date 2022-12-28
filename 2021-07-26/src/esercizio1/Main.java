package esercizio1;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
(GreenPass, 2021-7-26)
Realizzare le classi Person e GreenPass che rappresentano una persona e una certificazione verde.
Una persona è identificata dal suo nome. Il metodo vaccinate di Person accetta come argomento
la data di vaccinazione (un intero che rappresenta un giorno) e restituisce un oggetto GreenPass.
La classe GreenPass offre i seguenti metodi:
• isValidOn accetta una data e restituisce vero se questa certificazione verde è valida in quella data.
• belongsTo accetta un Person e restituisce vero se questa certificazione appartiene a quella persona.
La validità di un GreenPass è definita dalle seguenti regole:
• se si tratta della prima dose (prima chiamata a vaccinate per questa persona), il GreenPass è valido per 180 giorni;
• negli altri casi, il GreenPass è valido per 270 giorni.
Opzionale: Fare in modo che l’unico modo per creare oggetti GreenPass sia tramite il metodo
vaccinate (qualsiasi altro tentativo deve provocare errore di compilazione o eccezione a runtime).
L’implementazione deve rispettare il seguente esempio d’uso.
Esempio d’uso:
    Person aldo = new Person("Aldo"), barbara = new Person("Barbara");
    GreenPass p1 = aldo.vaccinate(10), p2 = aldo.vaccinate(250);
    System.out.println(p1.isValidOn(20));
    System.out.println(p1.isValidOn(200));
    System.out.println(p1.belongsTo(barbara));
Output:
    true
    false
    false
 */

public class Main {
    public static void main(String[] args) {
        Person aldo = new Person("Aldo"), barbara = new Person("Barbara");
        GreenPass p1 = aldo.vaccinate(10), p2 = aldo.vaccinate(250);
        System.out.println(p1.isValidOn(20));
        System.out.println(p1.isValidOn(200));
        System.out.println(p1.belongsTo(barbara));
    }
}
