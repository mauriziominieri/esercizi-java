package esercizio1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class Wall {

    private final int altezza;

    private final int larghezza;

    private static final Map<Integer, List<Brick>> brickMap = new HashMap<>();

    public Wall(int altezza, int larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    public Brick addBrick(int fila, int posizione) {
        Brick brick = new Brick(fila, posizione);
        if(fila > altezza)
            throw new RuntimeException("Il muro non è abbastanza alto, fila massima: " + this.altezza);
        if(posizione + brick.larghezza > larghezza)
            throw new RuntimeException("Il muro non è abbastanza largo, cm massimi: " + this.larghezza);
        List<Brick> brickList = brickMap.get(fila) == null ? new ArrayList<>() : brickMap.get(fila);
        brickList.add(brick);
        brickMap.put(fila, brickList);
        return brick;
    }

    class Brick {

        // chicca: in questo modo possiamo nel futuro cambiare la dimensione di ogni mattone, il programma funzionerà comunque
        private final int larghezza = 10;

        private final int fila;

        private final int posizione;

        public Brick(int fila, int posizione) {
            this.fila = fila;
            this.posizione = posizione;
        }

        // controlla se due mattoni sono nello stesso range
        // brick.posizione = 2 -> 2 fa parte del range (10, 20) ? no, OPPURE 12 fa parte del range (10, 20) ? si
        public boolean isInRange(Brick brick1, Brick brick2) {
//            return brick1.posizione > brick2.posizione &&
//                    brick1.posizione < brick2.posizione + larghezza ||
//                    brick1.posizione + larghezza > brick2.posizione &&
//                    brick1.posizione + larghezza < brick2.posizione + larghezza;
            return Math.abs(brick1.posizione - brick2.posizione) < brick1.larghezza;    // metodo alternativo molto più comodo
        }

        public boolean isStable() {
            int cont = 0;
            if(this.fila == 0)
                return true;
            List<Brick> brickList = brickMap.get(this.fila - 1);
            for (Brick brick: brickList) {
                if(isInRange(this, brick)) {
//                  cont == 2 -> ha due mattoni al di sotto, quindi sarà per forza stabile
                    if (++cont == 2 || Math.abs(this.posizione - brick.posizione) < (larghezza / 2))
                        return true;
                }
            }
            return false;
        }
    }
}
