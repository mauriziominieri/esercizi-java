package question116;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */
/**
 Regole interfacce:
 *  metodi
 1. I metodi DI DEFAULT sono public e abstract, quindi senza corpo.
 2. final, protected e package-private non esistono, l'ultimo in particolare non può esistere perché senza scrivere nulla implicitamente sarebbe public. I metodi delle interfacce esistono proprio per essere overridati.
 3. Puoi creare un metodo concreto, basta renderlo static e/o private. Puoi farlo anche aggiungendo la parola default, ma DA SOLA.
 *  fields
 1. Di default sono public static final (devono quindi essere inizializzati, anche con null) e non puoi fare modifiche al riguardo.
 */

/*
Which is true?
    It compiles without errors.
 */
public interface Converter {
    public static final double POUNDS_PER_KILOGRAM = 2.20462; // line 1
    public double tare();
    public double net();
    public default double gross() { // line 2
        return tare() + net();
    }
    public default double tare(String units) {
        return toUnit(tare(), units);
    }
    public default double net(String units) {
        return toUnit(net(), units);
    }
    public default double gross(String units) {
        return toUnit(gross(), units);
    }
    private static double toUnit(double kilograms, String unit) { // line 3
        switch (unit) {
            case "KILO": return kilograms;
            case "POUNDS": return kilograms * POUNDS_PER_KILOGRAM;
            default: throw new IllegalArgumentException();
        }
    }
}