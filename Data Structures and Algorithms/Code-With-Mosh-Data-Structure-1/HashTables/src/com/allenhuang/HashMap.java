package com.allenhuang;

public class HashMap {
    // build an HashMap from scratch and use linear probing
    private class Entry {
        private int key;
        private String value;

        public Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }
        @Override
        public String toString() {
            return value;
        }
    }
    private Entry[] map;
    private int capacity;
    private int count;

    public HashMap(int capacity) {
        this.capacity = capacity;
        map = new Entry[capacity];
    }

    public void put(int key, String value) {
        // 实际上entry就是map[index]
        var entry = getEntry(key);
        if (entry != null) {
            entry.value = value;
            return;
        }

        if (isFull())
            throw new IllegalStateException();

        map[getIndex(key)] = new Entry(key, value);
        count++;
    }

    public String get(int key) {
        var entry = getEntry(key);
        return entry != null ? entry.value : null;
    }

    public void remove(int key) {
        var index = getIndex(key);
        if (index == -1 || map[index] == null)
            return;

        map[index] = null;
        count--;
    }

    private int hash(int key) {
        return key % capacity;
    }
    private boolean isFull(){
        return count == capacity;
    }

    private Entry getEntry(int key) {
        var index = getIndex(key);
        return index >= 0 ? map[index] : null;
    }

    private int getIndex(int key) {
        int steps = 0;

        // Linear probing algorithm: we keep looking until we find an empty
        // slot or a slot with the same key.

        // We use this loop conditional to prevent an infinite loop that
        // will happen if the array is full and we keep probing with no
        // success. So, the number of steps (or probing attempts) should
        // be less than the size of our table.
        while (steps < capacity) {
            int index = index(key, steps++);
            var entry = map[index];
            if (entry == null || entry.key == key)
                return index;
        }

        // This will happen if we looked at every slot in the array
        // and couldn't find a place for this key. That basically means
        // the table is full.
        return -1;
    }
    private int index(int key, int i) {
        return (hash(key) + i) % capacity;
    }

}
