package com.batch3pm.test;

public class Rectangle extends Shape {
	private double length;
	private double breadth;
	
	public double area() {
		return length*breadth ;
	}
	
	public double getLength() {
		return length;
	}
	public Rectangle(double length,double breadth) {
		this.length = length;
		this.breadth=breadth;
		
	}
	public double getbreadth() {
		return breadth;
	}
	
	
	
			
}
