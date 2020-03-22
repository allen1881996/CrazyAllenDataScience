package com.allenhuang;

import java.util.Arrays;

public class ArrayQueue {
    // [0,0,0]
    // front = 0，rear = 0
    private int[] arr;
    // 作为field的变量不赋值会采用默认值，这里也就是0
    private int front;
    private int rear;
    private int count;

    public ArrayQueue(int capacity) {
        arr = new int[capacity];
    }

    public void enqueue(int item) {
        // [10, 0, 0]   [10, 12, 0]
        //  f/r          f    r
        if (count == arr.length) {
            throw new IllegalStateException();
        }
        arr[rear] = item;
        rear = (rear + 1) % arr.length;
        count++;
    }

    public int dequeue() {
        var item = arr[front];
        arr[front] = 0;
        front = (front + 1) % arr.length;
        count --;
        return item;
    }

    public int peak(){
        return arr[front];
    }

    public boolean isEmpty() {
        if (count == 0) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if (count == arr.length) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }
}
