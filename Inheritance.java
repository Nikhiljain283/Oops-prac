package com.oops;

class School{
	void population() {
		System.out.println("school strength is : 2000");
	}
}
class Classes extends School{
	void classNum() {
		System.out.println("Number of classes : 50");
	}
}
class Teacher extends Classes{
	void teacherNum() {
		System.out.println("Number of teachers : 80");
	}
}
public class Inheritance {
	public static void main(String[] args) {
		Teacher teacher = new Teacher();
		teacher.teacherNum();
		teacher.classNum();
		teacher.population();	
	}
}
