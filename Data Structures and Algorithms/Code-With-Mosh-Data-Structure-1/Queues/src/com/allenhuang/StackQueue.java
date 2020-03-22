package com.allenhuang;

import java.util.Stack;

public class StackQueue {
    // 10，20，30，40
    private Stack<Integer> stack;
    private Stack<Integer> stack2 = new Stack<>();

    public StackQueue() {
        stack = new Stack<>();
    }

    public void enqueue(int item) {
        stack.push(item);
    }

    public int dequeue() {
        // only if stack2 is empty, we remove value from stack1 to stack2
        if (stack.isEmpty() && stack2.isEmpty()) {
            throw new IllegalStateException();
        }
        moveStack1ToStack2();
        return stack2.pop();
    }

    public boolean isEmpty() {
        if (stack.isEmpty() && stack2.isEmpty()) return true;
        else return false;
    }

    public int peek() {
        if (stack.isEmpty() && stack2.isEmpty()) {
            throw new IllegalStateException();
        }
        moveStack1ToStack2();
        return stack2.peek();
    }

    private void moveStack1ToStack2() {
        if (stack2.isEmpty()) {
            while (!stack.isEmpty()) {
                stack2.push(stack.pop());
            }
        }
    }

    @Override
    public String toString(){
        return stack2.toString();
    }


}
