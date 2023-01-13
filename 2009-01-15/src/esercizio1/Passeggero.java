package esercizio1;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class Passeggero {

    private final String nome;

    Set<Volo> voloSet;

    public Passeggero(String nome) {
        this.nome = nome;
        voloSet = new HashSet<>();
    }

    @Override
    public String toString() {
        return nome;
    }
}
