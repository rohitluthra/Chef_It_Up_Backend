package purple.Configuration;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
   import purple.POJOS.Class;
import purple.POJOS.Recipe;
import purple.POJOS.Student;
import purple.Repositories.*;

import java.util.ArrayList;

//This class handles mongo configurations
@Configuration
@EnableMongoRepositories(basePackageClasses = ClassRepository.class)
public class ClassMongoDBConfig {

    @Bean
    CommandLineRunner commandLineRunner(ClassRepository classRepository, IngredientRepository ingredientRepository,
                                        RecipeRepository recipeRepository, StudentRepository studentRepository,
                                        TeacherRepository teacherRepository, UtensilRepository utensilRepository) {
        return strings -> {


//            classRepository.deleteAll();
//
//            classRepository.save(
//
//                    new Class("Indian Food",
//                            "Spicy and burst of flavours",
//                            recipeRepository.findAll(),
//                            studentRepository.findAll()
//                    )
//                );
//            classRepository.save(
//
//                    new Class("Italian Food",
//                            "Spicy and burst of flavours",
//                            recipeRepository.findAll(),
//                            studentRepository.findAll()
//                    )
//            ); classRepository.save(
//
//                    new Class("Jamaican Food",
//                            "Spicy and burst of flavours",
//                            recipeRepository.findAll(),
//                            studentRepository.findAll()
//                    )
//            );

        };
    }
}

