package com.xpanxion;

import java.util.Scanner;

public class PersonalizedCalculator {
	public static final int QUIT = 0;
	public static final int ADDITION = 1;
	public static final int SUBTRACTION = 2;
	public static final int MULTIPLICATION = 3;	
	public static final int DIVISION = 4;
	public static final int FACTORIAL = 5;
	
	private static void promptForNumbers() {
		System.out.println("");
		System.out.print("Please enter numbers (separated by spaces); ");
	}
	
	private static void displayResultHeader() {
		System.out.println("");
		System.out.println("Results: ");
	}
	
	private static Calculation performAction(int operation, String name, Scanner keyboard){
		Calculation result = new Calculation();
		switch(operation) {
		case QUIT:
			result.setTextResult("Goodbye, " + name);
			break;
		case ADDITION:
			
			int addend = keyboard.nextInt();
			int augend = keyboard.nextInt();
			
			int sum = addend + augend;
			
			displayResultHeader();
			result.setTextResult("  " + addend + " + " +  augend  + " = " + sum);
			break;
		case SUBTRACTION:
			
			int minuend = keyboard.nextInt();
			int subtrahend = keyboard.nextInt();
			
			int difference = minuend - subtrahend;
			
			displayResultHeader();
			result.setTextResult("  " + minuend + " - " +  subtrahend  + " = " + difference);
			break;
		case MULTIPLICATION:
			
			int multiplier = keyboard.nextInt();
			int multiplicand = keyboard.nextInt();
			
			int product = multiplier * multiplicand;
			
			displayResultHeader();
			result.setTextResult("  " + multiplier + " * " +  multiplicand  + " = " + product);
			break;
		case DIVISION:
			
			int dividend = keyboard.nextInt();
			int divisor = keyboard.nextInt();
			
			if(divisor == 0 ) {
				result.setTextResult("I'm sorry, but you cannot divide by zero.");
			}
			else{
				int quotient = dividend / divisor;
				
				System.out.println("");
				result.setTextResult("  " + dividend + " / " +  divisor  + " = " + quotient);
				}
			break;
		case FACTORIAL:
		
			int value = keyboard.nextInt();
			int total = 1;
			
			for(int i = value; i > 0; i--) {
				total *= i;
			}
			displayResultHeader();
			System.out.println(" " + value + "! = " + total);
			break;
		default:
			result.setTextResult("I'm sorry, I don't undnerstand what '" + operation +"' is.");
		}
		return result;
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
		
		while(operation != QUIT) {
		System.out.println("What would you like to do?");
		operation = keyboard.nextInt();		
		if(operation >= ADDITION && operation <= FACTORIAL){
			promptForNumbers();
		}
		Calculation answer = performAction(operation,name,keyboard);
		
		System.out.println(answer.getTextResult());
		
		}
	}

}
