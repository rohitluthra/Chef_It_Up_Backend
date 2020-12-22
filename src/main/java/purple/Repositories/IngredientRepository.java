package purple.Repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import purple.POJOS.Ingredient;

public interface IngredientRepository extends MongoRepository<Ingredient, Integer> {

}
