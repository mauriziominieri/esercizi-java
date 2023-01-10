package esercizio1b;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class Panino {

    enum Category {
        RIPIENI, FORMAGGI, SALSE;
    }

    enum Ingrediente {
        PROSCIUTTO(Category.RIPIENI),
        SALAME(Category.RIPIENI),
        SOTTILETTA(Category.FORMAGGI),
        MOZZARELLA(Category.FORMAGGI),
        MAIONESE(Category.SALSE),
        SENAPE(Category.SALSE);

        private final Category category;

        Ingrediente(Category category) { this.category = category; }

        Category getCategory() { return category; }
    }

    private final Set<Ingrediente> ingredienteSet;

    public Panino() {
        ingredienteSet = new LinkedHashSet<>();
    }

    public void addIngrediente(Ingrediente ingrediente) {
        for(Ingrediente i : ingredienteSet)
            if(i.getCategory() == ingrediente.getCategory())
                throw new RuntimeException("Impossibile aggiungere " + ingrediente + ". Esiste già " + i + " della categoria " + i.getCategory());
        ingredienteSet.add(ingrediente);
    }

    @Override
    public String toString() {
        return "panino con " + ingredienteSet;
    }
}
