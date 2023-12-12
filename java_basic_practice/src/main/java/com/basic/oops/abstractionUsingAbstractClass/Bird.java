package com.basic.oops.abstractionUsingAbstractClass;

public class Bird extends Animal{

	@Override
	void eat() {
		System.out.println("Eats Birdfood.");
	}
	
	@Override
	void move() {
		System.out.println("Moves by Flying.");
	}

}
