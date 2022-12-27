package esercizio1;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class Answer {

    private Question question;

    private String value;

    private int cont;

    public Answer(Question question, String value) {
        this.question = question;
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void voteUp() {
        this.cont++;
        if(this.question.getAnswer() == null || this.cont > this.question.getAnswer().cont)
            this.question.setAnswer(this);
    }
}
