package com.demo.chain_of_responsibility;

public class ServiceCharge extends Handler{

	@Override
	public double applyServiceCharge(SavingsAccount account) {
		return successor.applyServiceCharge(account);
	}
	
	

}
