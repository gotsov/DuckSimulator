package com.ducksimulator;

public abstract class Duck {
	private String species;
	private String name;
	private String color;
	private int age;
	
	public Duck(String species, String name, int age, String color) {
		this.species = species;
		this.name = name;
		this.color = color;
		this.age = age;
	}
	
	public abstract void quack();
	public abstract void fly();
	public abstract void swim();
	public abstract void walk();
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return species + ": [name: " + name + ", color: " + color + ", age: " + age + "]";
	}
}
