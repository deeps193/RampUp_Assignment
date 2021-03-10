package com.hcl.model;

//mark class as an Entity   
@Entity  
//defining class name as Table name  
@Table  
public class Student
{ 
@Id  
@Column  
private int student_id;  
@Column  
private String student_name;  
@Column  
private String department;  
@Column  
private String mail_id;
public int getStudent_id() {
	return student_id;
}
public void setStudent_id(int student_id) {
	this.student_id = student_id;
}
public String getStudent_name() {
	return student_name;
}
public void setStudent_name(String student_name) {
	this.student_name = student_name;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public String getMail_id() {
	return mail_id;
}
public void setMail_id(String mail_id) {
	this.mail_id = mail_id;
}
}