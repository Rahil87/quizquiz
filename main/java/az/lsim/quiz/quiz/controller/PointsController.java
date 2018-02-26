package az.lsim.quiz.quiz.controller;

import az.lsim.quiz.quiz.model.Points;
import az.lsim.quiz.quiz.service.PointsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Rahil on 21-Feb-18.
 */
@RestController
@RequestMapping("/points")
public class PointsController {

     private PointsService pointsService;

    @Autowired
    public PointsController(PointsService pointsService) {
        this.pointsService = pointsService;
    }




    @RequestMapping("/list")
    public List<Points> getList(){

    return  pointsService.getList();
    }
}
