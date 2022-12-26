package esercizio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class Cartella {

    private final int[][] mat;

    private final int[] conta;

    private final List<Premi> premiList;

    public Cartella() {
        mat = new int[3][5];
        conta = new int[3];
        premiList = new ArrayList<>();
        Random rand = new Random();
//        mat[i][j] = rand.nextInt(1, 91);    // numeri random possibili da 1 a 90
        int randomNumber, inizio = 1, fine = 18;    // dato che ho 5 colonne e 90 è il massimo le "divido" in gruppi da 18
        List<Integer> randomNumberList = new ArrayList<>(); // per completezza aggiungo la regola che una cartella non abbia duplicati
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 5; j++) {
                do {
                    randomNumber = rand.nextInt(inizio, fine + 1);  // numeri random possibili da 1 a 18, poi da 19 a 36, da 37 a 54 ...
                }
                while(randomNumberList.contains(randomNumber));
                randomNumberList.add(randomNumber);
                mat[i][j] = randomNumber;
                inizio = fine + 1; fine += 18;
            }
            inizio = 1; fine = 18;
        }

        System.out.println("LA TUA CARTELLA");
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 5; j++) {
                System.out.print("[" + mat[i][j] + "]");
            }
            System.out.println();
        }
    }

    public Premi segna(int number) {

        System.out.println("ESTRATTO IL NUMERO: " + number);

        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if(mat[i][j] == number)
                    conta[i]++;
            }
        }

//        return switch (conta) {
//            case 2 -> Premi.AMBO;
//            case 3 -> Premi.TERNO;
//            case 4 -> Premi.QUATERNA;
//            case 5 -> Premi.CINQUINA;
//            case 15 -> Premi.TOMBOLA;
//            default -> null;
//        };

        if(conta[0] == 5 && conta[1] == 5 && conta[2] == 5)
            return Premi.TOMBOLA;

        for(int i = 0; i < 3; i++) {
            if(!premiList.contains(Premi.AMBO) && conta[i] == 2) {
                premiList.add(Premi.AMBO);
                return Premi.AMBO;
            }
            else if(!premiList.contains(Premi.TERNO) && conta[i] == 3) {
                premiList.add(Premi.TERNO);
                return Premi.TERNO;
            }
            else if(!premiList.contains(Premi.QUATERNA) && conta[i] == 4) {
                premiList.add(Premi.QUATERNA);
                return Premi.QUATERNA;
            }
            else if(!premiList.contains(Premi.CINQUINA) && conta[i] == 5) {
                premiList.add(Premi.CINQUINA);
                return Premi.CINQUINA;
            }
        }
        return null;
    }
}
