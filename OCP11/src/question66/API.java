package question66;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
Which two changes need to be made to make this class compile?
    1. Change Line 1 to an abstract class: public abstract class API {
    2. Change Line 2 to an abstract method: public abstract void checkValue(Object value) throws IllegalArgumentException;
 */
public interface API { // line 1
    public void checkValue(Object value) throws IllegalArgumentException; // line 2
//    public boolean isValueANumber(Object val) {
//        if(val instanceof Number) {
//            return true;
//        } else {
//            try {
//                Double.parseDouble(val.toString());
//                return true;
//            } catch (NumberFormatException ex) {
//                return false;
//            }
//        }
//    }
}