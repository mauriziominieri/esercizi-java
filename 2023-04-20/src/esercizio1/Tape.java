package esercizio1;

import java.util.Iterator;
import java.util.Objects;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class Tape {

    private String string;
    private int position;
    Iterable<Character> play = () -> new Iterator<>() {
        private int index = position;

        @Override
        public boolean hasNext() {
            return index < string.length();
        }

        @Override
        public Character next() {
            return string.charAt(index++);
        }
    };

    Iterable<Character> playBack = () -> new Iterator<>() {
        private int index = position;

        @Override
        public boolean hasNext() {
            return index >= 0;
        }

        @Override
        public Character next() {
            return string.charAt(index--);
        }
    };

    public Tape(String string) {
        this.string = string;
    }

    public Tape ahead() {
        if (position < string.length())
            position++;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tape tape = (Tape) o;
        return Objects.equals(string, tape.string) && position == tape.position;
    }

    @Override
    public int hashCode() {
        return 31 * string.hashCode() + position;
    }
}
