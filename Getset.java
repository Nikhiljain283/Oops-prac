package com.oops;

class Encap{
	
	private String name;
	
	public void setname(String n) {
	this.name = n;
	}
	public String getname() {
		return name;
	}
}

public class Getset {
	public static void main(String[] args) {
		Encap obj = new Encap();
		obj.setname("Ram");
		System.out.println(obj.getname());
	}
	
}
