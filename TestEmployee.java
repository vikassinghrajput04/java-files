package com.employee;

public class TestEmployee {

	public static void main(String[] args) {
		EmployeeModel e = new EmployeeModel();
	
		Employee emp = new Employee();
		emp=e.add();
		System.out.println(emp.getAddress());

	}

}
