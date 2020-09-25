package com.hibernate.partThree.AttributeOverride;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.hibernate.partThree.AttributeOverride.entity.Address;
import com.hibernate.partThree.AttributeOverride.entity.Person;

@SpringBootApplication
public class AttributeOverrideApplication implements CommandLineRunner{

	@Autowired
	private com.hibernate.partThree.AttributeOverride.repository.UserRepository userRepo;
	public static void main(String[] args) {
		SpringApplication.run(AttributeOverrideApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Address homeAdd =new Address("136 Michigan Ave","Washington","LA","20170");
		Address billingAdd =new  Address("136 Michigan Ave","Washington","LA","20170");
		Person user= new Person("Teddy",homeAdd,billingAdd);
		userRepo.save(user);
		
		
	}

}
