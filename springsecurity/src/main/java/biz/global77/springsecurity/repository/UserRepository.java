ackage biz.global77.springsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import biz.global77.springsecurity.model.User;

public interface UserRepository extends  JpaRepository<User, Integer>{
 
    public User findByUsername(String username);
}