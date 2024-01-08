package com.sunbeam;

public class DescendingStack {
	
	private static final int SIZE = 10;
	private int[] stackArray;
	private int top;
	
	public DescendingStack()
	{
		stackArray = new int[SIZE];
		top=SIZE-1; // Initialize top at the end of the array.
	}
	
	private void push(int value) {

		if (top>=0) {
			stackArray[top--]=value;
			System.out.println("Pushed : "+value);
		}
		else
		{
			System.out.println("Stack Overflow, cannot Push "+value);
		}
	}
	private void pop() {
		if (top < SIZE-1) {
			int poppedValue = stackArray[++top];
			System.out.println("Popped : "+poppedValue);
		}
		else
		{
			System.out.println("Stack Underflow, Stack is empty..");
		}

	}
	private void display() {

		if (top < SIZE-1) {
			System.out.println("Stack element from top to bottom: ");
			for (int i = top+1; i < SIZE; i++) {
				System.out.println(stackArray[i]);
			}
		}
		else
		{
			System.out.println("Stack is Empty...");
		}
	}
	public static void main(String[] args) {
		DescendingStack ds = new DescendingStack();
		ds.push(20);
		ds.push(15);
		ds.push(10);
		ds.push(5);
		
		ds.pop();
		
		ds.display();
		
	}

}
