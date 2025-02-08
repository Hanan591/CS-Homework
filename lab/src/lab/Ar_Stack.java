package lab;

import java.util.Arrays;

public class Ar_Stack<T> {
    public static final int MAXSIZE = 10; 
    private int top; 
    private T[] stackItems; 

    @SuppressWarnings("unchecked")
    public Ar_Stack() {
        top = -1; // Initialize top
        stackItems = (T[]) new Object[MAXSIZE]; 
    }

    public boolean isEmpty() {
        return top == -1; 
        
    }
    
    //System.out.println("I will be able to learn how to code succuesfully and be proud of myself");
    
    public boolean isFull() {
        return top == MAXSIZE - 1;
    }

    public void push(T item) {
        if (isFull()) {
            throw new RuntimeException("Stack is full. Cannot push " + item);
        }
        stackItems[++top] = item; 
    }

    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty. Cannot pop.");
        }
        return stackItems[top--]; 
    }

    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty. Cannot peek.");
        }
        return stackItems[top]; 
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(stackItems, top + 1)); 
    }
}
