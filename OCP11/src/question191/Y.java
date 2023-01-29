package question191;

import java.util.Collection;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
Which two lines can replace line 1 so that the Y class compiles?
    1. set(map.values());
    2. super.set(map.values());
 */
class X {
    private Collection collection;
    public void set(Collection collection) {
        this.collection = collection;
    }
}
public class Y extends X {
    public void set(Map<String,String> map) {
//        super.set(map); // line 1
    }
}