package com.tnsif.overriding;

public class Child extends Father{
	@Override
	int drinking() {
		System.out.println("horlicks");
	}
	
	public static void main(String[] args) {
		Child c=new Child();
		c.drinking();
	}
}
