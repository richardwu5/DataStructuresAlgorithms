import java.util.EmptyStackException;

public class MyQueue {
    private MyArrayList queue;
    private int front;
    private int back;

    MyQueue() {
        front = 0;
        back = 0;
        queue = new MyArrayList();
    }

    public void enQueue(int x) {
        queue.add(x);
        back++;
    }

    public int deQueue() {
        if (isEmpty()) {
            System.out.println("The queue is currently empty.");
            throw new EmptyStackException();
        }
        int value = queue.get(front);
        front++;
        return value;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("The queue is currently empty.");
            throw new EmptyStackException();
        }
        return queue.get(front);
    }

    public boolean isEmpty() {
        return front == back ? true : false;
    }
}
