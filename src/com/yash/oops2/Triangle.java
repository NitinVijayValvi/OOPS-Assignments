package com.yash.oops2;

import java.util.Scanner;

public class Triangle implements Shape {

	@Override
	public double area() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the base : ");
		double b = scanner.nextDouble();
		
		
		System.out.println("Enter the height : ");
		double h = scanner.nextDouble();
		
		double areaoftriangle= 0.5 * b* h;
		
		return areaoftriangle;
		
		
	}

}
