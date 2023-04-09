package SERVICE;

import REPOSITORY.UserRepository;
import com.security1.COPY.MODEL.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository repository;

    //methods
    //get all users
    public List<User> getallUsers() {
        return repository.findAll();
    }

    //create user
    public void createUser(User user) {
        repository.save(user);
    }

    //update user
    public void updateUser(User user) {
        repository.save(user);
    }

    //delete user
    public void deletUser(Integer id) {
        repository.deleteById(id);
    }


}
