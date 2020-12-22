package purple.Controllers;

import com.google.gson.Gson;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import purple.POJOS.Class;
import purple.Repositories.ClassRepository;

import java.util.ArrayList;
import java.util.List;

//This class will be responsible for the controller for all the student operations from front end
//Following is s controller which is mapped to /rest/class URI

// This is handle REST request
@RestController
@RequestMapping("/rest/Class")
public class ClassController {

    private ClassRepository classRepository;

    public ClassController(ClassRepository classRepository) {
        this.classRepository = classRepository;
    }

    @CrossOrigin
    @RequestMapping(value = "getClasses", method = RequestMethod.GET)
    public ResponseEntity<List<Class>> classes(@RequestParam(name = "classList") List<Class> classes) {
        List<Class> all_classes = classRepository.findAll();
        List<Class> classe = new ArrayList<>();
        for (Class cls : all_classes) {
            if(classes.contains(cls)) {
                classe.add(cls);
            }
        }
        return new ResponseEntity<List<Class>>(classe, HttpStatus.OK);
    }

    @CrossOrigin
    @RequestMapping(value = "allClasses", method = RequestMethod.GET)
    public ResponseEntity<List<Class>> allClasses() {
        List<Class> all_classes = classRepository.findAll();
        return new ResponseEntity<List<Class>>(all_classes, HttpStatus.OK);
    }

    @CrossOrigin
    @RequestMapping(value = "subscribe", method = RequestMethod.GET)
    public ResponseEntity<List<Class>> subscribeClass(@RequestParam(name = "class") Class subClass, @RequestParam(name = "student") String studentUsername) {
        List<Class> all_classes = classRepository.findAll();
        return new ResponseEntity<List<Class>>(all_classes, HttpStatus.OK);
    }


    @CrossOrigin
    @RequestMapping(value = "classesForTeacher", method = RequestMethod.GET)
    public ResponseEntity<List<Class>> subscribeClass(@RequestParam(name = "teacher") String teacherUsername) {
        List<Class> teacher_classes = new ArrayList<>();
        System.out.println("CAME HERE");
        List<Class> all_classes = classRepository.findAll();
        System.out.println(teacherUsername + "YO");
        for (Class cls : all_classes) {
            System.out.println(cls.getInstructor() + "WTF");
            if(cls.getInstructor().equals(teacherUsername)) {
                teacher_classes.add(cls);
                System.out.println(cls + "HAHAHAHA");
            }
        }
        return new ResponseEntity<List<Class>>(teacher_classes, HttpStatus.OK);
    }

    @CrossOrigin
    @RequestMapping(value = "updateClass", method = RequestMethod.POST)
    public ResponseEntity<String> updateTeacher(@RequestBody String classs) {
        System.out.println("Class is here bro");
        Gson g = new Gson();

        //JSON file to Java object
        System.out.println(classs);
        Class classss = g.fromJson(classs, Class.class);
        classRepository.save(classss);


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
