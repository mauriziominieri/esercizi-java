package question68;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
You want to move source.txt to the destination directory even if a file with the same name already exists in the destination directory.
Which code inserted on line 1 will accomplish this?
    try {
        Files.move(Paths.get(source), Paths.get(destination), StandardCopyOption.REPLACE_EXISTING);
 */
/*
The method Files.copy(Paths.get(source), Paths.get(destination), StandardCopyOption.REPLACE_EXISTING) will copy the file at the source path to the destination path and replace any existing file at the destination path. This is the best option to move the file and overwrite it if it already exists.
Option 1 is used to copy the content of the file from source to destination using FileChannels, but it doesn't handle the situation when the file already exists.
Option 2 is used to copy the file from source to destination using the Files.copy() method and then delete the source file. But it throws an exception if the destination file already exists and it doesn't accomplish the requirement of overwriting the destination file if it already exists.
Option 3 uses Files.move() method which will move the file but it will throw an exception (java.nio.file.FileAlreadyExistsException) if the destination file already exist.
It's important to note that the method Files.copy() doesn't delete the source file, it just copies the content, so if you want to delete the source file after the copy you will need to add another line of code like Files.delete(Paths.get(source)); after the copy method.
 */
public class Main {
    public static void main(String[] args) {
        String source = "u01/work/stage/message.txt"; // "/u01/work/stage/message.txt" indicates an absolute file path, which starts from the root directory of the file system. Tolgo il "/" iniziale -> it's a relative file path. The file is located relative to the current working directory
        String destination = "u01/work/message.txt";  // "/u01/work/message.txt"

        // line 1
//        try (FileChannel in = new FileInputStream(source).getChannel();
//             FileChannel out = new FileOutputStream(destination).getChannel()) {
//            in.transferTo(0, in.size(), out);

//        try {
//            Files.copy(Paths.get(source), Paths.get(destination), StandardOpenOption.CREATE_NEW); // error
//            Files.delete(Paths.get(source));

//        try {
//            Files.move(Paths.get(source), Paths.get(destination));

        try {
            Files.move(Paths.get(source), Paths.get(destination), StandardCopyOption.REPLACE_EXISTING); // muove il file source in destination sovrascrivendolo se già esiste
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}