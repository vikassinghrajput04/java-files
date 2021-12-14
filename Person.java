package com.java;




public class Person {

	private String name=null;
	private String dateofbirth=null;
	private String address=null;
	
	
	public static void main(String[] args) {
		
		Person person=new Person();
		person.setAddress("new dwarkapuri indore");
		person.setName("Vikas");
		person.setDob("04-08-2001");
		System.out.println("Person's name is "+person.getName());
		System.out.println("Date Of Birth is "+person.getDob());
		System.out.println("address is "+person.getAddress());
		System.out.println("Age is "+Person.Age(20));

	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDob() {
		return dateofbirth;

	}
	public void setDob(String dateofbirth) {
		this.dateofbirth = dateofbirth;

	}
	public static int Age(int age) {
		return age;

	}
	

}
