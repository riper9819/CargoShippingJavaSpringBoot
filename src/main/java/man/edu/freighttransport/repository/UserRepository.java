package man.edu.freighttransport.repository;

import man.edu.freighttransport.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);

}
