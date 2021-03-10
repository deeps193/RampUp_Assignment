package com.hcl.repository;

import com.hcl.model.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

	Iterable<Student> findAll();

	Object findById(int id);

	void save(Student student);

	void deleteById(int id);	
}
