package org.student;

import org.department.Department;

public class Student extends Department {
	
	public void studentName() {
		System.out.println("enter the student name");
	}
	public void studentDept() {
		System.out.println("enter the student department");
	}
	public void studentId() {
		System.out.println("enter the student id");
	}
	public static void main(String[] args) {
		Student stu=new Student();
		stu.studentName();
		stu.studentDept();
		stu.studentId();
		stu.deptName();
		stu.collegeCode();
		stu.collegeName();
		stu.collegeRank();
		
	}

}
