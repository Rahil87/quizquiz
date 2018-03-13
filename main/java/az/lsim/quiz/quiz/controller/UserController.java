package az.lsim.quiz.quiz.controller;

import az.lsim.quiz.quiz.model.User;

import az.lsim.quiz.quiz.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;



@RestController
@RequestMapping("/")
public class UserController {

    private  static  final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
      private UserService userService;

       @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

     @GetMapping("/list")
     public List<User>  getList(){
           LOGGER.info("list");
        return userService.userList();
    }
    @GetMapping("/stop/{id}")
    public String delete(@PathVariable Long id) {

         return  userService.deleteUser(id);
    }

    @GetMapping ("/register")
     public String registerUser(@RequestParam("msisdn")String msisdn,@RequestParam("message")String message){
            User user = new User(msisdn,message);
         userService.saveUser(user);
        return " success";
    }

}
