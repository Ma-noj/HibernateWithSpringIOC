package com.ty.studentapp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ty.studentapp.dto.Student;
@Component
public class StudentDao {
	@Autowired
	EntityManager manager;
	@Autowired
	EntityTransaction transaction;
	
	public void saveStudent(Student s) {
		transaction.begin();
		manager.persist(s);
		transaction.commit();
	}
	public Student getStudentById(int id) {
		return manager.find(Student.class, id);
	}
	public void updateStudent(Student s) {
		transaction.begin();
		manager.merge(s);
		transaction.commit();
	}
	public void deleteStudent(int id) {
		Student s = getStudentById(id);
		transaction.begin();
		manager.remove(s);
		transaction.commit();
	}
}
