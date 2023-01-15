package esercizio1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

class Program {
    private List<Action> actionList;

    public Program() {
        actionList = new ArrayList<Action>();
    }

    public void addAction(Action action) {
        actionList.add(action);
    }

    public void execute(Washer washer) {
        for (Action action : actionList)
            action.apply(washer);
    }

    public static class SetTemp implements Action {
        private int temp;

        public SetTemp(int temp) {
            this.temp = temp;
        }

        public void apply(Washer washer) {
            washer.setTemp(temp);
        }
    }

    public static class SetSpeed implements Action {
        private int speed;

        public SetSpeed(int speed) {
            this.speed = speed;
        }

        public void apply(Washer washer) {
            washer.setSpeed(speed);
        }
    }

    public static class AddSoap implements Action {
        public void apply(Washer washer) {
            washer.addSoap();
        }
    }

    public static class Wait implements Action {
        private int minutes;

        public Wait(int minutes) {
            this.minutes = minutes;
        }

        public void apply(Washer washer) {
            try {
                Thread.sleep(minutes * 60L * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
