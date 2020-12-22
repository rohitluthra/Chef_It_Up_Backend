package purple.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import purple.POJOS.Student;
import purple.POJOS.Teacher;
import purple.POJOS.Class;
import purple.Repositories.ClassRepository;
import purple.Repositories.StudentRepository;

import java.util.ArrayList;
import java.util.List;

//This class will be responsible for the controller for all the student operations from front end
@RestController
@RequestMapping("/rest/Student")
public class StudentController {

    private StudentRepository studentRepository;
    private ClassRepository classRepository;


    public StudentController(StudentRepository studentRepository, ClassRepository classRepository) {
        this.studentRepository = studentRepository;
        this.classRepository = classRepository;
    }

    @CrossOrigin
    @RequestMapping(value = "login", method = RequestMethod.GET)
    public ResponseEntity<Student> loginAttempt(@RequestParam(name = "username") String username, @RequestParam(name = "password") String password) {
        List<Student> all_users = studentRepository.findAll();
        List<Class> classes = classRepository.findAll();
        System.out.println(classes.size());
        String hi = "";
        for (Student student : all_users) {
            if (student.getPassword().equals(password) && student.getUsername().equals(username)) {
                return new ResponseEntity<Student>(student, HttpStatus.OK);
            }
        }
        return new ResponseEntity<Student>(new Student(null, null, null, null), HttpStatus.OK);
    }

    @CrossOrigin
    @RequestMapping(value = "signUp", method = RequestMethod.POST)
    public ResponseEntity<String> signUpAttempt(@RequestParam(name = "fullname") String fullname, @RequestParam(name = "email") String email, @RequestParam(name = "password") String password) {
        System.out.println(fullname);
        System.out.println(email);
        System.out.println(password);
        System.out.println("SUCCESS");
        studentRepository.save(new Student(email, fullname, password, new ArrayList<>()));
//        List<Users> all_users = usersRepository.findAll();
        String hi = "true";
//        for (Users user:all_users) {
//            if(user.getPassword().equals(password) && user.getEmail().equals(email)) {
//                hi = "true";
//            }
//            else {
//                hi = "false";
//            }
//        }
        return new ResponseEntity<String>(hi, HttpStatus.OK);
    }

    @CrossOrigin
    @RequestMapping(value = "studentClasses", method = RequestMethod.GET)
    public ResponseEntity<List<Class>> getClasses(@RequestParam(name = "student") String username) {
        List<Class> all_classes = classRepository.findAll();
        List<Class> student_classes = new ArrayList<>();
        for (Class classs : all_classes) {
            if (classs.getStudents().contains(username)) {
                student_classes.add(classs);
                System.out.println(classs);
            }
        }
        System.out.println(student_classes.toString());
        return new ResponseEntity<List<Class>>(student_classes, HttpStatus.OK);
    }




}
