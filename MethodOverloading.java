package com.oops;

public class MethodOverloading {
	static int add(int x, int y) {
		return x+y;
	}
	static int add(int x, int y, int z) {
		return x+y+z;
	}
	static  double add(double x, double y) {
		return x+y;
	}
	public static void main(String[] args) {
		int result = add(2,3);
		int result2 = add(4,6,3);
		double result3 = add(5.87,8.5);
	System.out.println(result);
	System.out.println(result2);
	System.out.println(result3);
	}

}
