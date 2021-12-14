package com.bank;


public class HomeLoan {

	public static void main(String[] args) {

		Bank[] bank = new Bank[3];
		bank[0]=new AxisBank();
		bank[1]=new HDFCBank();
		bank[2]=new ICICIBank();
		loanEnquiry(bank);
	

	}
	public static void loanEnquiry(Bank[] banks) {
		for (Bank b : banks) {
			String name =b.getName();
			double rate = b.interestRate();
			System.out.println(name+ " = " + rate);
		}

	}

}
