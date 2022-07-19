package com.demo.chain_of_responsibility;

public class SavingsAccount {
	
	private int accountNo;
	private double averageAmount;
	private double serviceCharge;
	
	public SavingsAccount(int accountNo, double averageAmount) {
		this.accountNo = accountNo;
		this.averageAmount = averageAmount;
	}

	protected void setServiceCharge(double serviceCharge) {
		this.serviceCharge = serviceCharge;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public double getAverageAmount() {
		return averageAmount;
	}

	public double getServiceCharge() {
		return serviceCharge;
	}
	
	
	
	
	
	

}
