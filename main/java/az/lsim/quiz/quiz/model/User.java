package az.lsim.quiz.quiz.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Calendar;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String msisdn;
    private String message;
    private String answerOfUser;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP", insertable = false, updatable = false)
    private Calendar createdDate;
    private Date stoppedDate;

    @OneToMany(targetEntity =Points.class,mappedBy = "user",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<Points> points;

    @OneToMany(targetEntity =Rating.class,mappedBy = "user",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<Rating> ratings;

    public User() {
    }

    public User(String msisdn, String message) {
        this.msisdn = msisdn;
        this.message = message;
    }

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

    public Calendar getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Calendar createdDate) {
        this.createdDate = createdDate;
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
