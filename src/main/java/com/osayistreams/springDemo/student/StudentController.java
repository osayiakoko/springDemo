package com.osayistreams.springDemo.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    private StudentService service;
    
    @Autowired
    public StudentController(StudentService service) {
        this.service = service;
    }

    @PostMapping
    public Student save(@RequestBody Student s){
        return service.save(s);
    }

    @GetMapping
    public List<Student> findAllStudents() {
        return service.findAllStudent();
    } 

    @GetMapping("/{email}")
    public Student findByEmail(@PathVariable String email){
        return service.findByEmail(email);
    }

    @PutMapping
    public Student updateStudent(@RequestBody Student s){
        return service.update(s);
    }

    @DeleteMapping("/{email}")
    public void deleteStudent(@PathVariable String email){
        service.delete(email);
    }
}
