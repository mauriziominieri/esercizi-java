package esercizio1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class Room {

    private final List<Reservation> reservationList;

    public Room() {
        reservationList = new ArrayList<>();
    }

    public boolean inRange(int a, int b, int c, int d) {
        return (c > a && c < b) || (c < a && d > a);
    }

    public Reservation reserve(String name, int startDate, int endDate) {
        if(endDate < startDate || startDate < 0 || endDate > 365)
            throw new RuntimeException("Data: " + startDate + " - " + endDate + " non valida");
        for(Reservation reservation : reservationList)
            if(inRange(reservation.startDate, reservation.endDate, startDate, endDate))
                throw new RuntimeException("Camera occupata in data: " + reservation.startDate + " - " + reservation.endDate + ", data richiesta: " + startDate + " - " + endDate);
        Reservation reservation = new Reservation(name, startDate, endDate);
        reservationList.add(reservation);
        return reservation;
    }

    public List<Reservation> reservations() {
        reservationList.sort(Comparator.comparingInt(a -> a.startDate));    // ordino la lista in base alla startDate
        return reservationList;
    }
}
