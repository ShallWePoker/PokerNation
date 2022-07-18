package server.repository;

import org.springframework.data.repository.CrudRepository;
import server.model.User;

public interface UserRepository extends CrudRepository<User, Long> {
}
