package esercizio1;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class Tutor {

    private final Map<String, Integer> map;   // (targa, kilometro) salvo il kilometro in cui è stata identificata l'auto

    private final Map<String, Integer> map2;  // (targa, secondi) salvo i secondi in cui è stata identificata l'auto

    public Tutor() {
        map = new HashMap<>();
        map2 = new HashMap<>();
    }

    public Detector addDetector(int km) {
        return new Detector(km);
    }

    class Detector {

        private final int km;

        public Detector(int km) {
            this.km = km;
        }

        public int carPasses(String targa, int secondi) {
            if(map.get(targa) == null) {
                map.put(targa, this.km);
                map2.put(targa, secondi);
                return -1;
            }
            else {
                int vel = Math.round((this.km - map.get(targa)) / ((float) (secondi - map2.get(targa)) / 3600));
                map.put(targa, this.km);
                map2.put(targa, secondi);
                return vel;
            }
        }
    }
}
