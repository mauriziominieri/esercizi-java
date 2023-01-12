package esercizio1;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class Circle implements Comparable<Circle> {

    private final int x;

    private final int y;

    private final int raggio;

    public Circle(int x, int y, int raggio) {
        this.x = x;
        this.y = y;
        this.raggio = raggio;
    }

    // Sovrappongono se la distanza tra i centri è minore della somma dei raggi: sqrt((x2-x1)^2+(y2-y1)^2) < r1+r2
    public boolean overlaps(Circle circle) {
        double distanza = Math.sqrt(Math.pow(circle.x - this.x, 2) + Math.pow(circle.y - this.y, 2));
        double sommaRaggi = this.raggio + circle.raggio;
        return distanza < sommaRaggi;
    }

    // Interne se la differenza in valore assoluto dei raggi è maggiore della distanza tra i centri.
    @Override
    public int compareTo(Circle o) {
        double distanza = Math.sqrt(Math.pow(o.x - this.x, 2) + Math.pow(o.y - this.y, 2));
        double sommaRaggi = this.raggio + o.raggio;
        double differenzaRaggi = Math.abs(this.raggio - o.raggio);
        if(differenzaRaggi > distanza) return 1;
        else if(sommaRaggi < distanza) return -1;
        else return 0;
    }
}
