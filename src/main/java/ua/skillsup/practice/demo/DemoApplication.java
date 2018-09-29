package ua.skillsup.practice.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;
import ua.skillsup.practice.demo.service.MainService;

@ImportResource("/context/demo.xml")
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		MainService mainService = context.getBean(MainService.class);

		mainService.doSmt();
	}
}
