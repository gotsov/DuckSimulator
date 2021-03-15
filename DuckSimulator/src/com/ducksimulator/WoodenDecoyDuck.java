package com.ducksimulator;

public class WoodenDecoyDuck extends Duck{
	
	public WoodenDecoyDuck(String species, String name, int age, String color) {
		super(species, name, age, color);
	}
	
	public void quack() {
		System.out.println("I'm not alive...I can't quack");
	}

	public void fly() {
		System.out.println("Can't move my wooden wings :(");	
	}

	public void swim() {
		System.out.println("I'm floating around");
	}

	public void walk() {
		System.out.println("I can't walk");	
	}
}
