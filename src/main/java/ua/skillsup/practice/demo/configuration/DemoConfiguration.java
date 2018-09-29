package ua.skillsup.practice.demo.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ua.skillsup.practice.demo.service.AnnotationService;
import ua.skillsup.practice.demo.service.JavaService;
import ua.skillsup.practice.demo.service.MainService;
import ua.skillsup.practice.demo.service.XmlService;
import ua.skillsup.practice.demo.service.impl.JavaServiceImpl;
import ua.skillsup.practice.demo.service.impl.MainServiceImpl;

@Configuration
public class DemoConfiguration {

	@Autowired
	private XmlService xmlService;
	@Autowired
	private AnnotationService annotationService;

	@Bean
	public JavaService javaService() {
		return new JavaServiceImpl();
	}

	@Bean
	public MainService mainService() {
		return new MainServiceImpl(xmlService, javaService(), annotationService);
	}
}