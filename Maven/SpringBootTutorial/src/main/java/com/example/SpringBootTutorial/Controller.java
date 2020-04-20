package com.example.SpringBootTutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //  we have methods inside the class, which map to URL requests i.e requests mapped to a particular method
public class Controller {

    @Autowired   //  This is Dependency Injection
    private StudentService studentService;
    //  Since, this is an instance of the StudentService, so once the control reaches this point,
    //  it'll direct the control to the StudentService.

    @RequestMapping("/hello")   //  when we hit this URL, the user is making a HTTP request to the application
    //  and this method will be called
    //  GET is the default mapping for this annotation
    public String sayHi(){
        return "Hi";
    }

    @RequestMapping("/list")
    public List<Student> showAll(){
        return studentService.showAll();    //  calling the showAll() method from the studentService instance
                                            // of StudentService.
    }

    @RequestMapping("/list/{id}")
    public Student showById(@PathVariable("id") String id){
        return studentService.showById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/add")
    public String addStudent(@RequestBody Student student){
        //  we've added @requestBody so that, it tells the MVC to pick this instance from request body
        studentService.addStudent(student);
        return "Student added successfully!";
    }
}
