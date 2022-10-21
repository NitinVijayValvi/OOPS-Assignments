package com.yash.oops8;

public class Test {
	Test() {
		System.out.println("Object Creation");
	}

	protected void finalize() {
		System.out.println("Object Destroyed");
	}

	public static void main(String[] args) {
		Test t = new Test();

		System.out.println(t.hashCode());
		t = null;
		System.out.println(t);
		Test p1 = new Test();
		System.out.println(p1.hashCode());
		Test p2 = new Test();
		System.out.println(p2.hashCode());
		p1 = p2;
		new Test();
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.gc();
	}

}