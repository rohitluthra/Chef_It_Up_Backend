package purple.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import purple.POJOS.Ingredient;
import purple.Repositories.IngredientRepository;

import java.util.List;

//This class will be responsible for the controller for all the student operations from front end
@RestController
@RequestMapping("/rest/Ingredient")
public class IngredientController {

    private IngredientRepository ingredientRepository;

    public IngredientController(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }


    @CrossOrigin
    @RequestMapping(value = "ingredients", method = RequestMethod.GET)
    public ResponseEntity<List<Ingredient>> allIngredients() {
        List<Ingredient> all_ingredients = ingredientRepository.findAll();
        return new ResponseEntity<List<Ingredient>>(all_ingredients, HttpStatus.OK);
    }

}
