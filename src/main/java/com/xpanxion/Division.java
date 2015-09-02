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
	if(divisor == 0 ) {
		result.setTextResult("I'm sorry, but you cannot divide by zero.");
	}
	else{
		int quotient = dividend / divisor;
		System.out.println("");
		result = successfulCalculation(dividend, divisor, quotient);
		}
	return result;
	}
	
}
