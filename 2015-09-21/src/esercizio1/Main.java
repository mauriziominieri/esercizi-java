package esercizio1;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
(Progression, 2015-9-21)
Nell’ambito di un programma di gestione del personale, la classe Progression calcola il salario dei
dipendenti, in base alla loro anzianità in servizio. Il salario mensile parte da un livello base ed ogni
anno solare aumenta di un certo incremento. Il costruttore accetta il salario base e l’incremento
annuale. Il metodo addEmployee aggiunge un impiegato a questa progressione, specificando il
nome e l’anno di assunzione. Il metodo getSalary restituisce il salario mensile di un impiegato
in un dato anno. Infine, il metodo addBonus attribuisce ad un impiegato un bonus extra in un
dato anno. Cioè, addBonus(“Pippo”, 2010, 50) significa che Pippo percepirà 50 euro in più in ogni
mese del 2010.
Caso d’uso:
    Progression a = new Progression(1000, 150);
    a.addEmployee("Jesse", 2008);
    a.addEmployee("Gale", 2009);
    a.addBonus("Gale", 2010, 300);
    System.out.println(a.getSalary("Jesse", 2009));
    System.out.println(a.getSalary("Gale", 2010));
    System.out.println(a.getSalary("Gale", 2011));
Output:
    1150
    1450
    1300
 */

public class Main {
    public static void main(String[] args) {
        Progression a = new Progression(1000, 150);
        a.addEmployee("Jesse", 2008);
        a.addEmployee("Gale", 2009);
        a.addBonus("Gale", 2010, 300);
        System.out.println(a.getSalary("Jesse", 2009)); // mi fa intendere che non ci possano essere due Employee Jesse
        System.out.println(a.getSalary("Gale", 2010));
        System.out.println(a.getSalary("Gale", 2011));
    }
}
