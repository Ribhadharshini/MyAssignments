package org.bank;

public class Students {
	
	public void getStudentInfo(int id) {
		System.out.println("getting student info by id:"+ id);
	}
	public void getStudentInfo(int id,String name) {
		System.out.println("getting student info by id and name:"+id+","+name);
	}
	public void getstudentInfo(String email,String phoneNumber) {
		System.out.println("getting student info by email and phoneNumber:"+email+","+phoneNumber);
	}
	public static void main(String[] args) {
		Students count=new Students();
		count.getStudentInfo(326);
		count.getStudentInfo(342, "ribha");
		count.getstudentInfo("ribha23@gmail.com", "2345167890");
	}


}
