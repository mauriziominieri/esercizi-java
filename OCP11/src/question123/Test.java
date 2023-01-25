package question123;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
How many lines of text does this program print?
    two
 */
class NoMatchException extends RuntimeException {}
public class Test {
    public static void main(String[] args) {
        try {
            if ("oracle".equals("ORACLE".toLowerCase())) {
                throw new NoMatchException();
            }
        } catch (NoMatchException | NullPointerException npe) {
            System.out.println("Exception 1");
        } catch (RuntimeException e) {
            System.out.println("Exception 2");
        } catch (Exception e) {
            System.out.println("Exception 3");
        } finally {
            System.out.println("Finally Block");
        }
    }
}