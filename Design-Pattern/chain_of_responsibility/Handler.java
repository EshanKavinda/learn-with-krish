package com.demo.chain_of_responsibility;

public abstract class Handler {
	
	protected Handler successor;

	public void setSuccessor(Handler successor) {
		this.successor = successor;
	}
	
	public abstract double applyServiceCharge(SavingsAccount account);

}
