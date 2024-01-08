package q1;

public class List {
	public class Node {
		private int data;
		private Node next;

		public Node(int value) {
			data = value;
			next = null;
		}

	}
	private Node head;
	private Node tail;
	
	public boolean isEmpty() {
		return head == null && tail == null;
	}
	
	public void display() {
		Node trav = head;
		System.out.print("List : ");
		while(trav != null) {
			System.out.print(" " + trav.data);
			trav = trav.next;
		}
	}
	
	// Add first using head
	public void addFirst(int value) {
		Node newNode = new Node(value);
		if(isEmpty())
			head = tail = newNode;
		else {
			newNode.next = head;
			head = newNode;
		}
	}
	
	// Add Last using tail
	public void addLast(int value) {
		Node newNode = new Node(value);
		if(isEmpty()) {
			head = tail = newNode;
		}
		else {
			tail.next = newNode;
			tail = newNode;
		}
	}
	
	// DeleteFirst
	
	public void delFirst() {

		if (isEmpty()) {
			return;

		} else {
			head = head.next;
		}
	}
	
	
	// Delete Last
	public void delLast() {
		if(isEmpty()) {
			return;
		}else {
			Node trav = head;
			while(trav.next.next != null) {
				trav = trav.next;
			}
			trav.next = null;
			tail = trav;
		}
	}
}






