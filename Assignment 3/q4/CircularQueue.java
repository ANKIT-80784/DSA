package q4;
public class CircularQueue {
    private int arr[];
    private int front, rear, count;
    private final int SIZE;

    public CircularQueue(int size) {
        SIZE = size;
        arr = new int[SIZE];
        front = rear = count = 0;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot push " + value);
            return;
        }

        arr[rear] = value;
        rear = (rear + 1) % SIZE;
        count++;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot pop.");
            return -1;
        }

        int value = arr[front];
        front = (front + 1) % SIZE;
        count--;
        return value;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot peek.");
            return -1;
        }

        return arr[front];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == SIZE;
    }

    public int size() {
        return count;
    }
}
