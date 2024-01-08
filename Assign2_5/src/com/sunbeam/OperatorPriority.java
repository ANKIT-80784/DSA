package com.sunbeam;

public class OperatorPriority {
	public static int getPriority(String opt)
	{
		switch (opt) {
		case "+":
		case "-":
			return 1;
			
		case "*":
		case "/":
			return 2;
			
		case "^":
			return 3;

		default:
			return 0; // for Unknown Operators.
		}
	}
	
	public static void main(String[] args) {
		String op1 = "+";
		String op2 = "*";
		String op3 = "^";
		
		System.out.println("Priority of "+op1+": "+getPriority(op1));
		System.out.println("Priority of "+op2+": "+getPriority(op2));
		System.out.println("Priority of "+op3+": "+getPriority(op3));
		
		
		
	}
}
