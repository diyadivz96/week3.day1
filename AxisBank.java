package org.system;

public class AxisBank extends BankInfo{
	public void deposit() {
		System.out.println("Deposit amount 50-deposit");}
	public static void main(String[] args) {
BankInfo obj1=new BankInfo();
obj1.deposit();
AxisBank obj2=new AxisBank();
obj2.deposit();
	}

}
