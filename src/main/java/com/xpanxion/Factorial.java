package com.xpanxion;

import java.util.Scanner;

public class Factorial {
	public Calculation performOperation(Scanner keyboard){

		int value = keyboard.nextInt();
		int total = 1;
		
		for(int i = value; i > 0; i--) {
			total *= i;
		}
		Calculation result = new Calculation();
		System.out.println(" " + value + "! = " + total);
		return result;
	}
}
