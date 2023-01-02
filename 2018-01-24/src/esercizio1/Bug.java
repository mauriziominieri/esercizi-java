package esercizio1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class Bug {

    private final String descrizione;

    private String sviluppatore;

    private static final Set<Bug> unassignedBugSet = new HashSet<>();

    private static final Map<String, Set<Bug>> assignedBugMap = new HashMap<>();

    public Bug(String descrizione) {
        this.descrizione = descrizione;
        unassignedBugSet.add(this);
    }

    public void assignTo(String sviluppatore) {
        this.sviluppatore = sviluppatore;
        unassignedBugSet.remove(this);
        Set<Bug> assignedBugSet = assignedBugMap.get(sviluppatore) == null ? new HashSet<>() :  assignedBugMap.get(sviluppatore);
        assignedBugSet.add(this);
        assignedBugMap.put(sviluppatore, assignedBugSet);
    }

    public static Set<Bug> getUnassigned() {
        return unassignedBugSet;
    }

    public static Set<Bug> getAssignedTo(String sviluppatore) {
        return assignedBugMap.get(sviluppatore);
    }

    @Override
    public String toString() {
        return "(\"" + descrizione + "\", assigned to " + sviluppatore + ")";
    }
}
