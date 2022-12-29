package esercizio1;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class Color {

    static Color RED = make(255, 0, 0);

    static Color GREEN = make(0, 255, 0);

    static Color BLUE = make(0, 0, 255);

    private static boolean flag;

    private int r;

    private int g;

    private int b;

    public Color(int r, int g, int b) {
        if(!flag)
            throw new RuntimeException("Un colore nuovo si può creare solo con il metodo factory make");
        this.r = r;
        this.g = g;
        this.b = b;
    }

    static Color make(int r, int g, int b) {
        Color.flag = true;
        Color color = new Color(r, g, b);
        if(color.equals(RED))
            color = RED;
        else if(color.equals(GREEN))
            color = GREEN;
        else if(color.equals(BLUE))
            color = BLUE;
        Color.flag = false;
        return color;
    }

//  dovrei fare l'override anche dell'hashcode, infatti i due sono sempre associati dato il fatto che se sono uguali per equals dovrebbero avere anche
//  la stessa locazione di memoria e quindi lo stesso hashcode (in realtà Java controlla System.identityHashCode(object), diverso dall'hashcode)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Color color = (Color) o;
        return this.r == color.r && this.g == color.g && this.b == color.b;
    }

    @Override
    public String toString() {
        if(r == 255 && g == 0 && b == 0)
            return "red";
        else if(r == 0 && g == 255 && b == 0)
            return "green";
        else if(r ==  0 && g == 0 && b == 255)
            return "blue";
        return "(" + r + ", " + g + ", " + b + ")";
    }
}
