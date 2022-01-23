package com.hospital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@EnableAutoConfiguration
public class HospitalManagementApplication  {
	

	public static void main(String[] args) {
		SpringApplication.run(HospitalManagementApplication.class, args);
		System.out.println("////// Hospital Management ///////////");
	}

	

	

}
