package q2;

public class Stack1 {
	private int arr[];
	private int top;
	private final int SIZE;
	public Stack1(int size) {
		SIZE = size;
		arr = new int[SIZE];
		top = SIZE;
	}
	
	public void push(int value) {
		//a. reposition top
		top--;
		//b. add value at top index
		arr[top] = value;
	}
	
	public int pop() {
		//a. reposition top
		return arr[top++];
	}
	
	public int peek() {
		//a. read/return value of top index
		return arr[top];
	}
	
	public boolean isEmpty() {
		return top == SIZE;
	}
	
	public boolean isFull() {
		return top == 0;
	}

}












