package question11;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
Which declaration of an annotation type is legal?
    @interface Author {
        String name() default "";
        String date();
    }
 */
// Le annotazioni possono avere attributi e metodi, non possono estendere o implementare qualcosa.
// I metodi POSSONO avere un valore di default con la sintassi: deault "", il valore deve essere una costante, null per es. non è valido.
// Gli attributi invece DEVONO avere un valore di default con la sintassi: = "".
public class Main {}