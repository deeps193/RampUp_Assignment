package com.hcl.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.model.Student;
import com.hcl.repository.StudentRepository;

//defining the business logic  
@Service
public class StudentService {
	@Autowired
	StudentRepository studentRepository;

	public List<Student> getAllStudent() {
		List<Student> student = new ArrayList<Student>();
		studentRepository.findAll().forEach(student1 -> student.add(student1));
		return student;
	}
	public Student getStudentById(int id)   
	{  
	return  studentRepository.findById(id).get();  
	}

	public void saveOrUpdate(Student student) {
		studentRepository.save(student);
	}

	public void delete(int id) {
		studentRepository.deleteById(id);
	}

	public void update(Student student, int student_id) {
		studentRepository.save(student);
	}
}
