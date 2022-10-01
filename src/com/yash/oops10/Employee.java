package com.yash.oops10;

import java.time.LocalDate;
import java.util.Date;

public class Employee {

	private int empid;
	private String empname;
	private float empsalary;
	private String empaddress;
	private Date emp_dob;
	private Date emp_doj;

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public float getEmpsalary() {
		return empsalary;
	}

	public void setEmpsalary(float empsalary) {
		this.empsalary = empsalary;
	}

	public String getEmpaddress() {
		return empaddress;
	}

	public void setEmpaddress(String empaddress) {
		this.empaddress = empaddress;
	}

	public Date getEmp_dob() {
		return emp_dob;
	}

	public void setEmp_dob(Date emp_dob) {
		this.emp_dob = emp_dob;
	}

	public Date getEmp_doj() {
		return emp_doj;
	}

	public void setEmp_doj(Date emp_doj) {
		this.emp_doj = emp_doj;
	}

	public Employee() {
		System.out.println("Default Constructor");
	}

	public Employee(int empid, String empname, float empsalary, String empaddress, Date emp_dob, Date emp_doj) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empsalary = empsalary;
		this.empaddress = empaddress;
		this.emp_dob = emp_dob;
		this.emp_doj = emp_doj;
	}

	@Override
	public String toString() {
		return "Employee id = " + getEmpid() + "\n Employee Name= " + getEmpname() + "\n Employee salary= "
				+ getEmpsalary() + "\n Employee address= " + getEmpaddress() + "\n Employee Date of Birth= "
				+ getEmp_dob() + "\n Employee Date of joining= " + getEmp_doj();
	}

	public static void main(String[] args) {

		Employee employee1 = new Employee(11111, "Nitin", 67277, "Pune", new Date(1991, 07, 05), new Date(2022, 8, 16));
		System.out.println(employee1.toString());

	}

}
