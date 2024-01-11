package com.basic.oops.abstractionUsingInterface;

public class Tesla implements Vehicle, Car {

	@Override
	public void isAuto() {
		System.out.println("Is an Automated car.");
	}

	@Override
	public void milage() {
		System.out.println("Milage : 20 KM/L");
	}

	@Override
	public void noOfCapacity() {
		System.out.println("Capacity (No. of persons) : 4");
	}

}
