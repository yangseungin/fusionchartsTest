package com.giantdwarf.FusionchartsTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FusionchartsTestApplication {

	public static void main(String[] args) {
		System.setProperty("spring.devtools.restart.enabled","true");
		System.setProperty("spring.devtools.livereload","true");
		SpringApplication.run(FusionchartsTestApplication.class, args);
	}

}
