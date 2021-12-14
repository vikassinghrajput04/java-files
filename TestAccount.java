package com.java;

public class TestAccount {

	
	public static void main(String[] args) {
	
		Account Ramesh=new Account();
		Account Suresh=new Account();
		
		Ramesh.setBalance(50000);
		Suresh.setBalance(60000);
		
		Ramesh.deposit(15000, Ramesh);
		System.out.println("the final balance of Ramesh is ----  " + Ramesh.getBalance());
		
		Suresh.deposit(10000, Suresh);
		System.out.println("the final balance of Suresh is ----  "+ Suresh.getBalance());
		
		Ramesh.withdrawal(15000, Ramesh);
		System.out.println("the final balance of Ramesh is ----  "+Ramesh.getBalance());
		
		Suresh.withdrawal(5000, Suresh);
		System.out.println("the final balance of Suresh is ----  "+Suresh.getBalance());
		
		Ramesh.fundtransfer(10000, Ramesh, Suresh);
		System.out.println("the final balance of Ramesh is ----  "+ Ramesh.getBalance());
		System.out.println("the final balance of Suresh is ----  "+ Suresh.getBalance());
		
		
	}

}
