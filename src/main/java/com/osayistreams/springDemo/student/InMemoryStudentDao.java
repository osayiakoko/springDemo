package com.osayistreams.springDemo.student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import org.springframework.stereotype.Repository;


@Repository
public class InMemoryStudentDao {
    private final List<Student> STUDENTS = new ArrayList<Student>();
    
    public Student save(Student s){
        STUDENTS.add(s);
        return s;
    }

    List<Student> findAllStudent(){
        return STUDENTS;
    }

    Student findByEmail(String email){
        return STUDENTS.stream()
        .filter(s -> email.equals(s.getEmail()))
        .findFirst()
        .orElse(null);
    }

    Student update(Student s){

        int studentIndex = IntStream.range(0, STUDENTS.size())
            .filter(index -> STUDENTS.get(index).getEmail().equals(s.getEmail()))
            .findFirst()
            .orElse(-1);

        if (studentIndex > -1) {
            STUDENTS.set(studentIndex, s);
            return s;
        }
        return null;
    }

    void delete(String email){
        Student student = findByEmail(email);
        if (student != null){
            STUDENTS.remove(student);
        }
    }
}
