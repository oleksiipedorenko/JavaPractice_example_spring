package ua.skillsup.practice.demo.service.impl;

import org.springframework.stereotype.Service;
import ua.skillsup.practice.demo.service.AnnotationService;

@Service
public class AnnotationServiceImpl implements AnnotationService {
	@Override
	public void doSmtAnnotated() {
		System.out.println("I'm doing something, annotated one!");
	}
}