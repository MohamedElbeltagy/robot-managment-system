package com.rms.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rms.demo.entity.Robot;
import com.rms.demo.repository.RobotRepository;

@SpringBootApplication
public class RobotManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(RobotManagementSystemApplication.class, args);
	}

	// Inject RobotRepository class
	@Autowired
	public RobotRepository robotRepository;

	@Override
	public void run(String... args) throws Exception {
		/*
		//Creating an object of Robot class and pass that object through RobotRepository class
		Robot robot1 = new Robot("DeliveryBot","Expo");
		robotRepository.save(robot1);

		
		Robot robot2 = new Robot("Delivery","Index");
		robotRepository.save(robot2); 
		*/

	}

}
