package RetailManager1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan({"controller","services"})
public class RetailManager1Application {

	public static void main(String[] args) {
		SpringApplication.run(RetailManager1Application.class, args);
	}
}
