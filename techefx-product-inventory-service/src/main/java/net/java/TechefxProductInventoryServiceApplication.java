package net.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("net.java")
public class TechefxProductInventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechefxProductInventoryServiceApplication.class, args);
	}

}
