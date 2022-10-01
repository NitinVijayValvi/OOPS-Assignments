package com.yash.oops2;

import java.util.Scanner;

public class Test {

	public static void home() {

		System.out.println("!Calculate Area!" + "\n1 Area of Circle" + "\n2 Area of Triangle"
				+ "\n3 Area of Sphere" + "\n4 Exit!"

		);

	}

	public static void main(String[] args) {
		boolean flag = true;

		Scanner sc = new Scanner(System.in);
		do {
			home();

			System.out.println("Enter choice :");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				Circle circle = new Circle();

				System.out.println("Area of Circle is : "+circle.area());

				break;
			case 2:
				Triangle triangle = new Triangle();

				System.out.println("Area of Triangle is : "+triangle.area());
				break;

			case 3:
				Sphere sphere = new Sphere();

				System.out.println("Area of Sphere is : "+sphere.area());
				break;
			case 4:
				System.out.println("Exit");
				System.exit(0);
				break;
			default:
				break;

			}
		} while (flag);

	}
}
