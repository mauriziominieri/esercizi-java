package question73;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
Which two annotations may be applied at Loc1 in the code fragment?
    1. @Resource("Customer2")
    2. @Resource
 */
/*
Opzioni valide
    1. @Resource
    2. @Resource()
    3. @Resource("Customer2")
    4. @Resource(value="Customer2")
 */
@interface Resource {
    String value() default "Customer1";
}
/* Loc1 */ @Resource class ProcessOrders { }
class Main {
    public static void main(String[] args) {}
}