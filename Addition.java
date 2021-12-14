package com.java;

public class Addition {

public static void main(String[] args) {
	Addition addition=new Addition();
	int sum=addition.add(25, 10);
	System.out.println(sum);
	}
public int add(int num1, int num2) {
	int sum=num1+num2;
	return sum;
}
}
