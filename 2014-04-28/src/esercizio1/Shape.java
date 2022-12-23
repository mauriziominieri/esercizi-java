package esercizio1;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public abstract class Shape implements Cloneable, Comparable<Shape> {

    private final Double width;

    private final Double height;

    Double posX;

    Double posY;

    public Shape(Double width, Double height, Double posX, Double posY) {
        this.width = width;
        this.height = height;
        this.posX = posX;
        this.posY = posY;
    }

    public Double width() {
        return width;
    }

    public Double height() {
        return height;
    }

    public Double posX() {
        return posX;
    }

    public Double posY() {
        return posY;
    }

    @Override
    public Shape clone() {
        try {
            return (Shape) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
