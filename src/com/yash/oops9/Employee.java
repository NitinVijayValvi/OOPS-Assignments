package com.yash.oops9;

public class Employee implements Cloneable {
	public int empId;
	public String empName;
	public int empSalary;
	public String deptname;

	public Employee(int empId, String empName, int empSalary, String deptname) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.deptname = deptname;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public static void main(String[] args) {
		try {
			Employee e1 = new Employee(101, "nitin", 60000, "COMP");

			Employee e2 = (Employee) e1.clone();

			System.out.println("Employee Name: "+e1.empName);
			System.out.println("Employee Name After clone: "+e2.empName);

			String empName = "abc";
			boolean output1 = empName instanceof String;
			System.out.println("empName: " +empName+ " is instance of Employee: " + output1);
			boolean output2 = e1 instanceof Employee;
			System.out.println("e1 is instance of Employee: " + output2);

		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}