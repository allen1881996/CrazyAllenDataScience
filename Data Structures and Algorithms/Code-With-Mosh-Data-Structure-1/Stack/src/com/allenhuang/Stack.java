package com.allenhuang;

import java.util.Arrays;

public class Stack {
    private int[] arr = new int[5];
    private int count = 0;

    // push
    public void push(int item){
        // stack is full
        if (count == arr.length) throw new StackOverflowError();
        arr[count] = item;
        count++;
    }

    // pop
    public int pop(){
        if (isEmpty()) {
            throw new IllegalStateException();
        }
        count--;
        return arr[count];
    }

    // isEmpty
    public boolean isEmpty() {
        return count == 0;
    }

    // toString
    @Override
    public String toString() {
        var content = Arrays.copyOfRange(arr,0,count);
        return Arrays.toString(content);
    }

    // peak
    public int peek() {
        if(isEmpty()) throw new IllegalStateException();
        return arr[count-1];
    }


}
