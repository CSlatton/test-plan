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
		Operation op = null;
		Calculation result = new Calculation();
		switch(operation) {
		case QUIT:
			result.setTextResult("Goodbye, " + name);
			break;
		case ADDITION:
			op = new Addition();
		//	result = op.performOperation(keyboard);
			break;
		case SUBTRACTION:
			op = new Subtraction();
		//	result = op.performOperation(keyboard);
			break;
		case MULTIPLICATION:
			op = new Multiplication();
		//	result = op.performOperation(keyboard);
			break;
		case DIVISION:
			op = new Division();
		//	result = op.performOperation(keyboard);
			break;
		case FACTORIAL:
			op = new Factorial();
			//op.performOperation(keyboard);
			break;
		default:
			result.setTextResult("I'm sorry, I don't undnerstand what '" + operation +"' is.");
		}
		if(op != null){
			result = op.performOperation(keyboard);
		}
		return result;
	}
}
