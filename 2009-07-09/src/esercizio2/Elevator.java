package esercizio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class Elevator {

    private final int numFloors;

    private int currentFloor;

    private final List<Integer> callQueue;

    public Elevator(int numFloors) {
        this.numFloors = numFloors;
        this.currentFloor = 0;
        this.callQueue = new ArrayList<>();
        new Thread(() -> {
            while (true) {
                try {
                    if (!callQueue.isEmpty()) {
                        Collections.sort(callQueue);
                        int destination = callQueue.remove(0);
                        System.out.println("Elevator leaves floor " + currentFloor);
                        Thread.sleep(2000L * Math.abs(destination - currentFloor)); // 2 secondi per ciascun piano
                        currentFloor = destination;
                        System.out.println("Elevator stops at floor " + currentFloor);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    public void call(int floor) {
        if(floor < 0 || floor > numFloors)
            throw new IllegalArgumentException("Il piano " + floor + " è fuori dall'intervallo corretto");
        callQueue.add(floor);
    }
}
