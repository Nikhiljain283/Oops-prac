package com.oops;

class Parent {
	void method() {
		System.out.println("this is parent method 1 ");
	}
}
class Child extends Parent {
	void method() {
		System.out.println("this is child class 1");
	}
}

public class MetodOverridding {
	public static void main(String[] args) {
		Parent obj1 = new Parent();
		obj1.method();
		Parent obj2 = new Child();
		obj2.method();
	}

}
