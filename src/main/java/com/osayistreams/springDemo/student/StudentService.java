package com.osayistreams.springDemo.student;

import java.util.List;


public interface StudentService {

    Student save(Student s);

    List<Student> findAllStudent();

    Student findByEmail(String email);

    Student update(Student s);

    void delete(String email);
}
