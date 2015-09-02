package com.xpanxion;

public class Multiplication extends BinaryOperation {
	public Multiplication(){
		super("*");
	}

	protected int calculate(int multiplier, int multiplicand) {
		
		return multiplier * multiplicand;
	}


	protected boolean isValid(int multiplier, int multiplicand) {
		return true;
	}
}
