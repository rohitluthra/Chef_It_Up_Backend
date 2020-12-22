package purple.Repositories;

import purple.POJOS.Class;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClassRepository extends MongoRepository<Class, Integer> {

}
