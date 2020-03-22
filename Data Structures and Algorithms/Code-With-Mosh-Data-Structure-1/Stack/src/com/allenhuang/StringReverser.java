package com.allenhuang;
import java.util.Stack;

public class StringReverser {

    public String reverse(String input) {
        Stack<Character> stack = new Stack<>();
        if(input == null){
            throw new IllegalArgumentException();
        }

        for (char ch : input.toCharArray())
            stack.push(ch);
        // dealing with multiple String operations
        StringBuffer reversed = new StringBuffer();

        while (!stack.empty()) {
            reversed.append(stack.pop());
        }
        return reversed.toString();
    }


//    private int length;
//    private String str;
//    private Stack<Character> reverser = new Stack<>();
//
//    public StringReverser(String str) {
//        this.str = str;
//        length = str.length();
//    }
//
//    public char[] reverse() {
//        var reversed = new char[length];
//        for(int i = 0;i<length;i++){
//            reverser.push(str.charAt(i));
//        }
//        for(int i = 0;i<length;i++){
//            reversed[i] = reverser.pop();
//        }
//        return reversed;
//    }


}
