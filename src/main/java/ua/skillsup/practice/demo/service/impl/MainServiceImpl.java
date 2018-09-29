package ua.skillsup.practice.demo.service.impl;

import ua.skillsup.practice.demo.service.AnnotationService;
import ua.skillsup.practice.demo.service.JavaService;
import ua.skillsup.practice.demo.service.XmlService;
import ua.skillsup.practice.demo.service.MainService;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class MainServiceImpl implements MainService {

	private final XmlService xmlService;
	private final JavaService javaService;
	private final AnnotationService annotationService;

	public MainServiceImpl(XmlService xmlService, JavaService javaService, AnnotationService annotationService) {
		this.xmlService = xmlService;
		this.javaService = javaService;
		this.annotationService = annotationService;
	}

	@PostConstruct
	public void init() {
		System.out.println("One more construction step!");
	}

	@Override
	public void doSmt() {
		System.out.println("DO smth by my own");
		xmlService.doSmtAnother();
		javaService.doSmtLikeJava();
		annotationService.doSmtAnnotated();
	}

	@PreDestroy
	public void destroy() {
		System.out.println("Oh no.... I will be destroyed soon!");
	}
}
