package purple.Repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import purple.POJOS.Teacher;

//This class will be responsible for the database operations for the student
public interface TeacherRepository extends MongoRepository<Teacher, Integer> {

}
