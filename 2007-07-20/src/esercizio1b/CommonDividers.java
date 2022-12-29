package esercizio1b;

import java.util.Iterator;

public class CommonDividers implements Iterable<Integer> {

    private int num1, num2;

    public CommonDividers(int a, int b) {
        num1 = a;
        num2 = b;
        iterator();
    }

    @Override
    public Iterator iterator() {
        return new Iterator() {   //creo un iteratore che restituisco, in termine tecnico si chiama CLASSE ANONIMA

            private int index = 1;
            private int value;

            @Override
            public boolean hasNext() {
                return value < num1;
            }

            @Override
            public Integer next() {

                for(int i=index; i<=num1; i++) {  //i parte da 1 e mi chiedo se 12 è divisibile, si, index ora è 2 e value = 1, i parte da 2 entro e index = 3 e value 2, i parte da 3 non entro nell'if quindi si incrementa a 4 ed entro...
                    if(num1%i==0) {
                        index = i+1;
                        value = i;
                        break;
                    }
                }

                return value;
            }
        };
    }
}
