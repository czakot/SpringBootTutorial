package com.elsospring;
// To see whether it goes through
import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

//@ComponentScan({"com.elsospring","com.spy"})
@SpringBootApplication
//@Configuration
//@EnableAutoConfiguration
//@ComponentScan
@PropertySource(value = "classpath:application.properties", encoding = "UTF-8")
public class ElsoSpringApplication {
	
	@Bean
	public Person giveMeAPerson() {
		return new Person("Gyula", 20);
	}
	
	@Bean(name = "gyula")
	@Profile("dev")
	public Person givMeADevPerson() {
		return new Person("dev");
	}

	@Bean(name = "gyula")
	@Profile("prod")
	public Person givMeAProdPerson() {
		return new Person("prod");
	}

	public static void main(String[] args) {
		ApplicationContext  ac = SpringApplication.run(ElsoSpringApplication.class, args);
		
		String[] beanNames = ac.getBeanDefinitionNames();
		Arrays.sort(beanNames);
		for(String beanName : beanNames) {
			System.out.println(beanName);
		}
		
		//System.out.println(ac.getBean("person"));
		System.out.println(ac.getBean("gyula"));
	}
}
