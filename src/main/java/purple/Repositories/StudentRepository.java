package purple.Repositories;

import purple.POJOS.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

//This class will be responsible for the database operations for the student
public interface StudentRepository extends MongoRepository<Student, Integer> {

}
