package az.lsim.quiz.quiz.controller;

import az.lsim.quiz.quiz.model.User;

import az.lsim.quiz.quiz.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.jws.soap.SOAPBinding;
import java.util.List;


/**
 * Created by Rahil on 21-Feb-18.
 */

@RestController
@RequestMapping("/user")
public class UserController {

    private  static  final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
      private UserService userService;

       @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

     @RequestMapping("/list")
     public List<User>getList(){
           LOGGER.info("list");
        return userService.userList();
    }
    @RequestMapping("/stop/{id}")
    public String delete( @PathVariable Long id) {

         return  userService.deleteUser(id);
    }

    @RequestMapping("/reg")
     public User registerUser(@RequestBody User user){

         return userService.saveUser(user);
     }

}
