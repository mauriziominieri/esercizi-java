package esercizio1;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
(Safe, 2012-4-23)
Implementare la classe Safe, che rappresenta una cassaforte che contiene una stringa segreta,
protetta da un numero intero che funge da combinazione. Il costruttore accetta la combinazione
e la stringa segreta. Il metodo open accetta un numero intero e restituisce la stringa segreta
se tale numero coincide con la combinazione. Altrimenti, restituisce null. Infine, se le ultime 3
chiamate a open sono fallite, la cassaforte diventa irreversibilmente bloccata ed ogni ulteriore
operazione solleva un’eccezione.
Implementare la classe ResettableSafe come una sottoclasse di Safe che aggiunge il metodo changeKey, che accetta due interi old e new e restituisce un boolean. Se la cassaforte è bloccata, il
metodo solleva un’eccezione. Altrimenti, se l’argomento old coincide con la combinazione attuale, il metodo imposta la combinazione della cassaforte a new e restituisce true. Se invece old
differisce dalla combinazione attuale, il metodo restituisce false.
Una ResettableSafe diventa bloccata dopo tre tentativi falliti di open o di changeKey. Ogni
chiamata corretta a open o changeKey azzera il conteggio dei tentativi falliti.
Suggerimento: prestare attenzione alla scelta della visibilità di campi e metodi.
Esempio d’uso:
    ResettableSafe s = new ResettableSafe(2381313, "L’assassino␣e’␣il␣maggiordomo.");
    System.out.println(s.open(887313));
    System.out.println(s.open(13012));
    System.out.println(s.changeKey(12,34));
    System.out.println(s.open(2381313));
Output dell’esempio d’uso:
    null
    null
    false
    Exception in thread "main"...
 */

public class Main {
    public static void main(String[] args) {
        ResettableSafe s = new ResettableSafe(2381313, "L’assassino e’ il maggiordomo.");
        System.out.println(s.open(887313));
        System.out.println(s.open(13012));
        System.out.println(s.changeKey(12,34));
        System.out.println(s.open(2381313));
    }
}
