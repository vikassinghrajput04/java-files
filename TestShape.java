package com.batch3pm.test;



public class TestShape {
	

	
	public static void main(String[] args) {
		
		Shape []s = new Shape [3];
		s[0] = new Circle(5);
		s[1] = new Rectangle(10, 10);
		s[2] = new Triangle(20, 10);
		
		System.out.println("the Circle area is--- "+ s[0].area());
		System.out.println("the Rectangle area is--- "+ s[1].area());
		System.out.println("the Triangle area is--- "+ s[2].area());

		double totalarea=0.00;
		
		for (int i = 0; i < s.length; i++) {
			totalarea += s[i].area();
		}
		System.out.println("the total area is-- "+totalarea);
		
		
		ShapeModel m = new ShapeModel();
		Shape n=new Shape();
		n= m.getShape(1);
		System.out.println(n.area());
	  
		
		
		
	}
	
	
}
