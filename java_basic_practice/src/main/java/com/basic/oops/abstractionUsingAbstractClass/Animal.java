package com.basic.oops.abstractionUsingAbstractClass;

abstract class Animal {

	// abstract methods
	abstract void eat();
	abstract void move();

	// concrete method
	public void label() {
		System.out.println("Animal's Data: ");
	}

}
