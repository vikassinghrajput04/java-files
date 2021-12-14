package com.constructor.example;

public class Child extends Person{

	@Override
	public void changeAddress() {
		System.out.println("*****");
		super.changeAddress();
		System.out.println("Employee Change Address");
	}
	public static void main(String[] args) {
		Child child=new Child();
		child.changeAddress();
	}
}
