package az.lsim.quiz.quiz.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

/**
 * Created by Rahil on 21-Feb-18.
 */
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String msisdn;
    private String message;
    private String answerOfUser;
    private Date insertDate;
    private Date stoppedDate;

    @OneToMany(targetEntity =Points.class,mappedBy = "user",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<Points> points;

    @OneToMany(targetEntity =Rating.class,mappedBy = "user",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<Rating> ratings;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAnswerOfUser() {
        return answerOfUser;
    }

    public void setAnswerOfUser(String answerOfUser) {
        this.answerOfUser = answerOfUser;
    }


    public Date getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(Date insertDate) {
        this.insertDate = insertDate;
    }

    public Date getStoppedDate() {
        return stoppedDate;
    }

    public void setStoppedDate(Date stoppedDate) {
        this.stoppedDate = stoppedDate;
    }

    public List<Points> getPoints() {
        return points;
    }

    public void setPoints(List<Points> points) {
        this.points = points;
    }

    public List<Rating> getRatings() {
        return ratings;
    }

    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }
}
