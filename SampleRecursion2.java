package com.dayfive;

public class SampleRecursion2 {

	static int factorial(int n) {
		if (n == 1) {
			return 1;
		}

		return (n * factorial(n - 1));

	}

	public static void main(String[] args) {
//		System.out.println(factorial(5));
		System.out.println(1/0.0);
	}

	static int i = 0;
	static int j = 1;

	static void p() {
		System.out.println("hello" + ++i);
		if (j < 5) {
			++j;
			p();
		}
	}

	static void p1() {
		System.out.println("hello " + ++i);

		if (j == 4) {
			return;
		}

		if (j < 4) {
			++j;
			p1();
		}
		System.out.println("lovika " + ++i);

	}

}