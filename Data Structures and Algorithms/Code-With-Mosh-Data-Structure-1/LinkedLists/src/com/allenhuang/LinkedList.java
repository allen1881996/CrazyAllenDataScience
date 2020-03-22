package com.allenhuang;

import java.util.NoSuchElementException;

public class LinkedList {
    // head and tail
    private Node first;
    private Node last;
    private int size;

    // the Node class is internel of LinkedList, and it's implementation detail
    public class Node {
        private int value;
        // keep the reference to the next node
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    // addLast
    public void addLast(int item) {
        var node = new Node(item);
        // if the LinkedList do not have any nodes
        if (isEmpty()) {
            first = last = node;
        }
        // our list have at list one node
        else {
            // link the last node to this new node
            last.next = node;
            last = node;
        }
        size++;
    }
    // addFirst
    public void addFirst(int item) {
        var node = new Node(item);
        if (isEmpty()) {
            first = last = node;
        }
        else {
            node.next = first;
            first = node;
        }
        size++;
    }

    private boolean isEmpty() {
        return first == null;
    }

    // deleteFirst
    public void removeFirst() {
        // [10 -> 20 -> 30]
        // first -> 10, we want first -> 20
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        if (first == last) {
            first = last = null;
            size = 0;
            return;
        }
        Node second = first.next; // second -> 20
        first.next = null; // remove the link
        first = second;
        size--;
    }
    // deleteLast
    public void removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        if (first == last) {
            first = last = null;
            size = 0;
            return;}
        var previous = getPrevious(last);
        previous.next = null;
        last = previous;
        size--;
    }

    private Node getPrevious(Node node) {
        var current = first;
        while (current != null) {
            if (current.next == node) {
                return current;
            }
            else {
                current = current.next;
            }
        }
        return null;
    }
    // contains
    public boolean contains(int item) {
        return indexOf(item) != -1;
    }
    // indexOf
    public int indexOf(int item) {
        int index = 0;
        var current = first;
        // as long as we have not reach the end
        while (current != null) {
            if (current.value == item) {
                return index;
            } else {
                current = current.next;
                index++;
            }
        }
        return -1;
    }

    // get the number of items
    public int size() {
        return size;
    }

    // convert this list to a array
    public int[] toArray() {
        int[] arr = new int[size];
        var current = first;
        var index = 0;
        while (current != null) {
            arr[index] = current.value;
            index++;
            current = current.next;
        }
        return arr;
    }

    public void reverse() {
        // 1 2 3 4
        // 4 3 2 1
        var i = first;
        var j = last;
        if (size % 2 == 0) {
            while (i != getPrevious(j)) {
                var k = i.value;
                i.value = j.value;
                j.value = k;
                i = i.next;
                j = getPrevious(j);
            }
            var k = i.value;
            i.value = j.value;
            j.value = k;
        }
        // 1 2 3 4 5
        // 5 4 3 2 1
        else {
            while (i.next != getPrevious(j)) {
                var k = i.value;
                i.value = j.value;
                j.value = k;
                i = i.next;
                j = getPrevious(j);
            }
            var k = i.value;
            i.value = j.value;
            j.value = k;
        }
    }

    // change the direction of pointer
    // [1->2->3]
    // [1<-2<-3]
    public void reverse2() {
        if (isEmpty()) {
            return;
        }
        var previous = first;
        var current = first.next;
        while(current != null) {
            var next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        last = first;
        last.next = null;
        first = previous;
    }

    /* Find the Kth node from the end of
    a linked list in one pass
     */
    // [10->20->30->40->50->60]
    //               #       #    distance = K-1
    public int getKthFromTheEnd(int k) {
        if (isEmpty()) {
            throw new IllegalStateException();
        }
        var i = first;
        var g = i.next;
        for (int c = 1;c < k;c++) {
            g = g.next;
            if(g == null) {
                throw new IllegalArgumentException();
            }
        }
        var j = g;
        while (j != null) {
            i = i.next;
            j = j.next;
        }
        return i.value;
    }

    public void printMiddle() {
        var i = first;
        var j = last;
        // 1 2 3 4 5 6
        if(size % 2 == 0) {
            while (i.next != j) {
                i = i.next;
                j = getPrevious(j);
            }
            System.out.println("The Middle Point is: " + i.value + " And " + j.value );
        }
        else {
            // 1 2 3 4 5
            while (i != j) {
                i = i.next;
                j = getPrevious(j);
            }
            System.out.println("The Middle Point is: " + i.value);
        }

    }

    public boolean hasLoop() {
        var fast = first;
        var slow = first;
        while (true) {
            if(fast != slow) {
                slow = slow.next;
                fast = fast.next.next;

            }
            else {
                break;
            }
        }
        return true;
    }


}
