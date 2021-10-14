package com.petsforhire.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.petsforhire.main.controller.PageController;

@SpringBootApplication
 class PetsForHireApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetsForHireApplication.class, args);
	}

}
