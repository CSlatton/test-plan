package com.xpanxion;

public class BinaryOperation {

	private String operation;
	
	public BinaryOperation(String op) {
		operation = op;
	}
	
	public Calculation successfulCalculation(int leftHandSide, int rightHandSide,int result) {
		Calculation calculation = new Calculation();
		calculation.setTextResult("	" + leftHandSide + " " + operation + " " + rightHandSide + " = " + result);
		return calculation;
	}
	
}
