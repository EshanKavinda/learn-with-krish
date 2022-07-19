package com.demo.chain_of_responsibility;

public class Between1000to2000 extends Handler{
	
	@Override
	public double applyServiceCharge(SavingsAccount account) {
		
		account.setServiceCharge(30.00);
		if (account.getAverageAmount() >= 1000 && account.getAverageAmount() < 2000) {
			System.out.println("Service charge calculated for average balance between 1000 to 2000");
			return account.getServiceCharge();
		}else {
			return successor.applyServiceCharge(account);
		}
		
	}

}
