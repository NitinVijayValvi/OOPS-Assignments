package com.yash.oops2;

import java.util.Scanner;

public class Sphere implements Shape {

	@Override
	public double area() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the radius of sphere : ");
		double radius = scanner.nextDouble();
		
		double areaofsphere = 4*3.14*radius*radius;		
		return areaofsphere;
	}

}
