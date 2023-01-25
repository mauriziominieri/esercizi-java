package question70;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
You want to calculate the average of the Player's score.
Which statement inserted on line 1 will accomplish this?
    players.stream().mapToInt(a -> a.score).average().orElse(0.0);
 */
// Ricorda che il metodo average è del mapToInt() o mapToDouble() e DEVE ESSERCI il metodo .getAsDouble() o .orElse(0.0)
public class Main {
    public static void main(String[] args) {
        List<Player> players = List.of(new Player("Scott", 115), new
                Player("John", 70), new Player("Jelly", 105));
        double average = players.stream().mapToInt(a -> a.score).average().orElse(0.0); // line 1
        System.out.println("The average is: " + average);
    }
}

class Player {
    public String name;
    public int score;
    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}