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

public class BigProblem extends RuntimeException { // si comporta come un'eccezione non verificata
    private List<Throwable> exceptionList;

    public BigProblem() {
        exceptionList = new ArrayList<>();
    }

    public boolean add(Throwable exception) {
        return exceptionList.add(exception);
    }

    @Override
    public String getMessage() {
        StringBuilder message = new StringBuilder();
        for (Throwable throwable : exceptionList)
            message.append(throwable.getMessage()).append("\n");
        return message.toString();
    }

    public boolean containsChecked() {
        for (Throwable exception : exceptionList)
            if (!(exception instanceof RuntimeException || exception instanceof Error)) // le eccezioni sottoclassi di RuntimeException o Error sono le non verificate
                return true;
        return false;
    }
}
