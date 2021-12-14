package com.java;

public class Automobile {
	private String color=null;
	private String make=null;
	private int num1;
	private int num2;
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}
	public void breakk(int num1) {
	
	}
	public void changeGear(int num2) {
		
	}
	public void accelerator(int num3) {
		
	}

	public int getspeed(int num) {
		int Speed= num*(num2-num1);
		return Speed;
	}
	
	

}
