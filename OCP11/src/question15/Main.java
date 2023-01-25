package question15;

import java.util.ServiceLoader;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
Which code fragment does a service use to load the service provider with a Print interface?
    private java.util.ServiceLoader<Print> loader = ServiceLoader.load(Print.class);
 */
// use to load -> serve il metodo load()
interface Print {}
public class Main {
    private java.util.ServiceLoader<Print> loader = ServiceLoader.load(Print.class);
//    private Print print = new com.service.Provider.PrintImpl();
//    private Print print = com.service.Provider.getInstance();
//    private java.util.ServiceLoader<Print> loader = new java.util.ServiceLoader<>();
}