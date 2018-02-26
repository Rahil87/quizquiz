package az.lsim.quiz.quiz.repository;

import az.lsim.quiz.quiz.model.Points;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Rahil on 21-Feb-18.
 */
@Repository
public interface PointsRepositry extends JpaRepository<Points, Long> {
}
