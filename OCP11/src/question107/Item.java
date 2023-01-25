package question107;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
Given the information:
The classes question107.Box and question107.Item are encapsulated with getters and setters methods.
The classes question107.Box and question107.Item contains required constructors source code.
Which action serializes the b1 object?
    Implement the Serializable interface in the Item class.
 */
/*
1. Handle NotSerializableException in the try clause or throw in the main() method definition.
2. Add SerialVersionUID to the Box and Item class.
3. Implement the Serializable interface in the Item class.
4. Remove out.flush() method invocation.
5. Override readObject() and writeObject() methods in the Book class.

La serializzazione è la conversione di un oggetto Java in un flusso statico (sequenza) di byte, che possiamo quindi salvare in un database o trasferire su una rete.
Le classi idonee per la serializzazione devono implementare un'interfaccia marcatore speciale, Serializable.
Il metodo più importante in ObjectOutputStream è:
public final void writeObject(Object o) throws IOException;
Questo metodo prende un oggetto serializzabile e lo converte in una sequenza (flusso) di byte. Allo stesso modo, il metodo più importante in ObjectInputStream è:
public final Object readObject() throws IOException, ClassNotFoundException;
Questo metodo può leggere uno stream di bytes e lo converte in un Java object.
 */
class Box implements Serializable {
    private int boxId;
    private String size;
    private List items;

    public Box(int boxId, String size, List items) {
        this.boxId = boxId;
        this.size = size;
        this.items = items;
    }
}
public class Item {
    private int id;
    private String name;

    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        List items1 = new ArrayList<>();
        items1.add(new Item(1, "Pen"));
        items1.add(new Item(2, "Ruler"));
        Box b1 = new Box(123, "s", items1);
        try (FileOutputStream fout = new FileOutputStream("boxser.txt");
             ObjectOutputStream out = new ObjectOutputStream(fout);) {
            out.writeObject(b1);
            out.flush();
            out.close();
        } catch (Exception e) {
            System.out.println("Unable to Serialize");
        }
    }
}