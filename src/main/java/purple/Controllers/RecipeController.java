package purple.Controllers;

import com.google.gson.Gson;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import purple.POJOS.Recipe;
import purple.Repositories.RecipeRepository;

//This class will be responsible for the controller for all the student operations from front end
@RestController
@RequestMapping("/rest/Recipe")
public class RecipeController {

    private RecipeRepository recipeRepository;

    public RecipeController(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @CrossOrigin
    @RequestMapping(value = "addNewRecipe", method = RequestMethod.POST)
    public ResponseEntity<String> addClass(@RequestBody String recipe) {
        System.out.println("Recipe is here bro");
        Gson g = new Gson();

        //JSON file to Java object
        System.out.println(recipe);
        Recipe recipee = g.fromJson(recipe, Recipe.class);
        System.out.println(recipee.getName());
        recipeRepository.save(recipee);

        String hi = "true";
        return new ResponseEntity<String>(hi, HttpStatus.OK);
    }
}
