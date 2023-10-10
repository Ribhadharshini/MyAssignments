package org.college;

public class College {
	
	public void collegeName() {
		System.out.println("name of the college");
	}
	public void collegeCode() {
		System.out.println("the code of the college");
	}
	public void collegeRank() {
		System.out.println("the rank of the college");
	}
	public static void main(String[] args) {
		College model=new College();
		model.collegeName();
		model.collegeName();
		model.collegeRank();
	}

}
