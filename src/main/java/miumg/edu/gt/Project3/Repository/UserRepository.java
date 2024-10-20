package miumg.edu.gt.Project3.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import miumg.edu.gt.Project3.Entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
