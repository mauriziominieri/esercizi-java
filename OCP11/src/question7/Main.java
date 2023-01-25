package question7;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/* TODO: Sono abbastanza sicuro della risposta, bisogna cambiare la domanda 1 del word?
Your organization provides a cloud server to your customer to run their Java code. You are reviewing the
changes for the next release and you see this change in one of the config files:
old: JAVA_OPTS="$JAVA_OPTS -Xms8g -Xmx8g"
new: JAVA_OPTS="$JAVA_OPTS -Xms8g -Xmx8g -noverify"
Which is correct?
    1. You reject the change because -noverify is a critical security risk.
 */
/*
1. You reject the change because -noverify is a critical security risk.
2. You accept the change because -noverify is a standard option that has been supported since Java 1.0.
3. You reject the change because -Xms8g -Xmx8g uses too much system memory.
4. You accept the change because -noverify is necessary for your code to run with the latest version of Java.

The -noverify option disables bytecode verification and can allow untrusted code to run on the JVM. This can pose a security risk and should not be used in production environments.
2 and 4. Is not true, -noverify is not a standard option and it's not necessary for your code to run with the latest version of Java.
3 It's not related, -Xms8g -Xmx8g is used to set the minimum and maximum heap memory size for the JVM, but this is not related to the security risk of -noverify.
 */
public class Main {}