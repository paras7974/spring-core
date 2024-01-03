package com.rays.ioc;

import org.springframework.beans.factory.annotation.Value;

public class Payment {
	
	@Value(value = "100")
	double balance = 0;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double MakePayment(double amt) {
		balance = balance - amt;
		return balance;
		
	}
	
	public double Deposite(double amt) {
		
		balance = balance + amt;
		return balance;
		
	}

}
