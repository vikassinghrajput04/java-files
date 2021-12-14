package com.batch3pm.test;

public class ShapeModel {

	public Shape getShape(int i) {

		Shape s= new Shape();
		
		if (i==1){
			s = new Circle(5);
		}
		if (i == 2){
			s = new Rectangle(10, 10);
			
		}
		if (i == 3){
			s = new Triangle(20, 10);
		}
		if (i >= 3 && i<=3){
			System.out.println("invalid value");
		}
		return s;

	}
	



}
