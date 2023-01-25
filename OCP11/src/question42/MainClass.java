package question42;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
Which three classes successfully override showFirst()?
    1.  public abstract class MainClass implements AdaptorFirst {
            public void showFirst() {
                System.out.println("first");
            }
        }
    2.  public abstract class MainClass implements AdaptorFirst {
            public abstract void showFirst();
        }
    3.  ???
 */
interface AdaptorFirst {
    void showFirst();
}
public abstract class MainClass implements AdaptorFirst {
    public abstract void showFirst();
}