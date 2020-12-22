package purple.Controllers;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.gson.Gson;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import purple.POJOS.Class;
import purple.POJOS.ClassNew;
import purple.POJOS.Student;
import purple.Repositories.ClassRepository;
import purple.Repositories.TeacherRepository;
import purple.POJOS.Teacher;

import javax.swing.*;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

//This class will be responsible for the controller for all the student operations from front end

@RestController
@RequestMapping("/rest/Teacher")
public class TeacherController {


    private TeacherRepository teacherRepository;
    private Teacher teacher;
    private ClassRepository classRepository;

    public TeacherController(TeacherRepository teacherRepository, ClassRepository classRepository) {
        this.teacherRepository = teacherRepository;
        this.classRepository = classRepository;
    }

    @CrossOrigin
    @RequestMapping(value = "login", method = RequestMethod.GET)
    public ResponseEntity<Teacher> loginAttempt(@RequestParam(name = "username") String username, @RequestParam(name = "password") String password) {
        List<Teacher> all_users = teacherRepository.findAll();
        String hi = "";
        for (Teacher teacher : all_users) {
            if (teacher.getPassword().equals(password) && teacher.getUsername().equals(username)) {
                this.teacher = teacher;
                System.out.println(this.teacher.getId());
                return new ResponseEntity<Teacher>(teacher, HttpStatus.OK);
            } else {
                hi = "false";
            }
        }
        return new ResponseEntity<Teacher>(new Teacher(null, null, null), HttpStatus.OK);
    }

    @CrossOrigin
    @RequestMapping(value = "signUp", method = RequestMethod.POST)
    public ResponseEntity<String> signUpAttempt(@RequestParam(name = "fullname") String fullname, @RequestParam(name = "email") String email, @RequestParam(name = "password") String password) {
        System.out.println(fullname);
        System.out.println(email);
        System.out.println(password);
        System.out.println("SUCCESS");
        teacherRepository.save(new Teacher(email, fullname, password));
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
    @RequestMapping(value = "addNewClass", method = RequestMethod.POST)
    public ResponseEntity<String> addClass(@RequestBody String classs) {
        System.out.println("Class is here bro");
        Gson g = new Gson();

        //JSON file to Java object
            System.out.println(classs);
            ClassNew classss = g.fromJson(classs, ClassNew.class);
            System.out.println(classss.getName());
            Class clase = new Class(classss.getName(), classss.getDescription(), new ArrayList<String>());
            clase.setInstructor(classss.getInstructor());
            classRepository.save(clase);


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
    @RequestMapping(value = "updateTeacher", method = RequestMethod.POST)
    public ResponseEntity<String> updateTeacher(@RequestBody String teacher) {
        System.out.println("Teacher is here bro");
        Gson g = new Gson();
        teacherRepository.delete(this.teacher);

        //JSON file to Java object
        System.out.println(teacher);
        Teacher teacherr = g.fromJson(teacher, Teacher.class);
        teacherRepository.save(teacherr);


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
}
