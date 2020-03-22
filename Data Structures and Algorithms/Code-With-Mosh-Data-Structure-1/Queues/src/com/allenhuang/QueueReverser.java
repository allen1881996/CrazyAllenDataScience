package com.allenhuang;

import java.util.Queue;
import java.util.Stack;

public class QueueReverser {
    private Stack<Integer> stack = new Stack<>();
    public void reverse(Queue<Integer> queue, int k) {
        // 这里要注意的是，k实际上要求就是几个数字
        if (k < 0 || k > queue.size()) throw new IllegalArgumentException();
        int i = 0;
        while (i < k) {
            // [1,2,3,4,5,6]
            // [1,2,3]
            stack.push(queue.remove());
            i++;
        }
        // queue [4,5,6,3,2,1]
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
        for (int z = 0; z < queue.size() - k; z++) {
            queue.add(queue.remove());
        }
    }
}
