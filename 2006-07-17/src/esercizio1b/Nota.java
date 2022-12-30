package esercizio1b;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class Nota implements Comparable<Nota> {

    private final String nome;

    int durata; // package-private per comodità

    int tempo;  // package-private per comodità

    public Nota(String nome, int durata) {
        if(durata != 1 && durata != 2 && durata != 4)
            throw new RuntimeException("Durata " + durata + " non valida");
        this.nome = nome;
        this.durata = durata;
    }

    @Override
    public String toString() {
        return nome;
    }

    @Override
    public int compareTo(Nota o) {
        // se volessi ordinare le note in base alla loro durata (implica che le note con la stessa durata sono uguali...)
        // quindi il Sol non verrebbe inserito nel TreeSet perchè già c'è il Mib e per il TreeSet sono due oggetti uguali
//        if(this.durata > o.durata) return -1;     // versione estesa
//        else if(this.durata < o.durata) return 1;
//        else return 0;
//        return Integer.compare(o.durata, this.durata);    // versione compatta
        // la stringa è una classe che già prevede un ordinamento lessicografico, posso usare il suo metodo compareTo
        return this.nome.compareTo(o.nome);
    }
}
