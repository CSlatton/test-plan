package com.xpanxion;

import java.util.Scanner;

public class Division extends BinaryOperation{
	public Division(){
		super("/");
	}
	public Calculation performOperation(Scanner keyboard){
	
	int dividend = keyboard.nextInt();
	int divisor = keyboard.nextInt();
	Calculation result = new Calculation();
	if(isValid(dividend,divisor) == false ) {
		result.setTextResult("I'm sorry, but you cannot divide by zero.");
	}
	else{
		int quotient = calculate(dividend,divisor);
		System.out.println("");
		result = successfulCalculation(dividend, divisor, quotient);
		}
	return result;
	}
	
	protected int calculate(int dividend, int divisor) {
		return dividend / divisor;
	}
	@Override
	protected boolean isValid(int dividend, int divisor) {
		return divisor !=0;
	}
	
}
