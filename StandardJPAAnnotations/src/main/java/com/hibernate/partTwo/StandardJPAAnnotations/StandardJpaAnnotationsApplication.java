package com.hibernate.partTwo.StandardJPAAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hibernate.partTwo.StandardJPAAnnotations.entity.Employee;
import com.hibernate.partTwo.StandardJPAAnnotations.repository.EmployeeRepository;

@SpringBootApplication
public class StandardJpaAnnotationsApplication implements CommandLineRunner{
	@Autowired 
	EmployeeRepository employeeRepository;
	public static void main(String[] args) {
		SpringApplication.run(StandardJpaAnnotationsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	   Employee emp= new Employee("Teddy","Ka",1000,"212-222-12");
	   employeeRepository.save(emp);
			   
			
	}

}
