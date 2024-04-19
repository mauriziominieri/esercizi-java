package esercizio1;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public abstract class Angle implements Comparable<Angle> { // abstract: non è possibile istanziare oggetti di tipo effettivo Angle
    private double value;

    public Angle(double value) {
        this.value = value;
    }

    public static Angle of(double value) {
        if (value < 0)
            throw new IllegalArgumentException(value + " must be positive");
        if (value < 90)
            return new Acute(value);
        else if (value == 90)
            return Right.getInstance();
        else
            return new Obtuse(value);
    }

    @Override
    public int compareTo(Angle a) {
        return Double.compare(value, a.value);
    }

    static class Acute extends Angle {
        public Acute(double value) {
            super(value);
        }
    }

    static class Right extends Angle {
        private static Angle instance = new Right(90);

        private Right(double value) {
            super(value);
        }

        public static Angle getInstance() {
            return instance;
        }
    }

    static class Obtuse extends Angle {
        public Obtuse(double value) {
            super(value);
        }
    }
}
