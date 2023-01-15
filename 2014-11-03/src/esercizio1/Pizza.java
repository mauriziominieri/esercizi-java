package esercizio1;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class Pizza implements Comparable<Pizza>, Cloneable {

    enum Ingrediente {
        POMODORO(18),
        MOZZARELLA(280),
        AGLIO(41);

        private final int nCalorie;

        Ingrediente(int nCalorie) {
            this.nCalorie = nCalorie;
        }
    }

    private int nCalorie;

    public void addIngrediente(Ingrediente ingrediente) {
        this.nCalorie += ingrediente.nCalorie;
    }

    @Override
    public int compareTo(Pizza o) {
        return Integer.compare(this.nCalorie, o.nCalorie);
    }

    @Override
    public Pizza clone() {
        try {
            return (Pizza) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
