package com.xpanxion;



public class Addition extends BinaryOperation {
	public Addition(){
		super("+");
	}
	
	protected int calculate(int addend, int augend) {
		return addend + augend;
	}
	
	protected boolean isValid(int addend, int augend){
		return true;
	}

}
