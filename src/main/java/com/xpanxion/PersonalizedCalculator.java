package com.xpanxion;

import java.util.Scanner;

public class PersonalizedCalculator {
	
	
	private static void promptForNumbers() {
		System.out.println("");
		System.out.print("Please enter numbers (separated by spaces); ");
	}
	
	private static void displayResultHeader() {
		System.out.println("");
		System.out.println("Results: ");
	}
	
	
	
	public static void main(String[] args) {
		System.out.print("What is your name? ");
		
		Scanner keyboard = new Scanner(System.in);
		String name = keyboard.next();
		
		System.out.println("Hi, " + name);
		System.out.println("I can perform the following operations: ");
		System.out.println(" 0) Quit");
		System.out.println(" 1) Addition");
		System.out.println(" 2) Subtraction");
		System.out.println(" 3) Multiplication");
		System.out.println(" 4) Division");
		System.out.println(" 5) Factoral");
		int operation = -1;
		
		Calculator c = new Calculator();
		while(operation != Calculator.QUIT) {
		System.out.println("What would you like to do?");
		operation = keyboard.nextInt();		
		if(c.supports(operation)){
			promptForNumbers();
		}
		Calculation answer = c.performAction(operation,name,keyboard);
		
		System.out.println(answer.getTextResult());
		
		}
	}

}
