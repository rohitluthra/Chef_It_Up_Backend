//package purple.Configuration;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
//import purple.Repositories.TeacherRepository;
//import purple.POJOS.Teacher;
//
////This class handles mongo configurations
//@Configuration
//@EnableMongoRepositories(basePackageClasses = TeacherRepository.class)
//public class TeacherMongoDBConfig {
//
//    @Bean
//    CommandLineRunner commandLineRunner(TeacherRepository teacherRepository) {
//        return strings -> {
//            teacherRepository.save(new Teacher("ROHIT", "abc", "ROHIT SINGH THARDAK"));
//            teacherRepository.save(new Teacher("Rluthra", "123", "Rohit Luthra"));
//        };
//    }
//}
//
