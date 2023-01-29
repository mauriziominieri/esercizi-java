package question186;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/* Non confonderla con la 73
Which two annotations may be applied at Loc1 in the code fragment?
    1. @Resource({"Customer1","Customer2"})
    2. @Resource("Customer1")
 */
@interface Resource {
    String[] value();
}
/* Loc1 */ @Resource("Customer1") class ProcessOrders { }