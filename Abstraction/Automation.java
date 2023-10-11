package org.Abstraction;

public class Automation implements Language,TestTool {
	public void java() {
		System.out.println("java");
	}
	
	public void python() {
		System.out.println("python");
	}
	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("selenium");
		
	}
		
	public void ruby() {
		System.out.println("ruby");
	}
	public static void main(String[] args) {
		Automation auto=new Automation();
		auto.java();
		auto.Selenium();
		auto.python();
		auto.ruby();
	}
	
	}


