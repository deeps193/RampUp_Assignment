package com.hcl.controller;  
import java.util.List; 
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.PutMapping;  
import org.springframework.web.bind.annotation.RequestBody;  
import org.springframework.web.bind.annotation.RestController;
import com.hcl.model.Student;  
import com.hcl.service.StudentService;  

@RestController  
public class StudentController   
{  
 
@Autowired  
StudentService studentService;  

@GetMapping("/student")  
private List<Student> getAllStudent()   
{  
return studentService.getAllStudent();  
}  
  
@GetMapping("/student/{student_id}")  
private Student getStudent(@PathVariable("student_id") int student_id)   
{  
return studentService.getStudentById(student_id);  
}  
  
@DeleteMapping("/student/{student_id}")  
private void deleteStudent(@PathVariable("student_id") int student_id)   
{  
	studentService.delete(student_id);  
}  

@PostMapping("/student")  
private int saveStudent(@RequestBody Student student)   
{  
	studentService.saveOrUpdate(student);  
return student.getStudent_id();  
}  

@PutMapping("/student")  
private Student update(@RequestBody Student student)   
{  
	studentService.saveOrUpdate(student);  
return student;  
}  
}  

