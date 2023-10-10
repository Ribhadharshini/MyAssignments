package org.bank;

public class BankInfo {
	
	public void savings() {
		System.out.println("the amount of savings");
	}
	public void fixed() {
		System.out.println("the amount fixed");
	}
	public void deposit() {
		System.out.println("the amount of deposit");
	}
	public static void main(String[] args) {
		BankInfo branch=new BankInfo();
		branch.savings();
		branch.fixed();
		branch.deposit();
	}

}
