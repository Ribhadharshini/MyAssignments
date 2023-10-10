package org.bank;

public class AxisBank extends BankInfo {
	
	public void deposit() {
		System.out.println("the deposit amount");
	}
	public static void main(String[] args) {
		AxisBank user=new AxisBank();
		user.deposit();
	}

}
