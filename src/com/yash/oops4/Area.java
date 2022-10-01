package com.yash.oops4;

import java.util.Scanner;

public class Area {
	public void calculateArea(double sides) {
		Scanner sc = new Scanner(System.in);
		if (sides == 2) {

			System.out.println("Enter the first side: ");
			double a = sc.nextDouble();
			System.out.println("Enter the 2nd side");
			double b = sc.nextDouble();
			double areaofsqaure = a * b;
			System.out.println(areaofsqaure);
		}
		if (sides == 3) {
			System.out.println("Enter the first side: ");
			double base = sc.nextDouble();
			System.out.println("Enter the 2nd side");
			double height = sc.nextDouble();

			System.out.println("Enter the 3nd side");
			double c = sc.nextDouble();
			double areaoftriangle = 0.5 * base * height;
			System.out.println(areaoftriangle);
		}

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Area area = new Area();
		System.out.println("Enter the sides");
		area.calculateArea(scanner.nextDouble());

		
		
	}

}
