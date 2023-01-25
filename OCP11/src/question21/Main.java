package question21;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
Which statement is true?
    PrintWriter outputs characters and automatically flushes the stream.
 */
// PrintWriter is a class that can be used to write text to a character-output stream, such as a file or a console. It automatically flushes the stream after each write operation, which means that the data is immediately sent to the destination.
// System.exit() method terminates the current Java Virtual Machine and it doesn't invoke the close() method for the InputStream/OutputStream resources, if you want to do that you should invoke the close method before calling System.exit().
// Console.readPassword() method reads a password or passphrase from the console with echoing disabled, it doesn't encrypt the text entered.
// PrintStream can output both bytes and characters. It can output bytes by using the write method, and it can output characters by using the print and println methods.
public class Main {}