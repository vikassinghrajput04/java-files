package com.java;

public class Account {

	private String number;
	private String accountType;
	private double balance;
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void deposit(int amount, Account Ramesh) {
		Ramesh.setBalance(amount+Ramesh.getBalance());

	}
	public void withdrawal(int amount, Account Ramesh) {
	 Ramesh.setBalance(Ramesh.getBalance()-amount);

	}
	
	public void fundtransfer(int amount, Account Ramesh,Account Suresh) {
	
		Ramesh.setBalance(amount+Ramesh.getBalance());
		Suresh.setBalance(Suresh.getBalance()-amount);

	}	
		
}
