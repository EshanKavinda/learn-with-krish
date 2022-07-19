package com.demo.chain_of_responsibility;

public class MainApp {

	public static void main(String[] args) {
		
		Below1000 step1 = new Below1000();
		Between1000to2000 step2 = new Between1000to2000();
		Between2000to3000 step3 = new Between2000to3000();
		Above3000 step4 = new Above3000();
		
		ServiceCharge serviceCharge = new ServiceCharge();
		
		serviceCharge.setSuccessor(step1);
		step1.setSuccessor(step2);
		step2.setSuccessor(step3);
		step3.setSuccessor(step4);
		
		SavingsAccount savingsAccount = new SavingsAccount(223344, 558.00);
		System.out.println(serviceCharge.applyServiceCharge(savingsAccount));
		
		SavingsAccount savingsAccount1 = new SavingsAccount(223344, 1200.00);
		System.out.println(serviceCharge.applyServiceCharge(savingsAccount1));
		
		SavingsAccount savingsAccount2 = new SavingsAccount(223344, 2500.00);
		System.out.println(serviceCharge.applyServiceCharge(savingsAccount2));
		
		SavingsAccount savingsAccount3 = new SavingsAccount(223344, 6000.00);
		System.out.println(serviceCharge.applyServiceCharge(savingsAccount3));
		
	}
	
}
