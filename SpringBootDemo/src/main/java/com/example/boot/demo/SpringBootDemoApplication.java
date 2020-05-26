package com.example.boot.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.boot.demo.dao.GreetingRepository;
import com.example.boot.demo.model.Greeting;
import com.example.boot.demo.model.GreetingType;

@SpringBootApplication
public class SpringBootDemoApplication {
	
	@Autowired
	GreetingRepository repo;
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}
	
	@Bean
	CommandLineRunner bootItUp(ApplicationContext ctx) {
	
		return(a)-> {
			 int count = ctx.getBeanDefinitionCount();
			 System.out.println("Total beans " + count);
			 
			 	Greeting greet = new Greeting(100, "Good Morning", GreetingType.TEMPORAL);
				repo.save(greet);
				greet = new Greeting(101, "Welcome Home", GreetingType.WELCOME);
				repo.save(greet);
				greet = new Greeting(102, "See you soon", GreetingType.PARTING);
				repo.save(greet);
				greet = new Greeting(102, "Been a honour", GreetingType.RESPECT);
				repo.save(greet);
				
				greet = new Greeting(104, "Good Afternoon", GreetingType.TEMPORAL);
				repo.save(greet);
				greet = new Greeting(105, "Such pleasure seeing you again", GreetingType.WELCOME);
				repo.save(greet);
				greet = new Greeting(106, "So long", GreetingType.PARTING);
				repo.save(greet);
				greet = new Greeting(107, "Was my dream to meet you", GreetingType.RESPECT);
				repo.save(greet);
				greet = new Greeting(108, "#RESPECT", GreetingType.RESPECT);
				repo.save(greet);
				greet = new Greeting(109, "#HONOUR", GreetingType.RESPECT);
				repo.save(greet);
				greet = new Greeting(110, "#DREAM", GreetingType.RESPECT);
				repo.save(greet);
			 
			 
		};
	}
	

}
