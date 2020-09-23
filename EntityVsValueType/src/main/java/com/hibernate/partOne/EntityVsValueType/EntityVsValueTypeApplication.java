package com.hibernate.partOne.EntityVsValueType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hibernate.partOne.EntityVsValueType.entity.Address;
import com.hibernate.partOne.EntityVsValueType.entity.User;
import com.hibernate.partOne.EntityVsValueType.repository.UserRepository;

@SpringBootApplication
public class EntityVsValueTypeApplication  implements CommandLineRunner  {
    @Autowired
	private UserRepository userResource;
	
	public static void main(String[] args) {
		SpringApplication.run(EntityVsValueTypeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Address address= new Address("132 Michigan Ave", "DC","20018");
		User user= new User("Teddy",address);
		userResource.save(user);
		
		
	}

}
