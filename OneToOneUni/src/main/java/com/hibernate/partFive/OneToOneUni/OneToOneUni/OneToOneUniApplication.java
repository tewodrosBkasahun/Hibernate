package com.hibernate.partFive.OneToOneUni.OneToOneUni;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hibernate.partFive.OneToOneUni.OneToOneUni.entity.Card;
import com.hibernate.partFive.OneToOneUni.OneToOneUni.entity.User;
import com.hibernate.partFive.OneToOneUni.OneToOneUni.repository.UserRepository;

@SpringBootApplication
public class OneToOneUniApplication implements CommandLineRunner{
    @Autowired
	UserRepository userRepo;
    
	public static void main(String[] args) {
		SpringApplication.run(OneToOneUniApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Card card =new Card("02","2019","232");
		User user= new User("Teddy","Joe",card);
		userRepo.Save(user);
		
		Card card2 =new Card("01","2019","232");
		User user2= new User("Merry","Joe",card);
		userRepo.Save(user2);
	}

}
