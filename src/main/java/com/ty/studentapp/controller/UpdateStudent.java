package com.ty.studentapp.controller;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ty.studentapp.dao.StudentDao;
import com.ty.studentapp.dto.Student;
import com.ty.studentapp.helper.MyConfig;

public class UpdateStudent {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		StudentDao dao = (StudentDao)context.getBean("studentDao");
		Student s = dao.getStudentById(2);
		s.setMarks(35.89);
		dao.updateStudent(s);
		context.close();
	}

}
