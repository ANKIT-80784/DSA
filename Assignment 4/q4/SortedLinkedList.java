package q4;

public class SortedLinkedList {

    private class Node {
        private int data;
        private Node next;

        public Node(int value) {
            data = value;
            next = null;
        }
    }

    private Node head;

    public void insertSorted(int value) {
        Node newNode = new Node(value);

        if (head == null || value <= head.data) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;

            while (current.next != null && value > current.next.data) {
                current = current.next;
            }

            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SortedLinkedList sortedList = new SortedLinkedList();

        sortedList.insertSorted(5);
        sortedList.insertSorted(2);
        sortedList.insertSorted(8);
        sortedList.insertSorted(1);
        sortedList.insertSorted(7);

        System.out.println("Sorted Linked List:");
        sortedList.display();
    }
}
