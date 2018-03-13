package az.lsim.quiz.quiz.model;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;



@Entity
@Table(name = "points")
public class Points {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idPoint;
    private long dailyPoints;
    private  long weeklyPoints;
    private  long monthlyPoints;



    @ManyToOne
    //@NotFound(action = NotFoundAction.IGNORE)
    @JoinColumn(name ="User_Id")
    private  User user;

    public Long getIdPoint() {
        return idPoint;
    }

    public void setIdPoint(Long idPoint) {
        this.idPoint = idPoint;
    }

    public long getDailyPoints() {
        return dailyPoints;
    }

    public void setDailyPoints(long dailyPoints) {
        this.dailyPoints = dailyPoints;
    }

    public long getWeeklyPoints() {
        return weeklyPoints;
    }

    public void setWeeklyPoints(long weeklyPoints) {
        this.weeklyPoints = weeklyPoints;
    }

    public long getMonthlyPoints() {
        return monthlyPoints;
    }

    public void setMonthlyPoints(long monthlyPoints) {
        this.monthlyPoints = monthlyPoints;
    }

}
