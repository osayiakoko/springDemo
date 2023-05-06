package com.osayistreams.springDemo.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class StudentService {

    public List<Student> findAllStudent(){
        return List.of(
            new Student(
                "Osayi",
                "Akoko",
                LocalDate.now(),
                "hello@osayistreams.com",
                28
            ),
            new Student(
                "Osayi",
                "Akoko",
                LocalDate.now(),
                "hello@osayistreams.com",
                28
            )
        );
    }
    
}
