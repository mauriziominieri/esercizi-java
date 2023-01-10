package esercizio1b;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
(Panino, 2012-4-23)
Implementare la classe Panino, il cui metodo addIngrediente aggiunge un ingrediente, scelto da
un elenco fisso. Gli ingredienti sono divisi in categorie. Se si tenta di aggiungere più di un
ingrediente della stessa categoria, il metodo addIngrediente solleva un’eccezione.
Elenco delle categorie e degli ingredienti:
ripieni: PROSCIUTTO, SALAME
formaggi: SOTTILETTA, MOZZARELLA
salse: MAIONESE, SENAPE
Esempio d’uso:
    Panino p = new Panino();
    p.addIngrediente(Panino.Ingrediente.SALAME);
    p.addIngrediente(Panino.Ingrediente.SOTTILETTA);
    System.out.println(p);
    p.addIngrediente(Panino.Ingrediente.MOZZARELLA);
Output dell’esempio d’uso:
    panino con SALAME, SOTTILETTA
    Exception in thread "main"...
 */

public class Main {
    public static void main(String[] args) {
        Panino p = new Panino();
        p.addIngrediente(Panino.Ingrediente.SALAME);
        p.addIngrediente(Panino.Ingrediente.SOTTILETTA);
        System.out.println(p);
        p.addIngrediente(Panino.Ingrediente.MOZZARELLA);
    }
}
