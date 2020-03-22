package com.allenhuang;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        // Queue is an interface, we can use ArrayDeque or LinkedList to perform a func like Queue
        // Queue is the interface/ contract, and ArrayDeque is the implementation
        Queue<Integer> queue = new ArrayDeque<>();
        // Enqueue: add & offer
        // add: if full, throw an exception, offer will
        queue.add(10);
        queue.add(12);
        queue.add(13);
        System.out.println("Size:" + queue.size());
        System.out.println(queue);
        // Dequeue: remove & poll
        // remove: throw exception if empty
        System.out.println("After remove the front");
        var front = queue.remove();
        System.out.println(queue);
        // peek and element
        // peek: return None if empty, element will throw exception

        // reverse the queue
        System.out.println("Reverse the queue");
        reverse(queue);

        System.out.println("----My ArrayQueue----");
        ArrayQueue q = new ArrayQueue(5);
        q.enqueue(10);
        q.enqueue(12);
        q.enqueue(15);
        System.out.println("Origin Queue:" + q);
        q.dequeue();
        System.out.println("After 1st Dequeue:" + q);
        q.enqueue(13);
        q.enqueue(19);
        q.enqueue(21);
        System.out.println("After add 3 new items:" + q);

        System.out.println("----My StackQueue----");
        StackQueue sq = new StackQueue();
        sq.enqueue(10);
        sq.enqueue(20);
        sq.enqueue(30);
        System.out.println(sq.dequeue());
        System.out.println(sq.dequeue());
        System.out.println(sq.dequeue());

        System.out.println("----Priority Queue----");
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // by default, small number will come out first
        pq.add(1);
        pq.add(10);
        pq.add(12);
        pq.add(2);
        while (!pq.isEmpty()) {
            System.out.println(pq.remove());
        }

        System.out.println("----My Priority Queue----");
        com.allenhuang.PriorityQueue myPri = new com.allenhuang.PriorityQueue(5);
        myPri.add(1);
        myPri.add(12);
        myPri.add(3);
        myPri.add(10);
        myPri.add(2);
        myPri.add(2);
        System.out.println(myPri);
        while (!myPri.isEmpty()) {
            System.out.println(myPri.remove());
        }

        System.out.println("----Queue Reverser----");
        Queue<Integer> queue2 = new ArrayDeque<>();
        queue2.add(1);
        queue2.add(2);
        queue2.add(3);
        queue2.add(10);
        queue2.add(4);
        QueueReverser reverser2 = new QueueReverser();
        reverser2.reverse(queue2,3);
        System.out.println(queue2);

        System.out.println("----LinkedList Queue----");
        LinkedListQueue listQueue = new LinkedListQueue();
        listQueue.enqueue(10);
        listQueue.enqueue(12);
        listQueue.enqueue(13);
        System.out.println(listQueue);
        System.out.println(listQueue.size());
        System.out.println(listQueue.isEmpty());
        System.out.println(listQueue.peek());
        listQueue.dequeue();
        System.out.println(listQueue);

        System.out.println("----Stack with two Queues----");
        StackWithTwoQueues s = new StackWithTwoQueues();
        s.push(10);
        s.push(20);
        s.push(100);
        System.out.println(s.isEmpty());
        System.out.println(s.size());
        System.out.println(s);
        System.out.println(s.peek());
        s.pop();
        System.out.println(s);
    }

    public static void reverse(Queue<Integer> queue){
        // add, remove, isEmpty
        // do something about reverse? use stack
        if(queue.isEmpty()) throw new IllegalStateException();
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty()) {
            stack.add(queue.remove());
        }
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
        System.out.println(queue);
    }
}
