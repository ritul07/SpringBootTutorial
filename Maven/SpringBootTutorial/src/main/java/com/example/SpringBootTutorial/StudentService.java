package com.example.SpringBootTutorial;
//  Business service in Spring
//  In Spring, Biz service are Singletons.
//  On application startup, spring creates an instance of this service, it keeps that in the memory,
//  i.e registers that instance.
//  We can have other classes, service, controllers which depends on this, i.e they declare a dependency and,
//  hence the Spring injects it to different classes.

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service    //  marks the class as Spring business service
public class StudentService {

    //  member variable -> students
    private List<Student> students = new ArrayList<>(Arrays.asList(
            //  Arrays.asList creates an Immutable list
            // i.e why we added new ArrayList
            new Student("1", "ritul"),
            new Student("2", "praddip")
    ));

    public List<Student> showAll(){
        return students;
    }

    public Student showById(String id){
        return students.stream().filter(t -> t.getId().equals(id)).findFirst().get();
            //  from, stream of students, filter, lambda expression i.e
            //  when "t" is equal to t.getId(id)
            //  findFirst() <- finds the first element in list and then get that
    }

    public void addStudent(Student student) {
        students.add(student);
    }
}
