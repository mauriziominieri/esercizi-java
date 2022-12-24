package esercizio1;

import java.util.Objects;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class MyString implements Cloneable {

    private final String value;

    private static int generalCode = 1;

    private int code;

    public MyString(String string) {
        this.value = string;
        code = generalCode++;   // il primo oggetto avrà codice hashcode 1, il secondo 2, il terzo 3...
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyString myString = (MyString) o;
        if(this.value.length() != myString.value.length())
            return false;
        for(int i = 0; i < this.value.length(); i++) {
            if(this.value.indexOf(myString.value.charAt(i)) == -1)
                return false;
            if(myString.value.indexOf(this.value.charAt(i)) == -1)
                return false;
        }
        myString.code = this.code;
        return true;
    }

    @Override
    public MyString clone() {
        try {
            return (MyString) super.clone();
        }
        catch(CloneNotSupportedException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public int hashCode() {
        return code;
    }
}
