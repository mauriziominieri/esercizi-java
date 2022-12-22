package esercizio1;

import java.util.Objects;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class Studente {

    private String nome;

    private String matricola;

    public Studente(String nome, String matricola) {
        this.nome = nome;
        this.matricola = matricola;
    }

    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Studente studente = (Studente) obj;
        return nome.equals(studente.nome) && matricola.equals(studente.matricola);
    }

    @Override
    public String toString() {
        return nome + " " + matricola;
    }

    static class Triennale extends Studente {

        private static String prefisso;

        public Triennale(String nome, String matricola) {
            super(nome, matricola);
            setMatricola(prefisso + "/" + matricola);
        }

        public static void setPrefisso(String prefisso) {
            Triennale.prefisso = prefisso;
        }
    }

    static class Magistrale extends Studente {

        private static String prefisso;

        public Magistrale(String nome, String matricola) {
            super(nome, matricola);
            setMatricola(prefisso + "/" + matricola);
        }

        public static void setPrefisso(String prefisso) {
            Magistrale.prefisso = prefisso;
        }
    }
}
