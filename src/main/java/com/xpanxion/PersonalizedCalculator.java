package com.xpanxion;

import java.util.Scanner;

public class PersonalizedCalculator {
	
	public static final int ADDITION = 1;
	public static final int SUBTRACTION = 2;
	public static final int MULTIPLICATION = 3;	
	public static final int DIVISION = 4;
	
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
		System.out.println(" 1) Addition");
		System.out.println(" 2) Subtraction");
		System.out.println(" 3) Multiplication");
		System.out.println(" 4) Division");
		System.out.println("What would you like to do?");
		int operation = keyboard.nextInt();
		
		switch(operation) {
		case ADDITION:
			promptForNumbers();
			int addend = keyboard.nextInt();
			int augend = keyboard.nextInt();
			
			int sum = addend + augend;
			
			displayResultHeader();
			System.out.println("  " + addend + " + " +  augend  + " = " + sum);
			break;
		case SUBTRACTION:
			promptForNumbers();
			int minuend = keyboard.nextInt();
			int subtrahend = keyboard.nextInt();
			
			int difference = minuend - subtrahend;
			
			displayResultHeader();
			System.out.println("  " + minuend + " - " +  subtrahend  + " = " + difference);
			break;
		case MULTIPLICATION:
			promptForNumbers();
			int multiplier = keyboard.nextInt();
			int multiplicand = keyboard.nextInt();
			
			int product = multiplier * multiplicand;
			
			displayResultHeader();
			System.out.println("  " + multiplier + " * " +  multiplicand  + " = " + product);
			break;
		case DIVISION:
			promptForNumbers();
			int dividend = keyboard.nextInt();
			int divisor = keyboard.nextInt();
			
			if(divisor == 0 ) {
				System.out.println("I'm sorry, but you cannot divide by zero.");
			}
			else{
				int quotient = dividend / divisor;
				
				System.out.println("");
				System.out.println("  " + dividend + " / " +  divisor  + " = " + quotient);
				}
			break;
		default:
			System.out.println("I'm sorry, I don't undnerstand what '" + operation +"' is.");
		}
	}

}
