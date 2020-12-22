package purple.Repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import purple.POJOS.Recipe;

public interface RecipeRepository extends MongoRepository<Recipe, Integer> {

}
