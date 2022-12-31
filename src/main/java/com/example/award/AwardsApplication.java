package com.example.award;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AwardsApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context=SpringApplication.run(AwardsApplication.class, args);
		AwardService awardService=context.getBean(AwardService.class);
		awardService.printAward();
	}

}
