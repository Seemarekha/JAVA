/*
Problem

Find integers:

x and y

such that:

ax+by=gcd(a,b)
 */

package com.Infosys_PYQ;

public class ExtendedGCD {

	static class Result {
		int gcd, x, y;

		public Result(int gcd, int x, int y) {
			this.gcd = gcd;
			this.x = x;
			this.y = y;
		}
	}

	public static void main(String[] args) {
		Result res = extendedGCD(30, 20);

		System.out.println("GCD = " + res.gcd);
		System.out.println("x = " + res.x);
		System.out.println("y = " + res.y);

	}

	private static Result extendedGCD(int a, int b) {
		if (b == 0) {
			return new Result(a, 1, 0);
		}

		Result next = extendedGCD(b, a % b);

		int x = next.y;
		int y = next.x - (a / b) * next.y;

		return new Result(next.gcd, x, y);
	}

}
