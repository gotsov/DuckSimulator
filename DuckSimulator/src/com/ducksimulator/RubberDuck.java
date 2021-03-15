package com.ducksimulator;

public class RubberDuck extends Duck{
	
	public RubberDuck(String species, String name, int age, String color) {
		super(species, name, age, color);
	}

	@Override
	public void quack() {
		System.out.println("Quaack");
	}
	
	public void fly() {
		System.out.println("I can't fly... but I can float on water :)");
	}

	public void swim() {
		System.out.println("I'm floating");
	}

	public void walk() {
		System.out.println("I have no legs :(");
	}

}
