package esercizio1;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class POString implements PartComparable<POString> {

    final String name;  // package-private per comodità

    public POString(String name) {
        this.name = name;
    }

    @Override
    public PartComparison compareTo(POString x) {
        int size = Math.min(this.name.length(), x.name.length());
        for(int i = 0; i < size; i++) {
            char c1 = this.name.charAt(i);
            char c2 = x.name.charAt(i);
            if(c1 < c2)
                return PartComparison.GREATER;
            else if(c1 > c2)
                return PartComparison.SMALLER;
        }
        if(this.name.length() > x.name.length())
            return PartComparison.GREATER;
        else if(this.name.length() < x.name.length())
            return PartComparison.SMALLER;
        return PartComparison.EQUAL;
    }

    @Override
    public String toString() {
        return name;
    }
}
