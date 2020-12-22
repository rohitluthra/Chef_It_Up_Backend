package purple.Repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import purple.POJOS.Utensil;

public interface UtensilRepository extends MongoRepository<Utensil, Integer> {

}
