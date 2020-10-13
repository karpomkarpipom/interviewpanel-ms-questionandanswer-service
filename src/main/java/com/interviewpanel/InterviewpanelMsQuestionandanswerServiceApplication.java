package com.interviewpanel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class InterviewpanelMsQuestionandanswerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InterviewpanelMsQuestionandanswerServiceApplication.class, args);
	}

}
