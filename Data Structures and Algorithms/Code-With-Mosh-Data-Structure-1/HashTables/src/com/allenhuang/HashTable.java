package com.allenhuang;

import java.util.LinkedList;

public class HashTable {
    // put(key,value)
    // get(key) return value
    // remove(k) remove the value
    // k:int value: String
    // Chaining
    // What kind of array we need: LinkedList<Entry>[]
    // Entry: private method wrap key value pair, has two fields
    private class Entry {
        private int key;
        private String value;

        public Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }
    // slots is an array, each cell is a linkedList
    private LinkedList<Entry>[] arr;
    private int capacity;

    public HashTable(int capacity) {
        arr = new LinkedList[capacity];
        this.capacity = capacity;
    }

    public void put(int k, String v) {
        var en = getEntry(k);
        if (en != null) {
            en.value = v;
            return;
        }
        var bucket = getOrCreateBucket(k);
        // insert our key-value pair into the bucket
        bucket.addLast(new Entry(k,v));
    }

    public String get(int k) {
        var en = getEntry(k);
        return (en == null) ? null : en.value;
    }

    public void remove(int k) {
        var en = getEntry(k);
        if (en == null) throw new IllegalStateException();
        getBucket(k).remove(en);
    }

    private int hash(int key) {
        var absKey = Math.abs(key);
        return absKey % capacity;
    }

    private Entry getEntry(int key) {
        var bucket = getBucket(key);
        if (bucket != null) {
            for (var en : bucket) {
                if (en.key == key) return en;
            }
        }
        return null;
    }

    private LinkedList<Entry> getBucket(int key) {
        var index = hash(key);
        var bucket = arr[index];
        return bucket;
    }

    private LinkedList<Entry> getOrCreateBucket(int key) {
        var index = hash(key);
        if (arr[index] == null) {
            arr[index] = new LinkedList<>();
        }
        var bucket = arr[index];
        return bucket;
    }


}
