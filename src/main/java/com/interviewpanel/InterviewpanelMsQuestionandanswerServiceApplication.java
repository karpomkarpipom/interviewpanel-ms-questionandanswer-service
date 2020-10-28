package com.interviewpanel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
//microservice for retrieving the IQAs from DB-test-cd
@SpringBootApplication
@EnableEurekaClient
public class InterviewpanelMsQuestionandanswerServiceApplication {

	public static void main(String[] args) {
		System.out.println("--------------><-----------");
		SpringApplication.run(InterviewpanelMsQuestionandanswerServiceApplication.class, args);
	}

}
