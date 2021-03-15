package com.ducksimulator;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		DuckController duckController = new DuckController();
	
		System.out.println("This is your pond.");
		System.out.println("You have different species of ducks.");
		System.out.println("You can add new duck, edit them and you can choose which one to control.");
		
		try {
			menu(duckController);
		} catch (InputMismatchException e) {
			e.printStackTrace();
		}
		
	}

	public static void menu(DuckController duckController) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What do you want to do?");
		
		System.out.println("a. Add a new duck");
		System.out.println("b. Edit a duck");
		System.out.println("c. Control a duck");
		System.out.println("d. See list of ducks");
		System.out.println("e. Exit");
		
		String choice = scan.next();
		
		while(!choice.equals("e")) {
			switch (choice) {
			case "a":
				duckController.addNewDuck();
				break;
			case "b":
				duckController.editDuck();
				break;
			case "c":
				duckController.controlDuck();
				break;
			case "d":
				duckController.printAllDucks();
				break;
			default:
				System.out.println("Invalid choice");
				break;
			}
			
			if(!choice.equals("e")) {
				System.out.println("a. Add a new duck");
				System.out.println("b. Edit a duck");
				System.out.println("c. Control a duck");
				System.out.println("d. See list of ducks");
				System.out.println("e. Exit");
				choice = scan.next();
			}
				
		}
		
	}
}
