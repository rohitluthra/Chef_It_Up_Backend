//package purple.Configuration;
//
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
//import purple.POJOS.Utensil;
//import purple.Repositories.UtensilRepository;
//
////This class handles mongo configurations
//@Configuration
//@EnableMongoRepositories(basePackageClasses = UtensilRepository.class)
//public class UtensilMongoDBConfig {
//
//    @Bean
//    CommandLineRunner commandLineRunner(UtensilRepository utensilRepository) {
//        return strings -> {
//            utensilRepository.save(new Utensil("pan", "Empty", "3/4 quarts", new String[0], "Cast Iron Pan"));
//        };
//    }
//}
//
