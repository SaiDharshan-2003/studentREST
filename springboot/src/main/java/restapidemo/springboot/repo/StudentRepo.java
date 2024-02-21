package restapidemo.springboot.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import restapidemo.springboot.entity.Student;

@Repository
public interface StudentRepo extends MongoRepository<Student,String> {

}
