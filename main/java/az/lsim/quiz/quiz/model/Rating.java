package az.lsim.quiz.quiz.model;

import javax.persistence.*;

/**
 * Created by Rahil on 21-Feb-18.
 */
@Entity
@Table(name = "rating")
public class Rating {
     @Id
     @GeneratedValue(strategy =GenerationType.AUTO)
    private Long idRating;
    private long dailyPosition;
    private long weeklyPosition;
    private long monthlyPosition;

    @ManyToOne
    @JoinColumn(name ="User_Id")
    private  User user;

    public Long getIdRating() {
        return idRating;
    }

    public void setIdRating(Long idRating) {
        this.idRating = idRating;
    }

    public long getDailyPosition() {
        return dailyPosition;
    }

    public void setDailyPosition(long dailyPosition) {
        this.dailyPosition = dailyPosition;
    }

    public long getWeeklyPosition() {
        return weeklyPosition;
    }

    public void setWeeklyPosition(long weeklyPosition) {
        this.weeklyPosition = weeklyPosition;
    }

    public long getMonthlyPosition() {
        return monthlyPosition;
    }

    public void setMonthlyPosition(long monthlyPosition) {
        this.monthlyPosition = monthlyPosition;
    }

}
