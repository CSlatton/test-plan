package com.xpanxion;

import java.util.Scanner;

public abstract class BinaryOperation {

	private String operation;
	
	protected abstract int calculate(int leftHandSide, int rightHandSide);
	protected abstract boolean isValid(int leftHandSide, int rightHandSide);
	
	public BinaryOperation(String op) {
		operation = op;
	}
	
	public Calculation performOperation(Scanner keyboard){

		int leftHandSide = keyboard.nextInt();
		int rightHandSide = keyboard.nextInt();
		
		int result = calculate(leftHandSide, rightHandSide);
		
		return successfulCalculation(leftHandSide,rightHandSide,result);
	}
	
	public Calculation successfulCalculation(int leftHandSide, int rightHandSide,int result) {
		Calculation calculation = new Calculation();
		calculation.setTextResult("	" + leftHandSide + " " + operation + " " + rightHandSide + " = " + result);
		return calculation;
	}
	
}
