import java.util.EmptyStackException;

public class MyStack {
    private MyArrayList stack;
    private int ptr;

    MyStack() {
        ptr = 0;
        stack = new MyArrayList();
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("The stack is currently empty.");
            throw new EmptyStackException();
        } else {
            ptr--;
            int value = stack.get(ptr);
            return value;
        }
    }

    public void push(int x) {
        stack.add(ptr, x);
        ptr++;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("The stack is currently empty.");
            throw new EmptyStackException();
        } else {
            int value = stack.get(ptr-1);
            return value;
        }
    }

    public boolean isEmpty() {
        return (ptr == 0);
    }

    public int size() {
        return ptr;
    }
}
