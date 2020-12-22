package purple.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import purple.POJOS.Utensil;
import purple.Repositories.UtensilRepository;

import java.util.List;

//This class will be responsible for the controller for all the student operations from front end
@RestController
@RequestMapping("/rest/Utensil")
public class UtensilController {

    private UtensilRepository utensilRepository;

    public UtensilController(UtensilRepository utensilRepository) {
        this.utensilRepository = utensilRepository;
    }


    @CrossOrigin
    @RequestMapping(value = "utensils", method = RequestMethod.GET)
    public ResponseEntity<List<Utensil>> allUtensils() {
        List<Utensil> all_utensils = utensilRepository.findAll();
        return new ResponseEntity<List<Utensil>>(all_utensils, HttpStatus.OK);
    }
}
