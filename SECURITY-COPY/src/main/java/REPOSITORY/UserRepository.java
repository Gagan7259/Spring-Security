package REPOSITORY;

import com.security1.COPY.MODEL.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
