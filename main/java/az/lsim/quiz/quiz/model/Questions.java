package az.lsim.quiz.quiz.model;

import javax.persistence.*;


@Entity
@Table(name = "questions")
public class Questions {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private long number;
    private  String mixedWord;
    private  String answer;

    public Questions() {
    }

    public Questions(String mixedWord, String answer) {
        this.mixedWord = mixedWord;
        this.answer = answer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getMixedWord() {
        return mixedWord;
    }

    public void setMixedWord(String mixedWord) {
        this.mixedWord = mixedWord;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
