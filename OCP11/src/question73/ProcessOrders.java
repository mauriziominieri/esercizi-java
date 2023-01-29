package question73;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/* Non confonderla con la 186
Which two annotations may be applied at Loc1 in the code fragment?
    1. @Resource("Customer2")
    2. @Resource
 */
@interface Resource {
    String value() default "Customer1";
}
/* Loc1 */ @Resource class ProcessOrders { }