package sg.edu.nus.iss.day11;

import java.util.Collections;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.DefaultApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Day11Application {

	public static void main(String[] args) {
		// SpringApplication.run(Day11Application.class, args);

		SpringApplication app = new SpringApplication(Day11Application.class);
		String port = "8080";
		ApplicationArguments argOptions = new DefaultApplicationArguments(args);

		if (argOptions.containsOption("port")) {
			port = argOptions.getOptionValues("port").get(0);
		}

		app.setDefaultProperties(Collections.singletonMap("server.port", port));
		app.run(args);
		
		System.out.println("Hi! This is my first springboot application started...");
	}

}
