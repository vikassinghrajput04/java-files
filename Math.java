package com.methodoverloading;

public class Math {

	public static void main(String[] args) {
		Math math =new Math();
		
		System.out.println(math.add(200, 2200));
	}
	public int add(int a, int b) {
		int sum= a+b;
		return sum;

	}
	public int add(short a, int b) {
		int sum= a+b;
		return sum;

	}
	public int add(int a, short b) {
		int sum= a+b;
		return sum;

	}
	public long add(long a, long b) {
		long sum= a+b;
		return sum;

	}
	public int add(short a, short b) {
		int sum= a+b;
		return sum;

	}




   

}
