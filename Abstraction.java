package com.oops;

abstract class Animal{
	public abstract void eat();
	public abstract void sleep();
	public void walk() {
		System.out.println("walk on four leg");
	}
}
class Pig extends Animal{
	@Override
	public void eat() {
		System.out.println("pig eat grass");
	}
	@Override
	public void sleep() {
		System.out.println("pig is sleeping");
	}
	
}

public class Abstraction {
	public static void main(String[] args) {
		
		Pig pig = new Pig();
		pig.eat();
		pig.walk();
		pig.sleep();
	}
}
