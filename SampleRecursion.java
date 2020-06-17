package com.dayfive;

public class SampleRecursion {
	static int i = 0;
	static int j = 1;

	static void sahoo() {
		System.out.println("hello  sahoo");
		sahoo1();
		System.out.println("sahoo gone");
	}

	static void sahoo1() {
		System.out.println("hello  sahoo1 call lovika");
		lovika();
		System.out.println("sahoo1 gone");
	}

	static void lovika() {
		System.out.println("hello  lovika");
	}

	public static void main(String[] args) {
		sahoo();
	}
}