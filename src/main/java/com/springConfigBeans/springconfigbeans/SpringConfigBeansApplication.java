package com.springConfigBeans.springconfigbeans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringConfigBeansApplication {

	public static void main(String[] args) {
		System.out.println("beans with config files");
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");  
		Coach baeballCoach = context.getBean("baseballCoach" , Coach.class);
		String schedule = baeballCoach.getSchedule();
		String service = baeballCoach.getServiceUsingDI();
		System.out.println(schedule);
		System.out.println(service);
		TennisCoach tennisCoach = context.getBean("tennisCoach" , TennisCoach.class);
		String schedule2 = tennisCoach.getSchedule();
		String service2 = tennisCoach.getServiceUsingDI();
		String mail = tennisCoach.getEmail();
		System.out.println(schedule2);
		System.out.println(service2);
		System.out.println(mail);
		context.close();
		SpringApplication.run(SpringConfigBeansApplication.class, args);
	}

}
