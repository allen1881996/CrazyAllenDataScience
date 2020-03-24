package com.allenhuang;

public class Main {

    public static void main(String[] args) {
        // 4! = 4* 3 * 2 * 1
        System.out.println(factorial(4));
        System.out.println(factorial2(4));

    }

    public static int factorial(int n) {
        var factorial = 1;
        for (int i = n; i > 1; i--) {
            factorial*= i;
        }
        return factorial;
    }

    // 4 * f(3)
    //      3 * f(2)
    //           2 * f(1)
    //                1 * f(0)
    public static int factorial2(int n) {
        // n! = (n-1)!
        if (n == 0) return 1; // base condition
        return n*factorial(n-1);
        //
    }
}
