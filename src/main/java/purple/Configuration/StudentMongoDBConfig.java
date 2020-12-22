package purple.Configuration;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import purple.POJOS.*;
import purple.Repositories.StudentRepository;

//This class handles mongo configurations
@Configuration
@EnableMongoRepositories(basePackageClasses = StudentRepository.class)
public class StudentMongoDBConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return strings -> {
//            studentRepository.save(new Student("rohitsingh", "tatti", "Rohit Singh"));
        };
    }
}

