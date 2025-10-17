package com.Problems;

public class Integer_Division {

	public static void main(String[] args) {
		int dividend = 43;
		int divisor = -8;

		int result = divide(dividend, divisor);
		System.out.println("Result: " + result); // -5

	}

	private static int divide(int dividend, int divisor) {
		if (divisor == 0)
			throw new ArithmeticException("Division by 0");

		if (dividend == Integer.MIN_VALUE && divisor == -1)
			return Integer.MAX_VALUE;

		boolean negative = (dividend < 0) ^ (divisor < 0);

		int dvd = Math.abs(dividend);
		int dvs = Math.abs(divisor);

		int quotient = 0;

		while (dvd >= dvs) {
			dvd -= dvs;
			quotient++;
		}

		return (negative) ? -quotient : quotient;
	}

}
