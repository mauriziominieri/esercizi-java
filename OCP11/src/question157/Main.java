package question157;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
The /scratch/exam/temp.txt file exists. The /scratch/exam/new.txt and /scratch/new.txt files do not exist.
What is the result?
    The program throws a FileAlreadyExistsException.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Path currentFile = Paths.get("/scratch/exam/temp.txt");
        Path outputFile = Paths.get("/scratch/exam/new.txt");
        Path directory = Paths.get("/scratch/");
        Files.copy(currentFile, outputFile);
        Files.copy(outputFile, directory);
        Files.delete(outputFile);
    }
}