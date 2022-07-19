package com.demo.chain_of_responsibility;

public class Between2000to3000 extends Handler{

	@Override
	public double applyServiceCharge(SavingsAccount account) {
		
		account.setServiceCharge(5.00);
		if (account.getAverageAmount() >= 2000 && account.getAverageAmount() < 3000) {
			System.out.println("Service charge calculated for average balance between 2000 to 3000");
			return account.getServiceCharge();
		}else {
			return successor.applyServiceCharge(account);
		}
		
	}
	
	

}
