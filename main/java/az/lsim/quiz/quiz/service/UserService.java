package az.lsim.quiz.quiz.service;

import az.lsim.quiz.quiz.model.User;
import az.lsim.quiz.quiz.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service
public class UserService {

    private static  final Logger LOGGER= LoggerFactory.getLogger(UserService.class);
    private UserRepository userRepository;

     @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }




    public List<User> userList() {

        return userRepository.findAll();
    }


    public String deleteUser(Long id) {
        if(userRepository.exists(id))   {
            userRepository.delete(id);
            return "{'USER DELETED SUCCESSFULY!!!'}"+"----"+id;   }

        else return "USER DOESN'T EXIST!!!";
    }

    public User saveUser(User user){
      return userRepository.save(user);}




}
