package com.devroom.student.dal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.devroom.student.dal.entities.Student;
import com.devroom.student.dal.repos.StudentRepository;

@RunWith(SpringRunner.class)
@SpringBootTest

public class StudentdalApplicationTests {

	@Autowired
	private StudentRepository studentRepository;

	@Test
	public void testCreateStudent() {
		Student student = new Student();
		student.setName("John");
		student.setCourse("Java");
		student.setFee(10);
		studentRepository.save(student);
	}

	@Test
	public void testFindStudentById() {
		Object student = studentRepository.findById((long) 1);
		System.out.print(student);
	}

}
