package esercizio1;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class Recipe {

    private final String name;

    private String description;

    private final Map<String, Integer> map;

    public Recipe(String name) {
        this.name = name;
        map = new LinkedHashMap<>();
    }

    public void setDescr(String description) {
        this.description = description;
    }

    public void addIngr(int ingredientQuantity, String ingredientName) {
        map.put(ingredientName, ingredientQuantity);
    }

    public String toString(int numeroCoperti) {
        StringBuilder response = new StringBuilder(name + "\n\n");
        response.append("Ingredienti per ").append(numeroCoperti).append(" persone:\n");
        for(Map.Entry<String, Integer> entry : map.entrySet())
            response.append(entry.getValue() == 0 ? "q.b." : numeroCoperti * entry.getValue()).append(" ").append(entry.getKey()).append("\n");
        response.append("\nPreparazione:\n").append(description);
        return response.toString();
    }
}
