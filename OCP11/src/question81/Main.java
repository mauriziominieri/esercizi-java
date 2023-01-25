package question81;

import java.io.FileNotFoundException;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
What is the result?
    9001: APPLICATION ERROR-9001-MyFile.txt
 */
class ExSuper extends Exception {
    private final int eCode;
    public ExSuper(int eCode, Throwable cause) {
        super(cause);
        this.eCode = eCode;
    }
    public ExSuper(int eCode, String msg, Throwable cause) {
        super(msg, cause);
        this.eCode = eCode;
    }
    public String getMessage() {
        return this.eCode+": "+super.getMessage()+"-"+this.getCause().getMessage();
    }
}
class ExSub extends ExSuper {
    public ExSub(int eCode, String msg, Throwable cause) {
        super(eCode, msg, cause);
    }
}
public class Main {
    public static void main(String[] args) {
        try {
            String param1 = "Oracle";
            if (param1.equalsIgnoreCase("oracle")) {
                throw new ExSub(9001, "APPLICATION ERROR-9001", new FileNotFoundException("MyFile.txt"));
            }
            throw new ExSuper(9001, new FileNotFoundException("MyFile.txt"));   // Line 1
        } catch (ExSuper ex) {
            System.out.println(ex.getMessage());
        }
    }
}