package com.basic.oops.staticExamples;

public class Main {

	public static void main(String[] args) {
		Human h1 = new Human(23, "Raj", false);
		System.out.println(Human.population); // Use or get Static variable value through directly class name . (not a object instance)
		Human h2 = new Human(31, "Amruta", true);
		
		System.out.println(Human.population);
		System.out.println(Human.population);
		
		System.out.println(h1);
		System.out.println(h2);
	}
	
	void greetings() {
		System.out.println("Hello...");
	}
	
	 void celebration() {
		greetings();
	}

}
