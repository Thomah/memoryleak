package fr.thomah.memoryleak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class MemoryLeakApplication {

	public static void main(String[] args) {
		SpringApplication.run(MemoryLeakApplication.class, args);
	}

}
