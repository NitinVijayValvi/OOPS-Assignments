package com.yash.oops2;

import java.util.Scanner;

public class Circle implements Shape {

	@Override
	public double area() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the radius to calculte Area of Circle");
		
		double a = scanner.nextDouble();
		
		double area = 3.14* (a*a);
		return area;
		
	}

}
