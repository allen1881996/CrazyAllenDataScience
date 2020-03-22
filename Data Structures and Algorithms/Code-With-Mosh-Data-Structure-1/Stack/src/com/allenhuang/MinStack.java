package com.allenhuang;

public class MinStack {
    private Stack stack = new Stack();
    private Stack min = new Stack();

    public void push(int item) {
        // firstly we just normally push the item in a stack
        stack.push(item);
        // but we also need to check and store if it is the minimum
        if(min.isEmpty()) {
            min.push(item);
        }
        else if(item < min.peek()) {
            min.push(item);
        }

//        public int pop(){
//            if(stack.isEmpty()) throw new IllegalStateException();
//            var top = stack.pop();
//            if(min.peek() == top) {
//                min.pop();
//            }
//            return top;
//
//        }
    }
    public int pop() {
        if (stack.isEmpty())
            throw new IllegalStateException();

        var top = stack.pop();

        if (min.peek() == top)
            min.pop();

        return top;
    }
}
