package xyz.deved.microservices.limitsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import xyz.deved.microservices.limitsservice.configuration.Configuration;

@SpringBootApplication
@ConfigurationPropertiesScan(basePackageClasses = Configuration.class)
public class LimitsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LimitsServiceApplication.class, args);
	}

}
