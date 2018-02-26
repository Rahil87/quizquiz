package az.lsim.quiz.quiz.service;

import az.lsim.quiz.quiz.model.Points;
import az.lsim.quiz.quiz.repository.PointsRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Rahil on 21-Feb-18.
 */
@Service
public class PointsService{

    private PointsRepositry pointsRepositry;

    @Autowired
    public PointsService(PointsRepositry pointsRepositry) {
        this.pointsRepositry = pointsRepositry;
    }




    public List<Points> getList() {
        return pointsRepositry.findAll();
    }
}
