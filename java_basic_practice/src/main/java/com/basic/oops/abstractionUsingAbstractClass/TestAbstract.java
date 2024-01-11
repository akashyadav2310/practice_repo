package com.basic.oops.abstractionUsingAbstractClass;

public class TestAbstract {

	public static void main(String[] args) {
		
		// Test Bird extended methods from Animal and its own methods
		Animal bird = new Bird();
		bird.label();
		bird.eat();
		bird.move();
		
		// Test Bird extended methods from Animal and its own methods
		System.out.println("Fish :");
		Animal fish = new Fish();
		fish.label();
		fish.eat();
		fish.move();
		
				
		
	}

}
