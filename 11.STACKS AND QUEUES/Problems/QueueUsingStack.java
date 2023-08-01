package Problems;

import java.util.Stack;

// This insert effiecient
public class QueueUsingStack {
    private Stack<Integer> first;
    private Stack<Integer> second;

    public QueueUsingStack() {
        first = new Stack<>();
        second = new Stack<>();
    }

    public void push(int item) {
        first.push(item);
    }

    public int pop() {
        while (!first.isEmpty()) {
            second.push(first.pop());
        }

        int removed = second.pop();

        while (!second.isEmpty()) {
            first.push(second.pop());
        }

        return removed;
    }

    public int peak() {
        while (!first.isEmpty()) {
            second.push(first.pop());
        }

        int peak = second.peek();

        while (!second.isEmpty()) {
            first.push(second.pop());
        }

        return peak;
    }

    public boolean isEmpty() {
        return first.isEmpty();
    }

}

// Remove efficient

class QueueUsingStackR {
    private Stack<Integer> first;
    private Stack<Integer> second;

    public QueueUsingStackR() {
        first = new Stack<>();
        second = new Stack<>();
    }

    public void push(int item) {
        while (!first.isEmpty()) {
            second.push(first.pop());
        }

        first.push(item);

        while (!second.isEmpty()) {
            first.push(second.pop());
        }

    }

    public int pop() {
        return first.pop();
    }

    public int peak() {


        return first.peek();
    }

    public boolean isEmpty() {
        return first.isEmpty();
    }

}