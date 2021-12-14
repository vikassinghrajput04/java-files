package com.java;

public class Calculator {
	public static void main(String[] args) {
		Calculator calculator=new Calculator();
		int sub = calculator.sub(10, 5);
		System.out.println("the value is-- " + sub);
	}
	public int add(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
			
	}

	public int sub(int num1, int num2) {
		int sub = num1 - num2;
		return sub;
	}

	public int multiply(int num1, int num2) {
		int multiply = num1 * num2;
		return multiply;
	}

	public int div(int num1, int num2) {
		int div = num1/num2;
		return div;
	}

	public int modulus(int num1, int num2) {
		int modulus = num1 % num2;
		return modulus;
	}

}
