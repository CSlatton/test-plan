package com.xpanxion;

import java.util.Scanner;

public class Addition extends BinaryOperation {
	public Addition(){
		super("+");
	}
	public Calculation performOperation(Scanner keyboard){

		int addend = keyboard.nextInt();
		int augend = keyboard.nextInt();
		
		int sum = addend + augend;
		
		return successfulCalculation(addend,augend,sum);
	}

}
