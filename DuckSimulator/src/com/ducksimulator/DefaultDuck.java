package com.ducksimulator;

public class DefaultDuck extends Duck {
	
	public DefaultDuck(String species, String name, int age, String color) {
		super(species, name, age, color);
	}
	
	public void quack() {
		System.out.println("quack !");
	}

	public void fly() {
		System.out.println("I can't fly....");
	}

	public void swim() {
		System.out.println("Swimming in the pond");
	}

	public void walk() {
		System.out.println("Walking on the grass");
	}

}
