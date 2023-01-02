package esercizio1;

import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
(SocialUser, 2016-9-20)
Per un social network, implementare le classi SocialUser e Post. Un utente è dotato di un nome
e può creare dei post tramite il metodo newPost. Il contenuto di un post è una stringa, che
può contenere nomi di utenti, preceduti dal simbolo “@”. Il metodo getTagged della classe Post
restituisce l’insieme degli utenti il cui nome compare in quel post, mentre il metodo getAuthor
restituisce l’autore del post.
L’implementazione deve rispettare il seguente esempio d’uso.
Esempio d’uso:
    SocialUser adriana = new SocialUser("Adriana"),
    barbara = new SocialUser("Barbara");
    SocialUser.Post p = adriana.newPost("Ecco␣una␣foto␣con␣
    @Barbara␣e␣@Carla.");
    Set<SocialUser> tagged = p.getTagged();
    System.out.println(tagged);
    System.out.println(tagged. iterator () .next() == barbara);
    System.out.println(p.getAuthor());
Output:
    [Barbara]
    true
    Adriana
Suggerimento: l’invocazione a.lastIndexOf(b) restituisce -1 se la stringa b non è presente nella
stringa a, e un numero maggiore o uguale di zero altrimenti.
 */

public class Main {
    public static void main(String[] args) {
        SocialUser adriana = new SocialUser("Adriana"),
                   barbara = new SocialUser("Barbara");
        SocialUser.Post p = adriana.newPost("Ecco una foto con @Barbara e @Carla.");
        Set<SocialUser> tagged = p.getTagged();
        System.out.println(tagged);
        System.out.println(tagged.iterator().next() == barbara);
        System.out.println(p.getAuthor());
    }
}
