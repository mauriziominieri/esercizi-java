package question26;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
What needs to change to make these classes compile and still handle all types of interface Worker?
    Replace Line 3 with public void addProcess(T w) {
 */
interface Worker {
    public void doProcess();
}
class HardWorker implements Worker {
    public void doProcess() {
        System.out.println("doing things");
    }
}
class Cheater implements Worker {
    public void doProcess() {}
}
public class Main <T extends Worker> extends Thread { // Line 1
    private List<T> processes = new ArrayList<>();    // Line 2
//    public void addProcess(HardWorker w) {            // Line 3
    public void addProcess(T w) {
        processes.add(w);
    }
    public void run() {
        processes.forEach((p) -> p.doProcess());
    }
}