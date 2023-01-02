package esercizio1;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class SocialUser {

    private final String nome;

    private static final Set<SocialUser> socialUserSet = new HashSet<>();

    public SocialUser(String nome) {
        this.nome = nome;
        socialUserSet.add(this);
    }

    public Post newPost(String contenuto) {
        return new Post(contenuto, this);
    }

    @Override
    public String toString() {
        return nome;
    }

    class Post {

        private final String contenuto;

        private final SocialUser autore;

        public Post(String contenuto, SocialUser autore) {
            this.contenuto = contenuto;
            this.autore = autore;
        }

        public Set<SocialUser> getTagged() {
            Set<SocialUser> responseSet = new HashSet<>();
            for(SocialUser socialUser : socialUserSet)
                if(this.contenuto.lastIndexOf("@" + socialUser.nome) != -1)
                    responseSet.add(socialUser);
            return responseSet;
        }

        public SocialUser getAuthor() {
            return this.autore;
        }
    }
}
