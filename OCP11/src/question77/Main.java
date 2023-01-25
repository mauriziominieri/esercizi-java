package question77;

import java.util.concurrent.*;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
Which statement at line 1 will print Ping Pong?
    Future<String> future = es.submit(() -> "Pong");
 */
// Ricorda che il metodo execute è void, il metodo submit invece restituisce un oggetto Future<T>
public class Main {
    public static void main(String[] args) throws Exception {
        ExecutorService es = Executors.newCachedThreadPool();
        es.execute(() -> System.out.print("Ping "));

        // line 1
        Future<String> future = es.submit(() -> "Pong");

//        Future<String> future = es.invokeAny(new Callable<String>() {
//            public String call() throws Exception {
//                return "Pong";
//            }
//        });

//        Future<String> future = new Callable() {
//            public String call() throws Exception {
//                return "Pong";
//            }
//        }.call();

//        Future<String> future = es.execute(() -> "Pong"); // Bad return type in lambda expression: String cannot be converted to void

        System.out.println(future.get()); // line 2
        es.shutdown();
    }
}