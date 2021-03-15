package com.ducksimulator;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DuckController {
	public ArrayList<Duck> arrayOfDucks = new ArrayList<>();
	
	public Duck addNewDuck() throws InputMismatchException {
		Scanner scan = new Scanner(System.in);
		String name, color;
		int age;
		
		Duck newDuck;
		
		System.out.println("name: ");
		name = scan.next();
		System.out.println("age: ");
		age = scan.nextInt();
		System.out.println("color: ");
		color = scan.next();
		
		System.out.println("choose species:");
		System.out.println("a. Default Duck");
		System.out.println("b. Rubber Duck");
		System.out.println("c. Wooden Decoy Duck");
		
		String choice = scan.next();
		
		switch (choice) {
		case "a":
			newDuck =  new DefaultDuck("Default duck", name, age, color);
			addDuckToArrayList(newDuck);
			System.out.println("Added a new default duck to your pond: " + name + ", " + age + ", " + color);
			return newDuck;
		case "b":
			newDuck =  new RubberDuck("Rubber duck", name, age, color);
			addDuckToArrayList(newDuck);
			System.out.println("Added a new rubber duck to your pond: " + name + ", " + age + ", " + color);
			return newDuck;
		case "c":
			newDuck =  new WoodenDecoyDuck("Wooden Decoy Duck", name, age, color);
			addDuckToArrayList(newDuck);
			System.out.println("Added a new wooden decoy duck to your pond: " + name + ", " + age + ", " + color);
			return newDuck;
		default:
			System.out.println("No such duck...");
			break;
		}
		
		return new DefaultDuck("Default duck", name, age, color);
	}
	
	public void addDuckToArrayList(Duck duckToAdd) {
		arrayOfDucks.add(duckToAdd);
	}
	
	public void controlDuck() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Choose duck to control: ");
		
		printAllDucks();
		int choice = scan.nextInt();
		
		System.out.println("You are controlling: " + arrayOfDucks.get(choice).toString());
		
		makeAction(arrayOfDucks.get(choice));
	}
	
	public void makeAction(Duck controlledDuck) {
		Scanner scan = new Scanner(System.in);
		System.out.println("You can quack, swim, walk and even FLY!!!");
		System.out.println("What do you want to do?");
		
		System.out.println("a. quack");
		System.out.println("b. swim");
		System.out.println("c. walk");
		System.out.println("d. fly");
		
		String choice = scan.next();
		
		switch (choice) {
		case "a":
			controlledDuck.quack();
			break;
		case "b":
			controlledDuck.swim();
			break;
		case "c":
			controlledDuck.walk();
			break;
		case "d":
			controlledDuck.fly();
			break;
		default:
			System.out.println("No such action...");
			break;
		}
	}
	
	public void editDuck() throws InputMismatchException{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Choose duck to edit: ");
		
		printAllDucks();
		int choice = scan.nextInt();
		
		System.out.println("What do you want to edit: ");
		System.out.println("a. name");
		System.out.println("b. age");
		System.out.println("c. color");
		
		String choiceEdit = scan.next();
		
		String newInfo;
		int newAge;
		
		switch (choiceEdit) {
		case "a":
			System.out.println("new name: ");
			newInfo  = scan.next();
			arrayOfDucks.get(choice).setName(newInfo);
			break;
		case "b":
			System.out.println("new age: ");
			newAge  = scan.nextInt();
			arrayOfDucks.get(choice).setAge(newAge);
			break;
		case "c":
			System.out.println("new color: ");
			newInfo  = scan.next();
			arrayOfDucks.get(choice).setColor(newInfo);
			break;
		default:
			System.out.println("No such duck...");
			break;
		}
		
	}
	
	public void printAllDucks() {
		for (int i = 0; i < arrayOfDucks.size(); i++) {
			System.out.println(i + "." + arrayOfDucks.get(i).toString());
		}
	}

	public ArrayList<Duck> getArrayOfDucks() {
		return arrayOfDucks;
	}
	
}
