package esercizio3;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
Implementare il metodo statico isSetSmaller, che accetta due insiemi e un comparatore, e restituisce vero se e solo se tutti gli elementi
del primo insieme sono più piccoli, in base al comparatore, di tutti gli elementi del secondo insieme.
Porre particolare attenzione alla scelta della firma.
 */

public class Main<T> {

    public static <T> boolean isSetSmaller(ArrayList<Integer> A, ArrayList<Integer> B, Comparator<ArrayList<Integer>> c){

        c=new Comparator<ArrayList<Integer>>(){
            int c_p=0;
            int c_m=0;
            public int compare(ArrayList<Integer> A, ArrayList<Integer> B) {
                for(int i=0;i<A.size();i++)
                {
                    if(A.get(i)>B.get(i)) c_p++;
                    else if(A.get(i)<B.get(i)) c_m++;
                }

                if(c_p==A.size())
                    return -1;
                else if(c_m==A.size())
                    return 1;
                else return 0;
            }

        };

        if(c.compare(A,B)==1)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

        ArrayList<Integer> A,B;
        A = new ArrayList<>();
        B = new ArrayList<>();
        A.add(1);
        A.add(2);
        A.add(3);
        B.add(8);
        B.add(9);
//        B.add(10);
        B.add(0);

        Comparator c = new Comparator<>() {
            @Override
            public int compare(Object t, Object t1) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };

        //Main<Integer> p=new Main<Integer>();
        System.out.println(Main.isSetSmaller(A,B, c));
    }
}
