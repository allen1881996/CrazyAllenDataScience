package com.allenhuang;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
    	// Stack 堆
	    Stack<Integer> stack1 = new Stack<>();
	    stack1.push(1);
	    stack1.push(2);
	    stack1.push(3);
        System.out.println(stack1);
        var top = stack1.pop();
		System.out.println(top);
		System.out.println(stack1);
		System.out.println(stack1.empty());
		System.out.println(stack1.peek());
		stack1.search(2); // seldomly use this method, stack is nit designed for lookup

		// 1. dealing with "Going back", "Doing sth in reverse order"
		// reverse a string
		var stringrever = new StringReverser();
		var result = stringrever.reverse("ainiwo");
		System.out.println(result);
		// Balance Expressions "(1 + 2" , not balance
		// "(([1] + <2>)) [a]"
		var checker = new BalanceChecker();
		var checkResult = checker.isBalance("{((1 + 2))}>");
		System.out.println(checkResult);


    }
}
