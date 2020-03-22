package com.allenhuang;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListQueue {
    LinkedList<Integer> list = new LinkedList<>();
    public void enqueue(int item) {
        list.addLast(item);
    }

    public int dequeue() {
        return list.removeFirst();
    }

    public int peek() {
        return list.peek();
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public String toString() {
        return Arrays.toString(list.toArray());
    }
}
