package esercizio1;

import java.util.Objects;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class Engine {

    private final double cilindrata;    // inizializzabile solo una volta

    private final double potenza;

    public Engine(double cilindrata, double potenza) {
        this.cilindrata = cilindrata;
        this.potenza = potenza;
    }

    public Engine byVolume() {
        return new Engine(cilindrata, potenza) {    // CLASSE ANONIMA
            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Engine engine = (Engine) o;
                return cilindrata == engine.cilindrata;
            }
        };
    }

    public Engine byPower() {
        return new Engine(cilindrata, potenza) {    // CLASSE ANONIMA
            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Engine engine = (Engine) o;
                return potenza == engine.potenza;
            }
        };
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return cilindrata == engine.cilindrata && potenza == engine.potenza;
    }

    @Override
    public String toString() {
        return "("+ cilindrata +" cm3, " + potenza + " CV)";
    }
}
