package com.xpanxion;

import java.util.Scanner;

public class Calculator {
	
	public static final int QUIT = 0;
	public static final int ADDITION = 1;
	public static final int SUBTRACTION = 2;
	public static final int MULTIPLICATION = 3;	
	public static final int DIVISION = 4;
	public static final int FACTORIAL = 5;
	
	public boolean supports(int requestedOperation) {
		return requestedOperation >= Calculator.ADDITION && requestedOperation <= Calculator.FACTORIAL;
	}
	
	public Calculation performAction(int operation, String name, Scanner keyboard){
		Calculation result = new Calculation();
		switch(operation) {
		case QUIT:
			result.setTextResult("Goodbye, " + name);
			break;
		case ADDITION:
			Addition addition = new Addition();
			result = addition.performOperation(keyboard);
			break;
		case SUBTRACTION:
			Subtraction subtraction = new Subtraction();
			result = subtraction.performOperation(keyboard);
			break;
		case MULTIPLICATION:
			Multiplication multiplication = new Multiplication();
			result = multiplication.performOperation(keyboard);
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
			Factorial factorial = new Factorial();
			factorial.performOperation(keyboard);
			break;
		default:
			result.setTextResult("I'm sorry, I don't undnerstand what '" + operation +"' is.");
		}
		return result;
	}
}
