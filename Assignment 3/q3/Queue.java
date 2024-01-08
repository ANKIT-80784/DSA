package q3;


public class Queue {
	private int arr[];
	private int rear, front;
	private final int SIZE;
	public Queue(int size) {
		SIZE = size;
		arr = new int[SIZE];
		front = rear = 0;
	}
	
	public void push(int value) {
		//1. reposition rear
		arr[rear] = value;
		rear++;
		//2. add value at rear index
	}
	
	public int pop() {
		//1. read and return data of front+1 index
		int value = arr[front];
		//increment front
		front++;
		return value;		
	}
	
	public int peek() {
		// read and return data of front + 1 index
		return arr[front];
	}
	
	public boolean isEmpty() {
		return front == rear;
	}
	
	public boolean isFull() {
		return rear == SIZE-1;
	}

}

















