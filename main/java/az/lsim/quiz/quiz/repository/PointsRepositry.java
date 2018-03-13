package az.lsim.quiz.quiz.repository;

import az.lsim.quiz.quiz.model.Points;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PointsRepositry extends JpaRepository<Points, Long> {
}
