package com.ty.studentapp.controller;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ty.studentapp.dao.StudentDao;
import com.ty.studentapp.helper.MyConfig;

public class DeleteStudent {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		StudentDao dao = (StudentDao)context.getBean("studentDao");
		dao.deleteStudent(2);
		context.close();
	}

}
