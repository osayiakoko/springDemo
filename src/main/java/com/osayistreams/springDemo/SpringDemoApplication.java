package com.osayistreams.springDemo;

import com.osayistreams.springDemo.student.Student;
import com.osayistreams.springDemo.student.StudentService;

import org.springframework.beans.factory.annotation.Value;
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

	// reading environement variables
	@Value("${DB_USER: fallBackValue}")
	private String dbUser;

	@Bean
	CommandLineRunner run(StudentService service){
		System.out.println(dbUser);
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