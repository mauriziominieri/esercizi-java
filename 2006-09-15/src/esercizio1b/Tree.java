package esercizio1b;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class Tree implements Cloneable {

    private final TreeType treeType;

    private final Set<TreeType> innesti;  // niente duplicati

    private static int counter;

    public Tree(TreeType treeType) {
        this.treeType = treeType;
        innesti = new HashSet<>();
        Tree.counter++;
        this.treeType.counter++;
    }

    public void addGraft(TreeType treeType) {
        if(this.treeType == treeType)
            throw new RuntimeException(treeType + " è dello stesso tipo dell’albero stesso");
        if(innesti.add(treeType))
            treeType.counter++;
    }

    public static int getCounter() {
        return Tree.counter;
    }

    @Override
    public String toString() {
        String response = "\ntipo: " + treeType + "\ninnesti:\n";
        for(TreeType innesto : this.innesti)
            response += innesto + "\n";
        return response;
    }

    @Override
    public Tree clone() {
        try {
            return (Tree) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
