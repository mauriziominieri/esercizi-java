package esercizio1;

import java.util.Objects;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class Circle extends Shape {

    private final Double centroX;

    private final Double centroY;

    private Double radius;

    public Circle(Double centroX, Double centroY, Double radius) {
        super(radius * 2, radius * 2, centroX - radius, centroY - radius);
        this.centroX = centroX;
        this.centroY = centroY;
        this.radius = radius;
    }

    public void setRadius(Double radius) {
        posX = centroX - radius;
        posY = centroY - radius;
        this.radius = radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.centroX, centroX) == 0 && Double.compare(circle.centroY, centroY) == 0 && Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int compareTo(Shape shape) {
//        if(this.width() * this.height() > shape.width() * shape.height()) return 1;
//        else if(this.width() * this.height() < shape.width() * shape.height()) return -1;
//        else return 0;
        return Double.compare(this.width() * this.height(), shape.width() * shape.height());
    }
}
