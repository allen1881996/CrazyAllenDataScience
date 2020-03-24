package com.allenhuang;

public class JumpSearch {
    public int search(int[] arr, int target) {
        double blockSize = Math.sqrt(arr.length);
        int start = 0;
        int next = start + (int)blockSize;
        while (arr[next - 1] < target) {
            start = next;
            if (start >= arr.length) break;
            next = start + (int)blockSize;
            // 如果next指针超了，就要保证它缩到length这个位置
            if (next >= arr.length) next = arr.length;
        }
        for (int i = start; i < next; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }
}
