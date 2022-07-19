package com.demo.chain_of_responsibility;

public class Below1000 extends Handler{

	@Override
	public double applyServiceCharge(SavingsAccount account) {
		
		account.setServiceCharge(35.00);
		if (account.getAverageAmount() < 1000) {
			System.out.println("Service charge calculated for average balance less than 1000");
			return account.getServiceCharge();
		}else {
			return successor.applyServiceCharge(account);
		}
		
	}

}
