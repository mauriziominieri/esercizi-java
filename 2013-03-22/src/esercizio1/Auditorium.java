package esercizio1;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class Auditorium {

    private final int file;

    private final int posti;

    private final Comparator<Seat> comparator;

    public Auditorium(int file, int posti, Comparator<Seat> comparator) {
        this.file = file;
        this.posti = posti;
        this.comparator = comparator;
    }

    public Set<Seat> assignSeats(int n) {
        Set<Seat> seatSet = new LinkedHashSet<>();  // HashSet() basa l'ordine sull'hashCode degli elementi, LinkedHashSet invece preserva l'ordine di inserimento
        int k = 0;
        for(int i = 0; i < file; i++) {
            for(int j = 0; j < posti; j++) {
                Seat seat1 = new Seat();
                seat1.row = i; seat1.col = j;
                Seat seat2 = new Seat();
                seat2.row = i; seat2.col = j + 1;
                if(comparator.compare(seat1, seat2) < 0)
                    seatSet.add(seat1);
                else if(comparator.compare(seat1, seat2) > 0)
                    seatSet.add(seat2);
                if(++k == n)
                    return seatSet;
            }
        }
        return null;
    }
}
