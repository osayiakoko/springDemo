package com.osayistreams.springDemo;

import com.osayistreams.springDemo.student.Student;
import com.osayistreams.springDemo.student.StudentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoApplication.class, args);
	}

	@Bean
	CommandLineRunner run(StudentService service){
		return args -> {
			service.save(
					new Student(
							"John",
							"Doe",
							LocalDate.parse("2001-01-01"),
							"johnDoe@email.com",
							0
					)
			);
		};
	}

}