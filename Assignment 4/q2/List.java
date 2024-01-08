package q2;

public class List {
	public class Node {
		private int data;
		private Node next;

		public Node(int value) {
			data = value;
			next = null;
		}

		public int getData() {
			return data;
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
			System.out.print(" " + trav.getData());
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
	
	public void addAfter(Node newNode, Node prevNode) {
        if (prevNode == null) {
            System.out.println("Previous node cannot be null.");
            return;
        }

        newNode.next = prevNode.next;
        prevNode.next = newNode;

        if (prevNode == tail) {
            tail = newNode;
        }
    }

	void addBefore(Node newNode, Node nextNode) {
	    if (nextNode == null) {
	        System.out.println("Next node cannot be null.");
	        return;
	    }

	    Node prevNode = findPreviousNode(nextNode);

	    if (nextNode == head) {
	        newNode.next = head;
	        head = newNode;
	        if (head.next == null) {
	            tail = head;
	        }
	    } else {
	        newNode.next = nextNode;
	        prevNode.next = newNode;
	    }
	}
    
    private Node findPreviousNode(Node node) {
        Node trav = head;

        while (trav != null && trav.next != node) {
            trav = trav.next;
        }

        return trav;
    }
    
    public Node findNode(int value) {
        Node trav = head;

        while (trav != null && trav.getData() != value) {
            trav = trav.next;
        }

        return trav;
    }
	
	
}






