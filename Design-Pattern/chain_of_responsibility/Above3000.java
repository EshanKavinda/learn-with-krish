package com.demo.chain_of_responsibility;

public class Above3000 extends Handler{
	
	@Override
	public double applyServiceCharge(SavingsAccount account) {
		
		account.setServiceCharge(0.00);
		System.out.println("Service charge calculated for above 3000");
		return account.getServiceCharge();
		
		
	}

}
