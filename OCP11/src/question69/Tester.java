package question69;
import question69.test.t1.*;
import question69.test.t2.*;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
What is the result?
    42
 */
// Gli attributi sono sempre quelli del TIPO DICHIARATO, se la x di A fosse protected avrei un errore alla line 5 perché sarebbe visibile solo nello stesso package
/** Regole visibilità
    1. public: visibile da tutto
    2. protected: visibile nello stesso package o anche dalle sottoclassi in un package diverso
    3. package-private: visibile nello stesso package
    4. private: visibile solo nella classe
 */
public class Tester {
    public static void main(String[] args) {
        A obj = new B();            // line 4
        System.out.println(obj.x);  // line 5
    }
}