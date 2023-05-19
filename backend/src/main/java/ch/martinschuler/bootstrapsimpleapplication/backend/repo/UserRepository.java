package ch.martinschuler.bootstrapsimpleapplication.backend.repo;

import ch.martinschuler.bootstrapsimpleapplication.backend.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
