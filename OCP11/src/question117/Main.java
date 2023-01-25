package question117;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
What is the result?
    Changed to Java
 */
public class Main {
    private final PropertyChangeSupport pcs = new PropertyChangeSupport(this);
    private String name = "Test";
    public String getName() {
        return name;
    }
    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        pcs.firePropertyChange("Name", oldName, name);
    }
    public void addListener(PropertyChangeListener listener) {
        pcs.addPropertyChangeListener(listener);
    }
    public static void main(String[] args) {
        Main main = new Main();
        main.addListener(new PropertyChangeListener() {
            public void propertyChange(PropertyChangeEvent event) {
                System.out.println("Changed to " + event.getNewValue());
            }
        });
        main.setName("Java");
    }
}