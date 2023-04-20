package com.ty.studentapp.controller;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ty.studentapp.dao.StudentDao;
import com.ty.studentapp.dto.Student;
import com.ty.studentapp.helper.MyConfig;

public class SaveStudent {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		Student s = (Student)context.getBean("student");
		s.setName("Manoj");
		s.setMarks(35);
		StudentDao dao = (StudentDao)context.getBean("studentDao");
		dao.saveStudent(s);
		context.close();
	}
}
