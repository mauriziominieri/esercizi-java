package question131;

import java.lang.annotation.Target;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
In which two locations is it legal to apply the @Resource annotation?
    1. Loc1
    2. Loc4
 */
/*
Loc2 è un TYPE_USE
Lo3 è un CONSTRUCTOR
Loc5 è un FIELD
 */
@Target({TYPE, METHOD}) // in questo modo la annotation create è applicabile solo alle classi (interfacce, enum o record) e ai metodi (non costruttori), posso selezionare tutto ciò all'interno della enum ElementType
@interface Resource {}
public class Person {}
@Resource /* Loc1 */ class Manager extends /* Loc2 */ Person {
    /* Loc3 */ Manager() {}
    @Resource /* Loc4 */ String getDepartmentName() { return departmentName; }
    /* Loc5 */ String departmentName;
}