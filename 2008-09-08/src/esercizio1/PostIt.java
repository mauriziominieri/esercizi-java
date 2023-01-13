package esercizio1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class PostIt {

    private final String message;

    private static final Map<Object, List<PostIt>> map = new HashMap<>();

    public PostIt(Object object, String message) {
        this.message = message;
        List<PostIt> list = map.get(object) == null ? new ArrayList<>() : map.get(object);
        list.add(this);
        map.put(object, list);
    }

    public static List<PostIt> getMessages(Object object) {
        return map.get(object);
    }

    @Override
    public String toString() {
        return message;
    }
}
