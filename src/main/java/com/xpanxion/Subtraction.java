package com.xpanxion;

import java.util.Scanner;

public class Subtraction extends BinaryOperation {
	public Subtraction(){
		super("-");
	}

	public Calculation performOperation(Scanner keyboard){

		int minuend = keyboard.nextInt();
		int subtrahend = keyboard.nextInt();
		int difference = minuend - subtrahend;
		return successfulCalculation(minuend,subtrahend,difference);
	}

	protected int calculate(int minuend, int subtrahend) {
		return minuend - subtrahend;
	}

	
	protected boolean isValid(int minuend, int subtrahend) {
		
		return true;
	}
	
}
