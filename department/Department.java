package org.department;

import org.college.College;

public class Department extends College {
	
	public void deptName() {
		System.out.println("enter the department name");
	}
	public static void main(String[] args) {
		Department sec=new Department();
		sec.deptName();
		sec.collegeCode();
		sec.collegeName();
		sec.collegeRank();
	}

}
