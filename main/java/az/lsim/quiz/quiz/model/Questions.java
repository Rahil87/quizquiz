package az.lsim.quiz.quiz.model;

import javax.persistence.*;

/**
 * Created by Rahil on 21-Feb-18.
 */

@Entity
@Table(name = "questions")
public class Questions {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private long numberOfQuestion;
    private  String mixedWord;
    private  String answerOfQuestion;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getNumberOfQuestion() {
        return numberOfQuestion;
    }

    public void setNumberOfQuestion(long numberOfQuestion) {
        this.numberOfQuestion = numberOfQuestion;
    }

    public String getMixedWord() {
        return mixedWord;
    }

    public void setMixedWord(String mixedWord) {
        this.mixedWord = mixedWord;
    }

    public String getAnswerOfQuestion() {
        return answerOfQuestion;
    }

    public void setAnswerOfQuestion(String answerOfQuestion) {
        this.answerOfQuestion = answerOfQuestion;
    }
}
