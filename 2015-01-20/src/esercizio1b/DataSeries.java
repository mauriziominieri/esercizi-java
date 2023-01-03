package esercizio1b;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class DataSeries {

    private final Map<Integer, Double> map;

    public DataSeries() {
        map = new HashMap<>();
    }

    public void set(int year, double value) {
        this.map.put(year, value);
    }

    public static Comparator<DataSeries> comparatorByYear(int year) {
//        return new Comparator<DataSeries>() {
//            @Override
//            public int compare(DataSeries o1, DataSeries o2) {
//                if(o1.map.get(year) > o2.map.get(year))
//                    return 1;
//                else if(o1.map.get(year) < o2.map.get(year))
//                    return -1;
//                else
//                    return 0;
//            }
//        };
        return Comparator.comparing(o -> o.map.get(year));  // lambda expression
    }
}
