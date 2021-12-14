package com.batch3pm.test;

public class Triangle extends Shape {

	private double base;
	private double height;
	private static final double Constant=0.5;
	
	public double area() {
		return height*base*Constant;
		}
	
	public Triangle(double base,double height) {
	this.base=base;
	this.height=height;
	}
	
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	
}
