package question189;

import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
For which two kinds of declarations can the @Resource annotation be applied?
    1. An interface declaration
    2. A class declaration
 */
@Target(TYPE)
@interface Resource {}