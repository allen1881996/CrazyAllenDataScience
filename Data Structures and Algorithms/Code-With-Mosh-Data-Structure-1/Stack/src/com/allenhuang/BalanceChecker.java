package com.allenhuang;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class BalanceChecker {

    private final List<Character> leftBracket = Arrays.asList('<', '{', '[', '(');
    private final List<Character> rightBracket = Arrays.asList('>','{',']','(');

    public boolean isBalance(String input) {
        Stack<Character> container = new Stack<>();
        for (char ch : input.toCharArray()) {
            if (isLeftBracket(ch)) {
                container.push(ch);
            }
            else if (isRightBracket(ch)) {
                if (container.empty()){
                    return false;
                }

                var top = container.pop();
                if (bracketMatch(top,ch)) return false;
                }
            }
        return container.empty();
        }

    private boolean isLeftBracket(char ch) {
        return leftBracket.contains(ch);
    }

    private boolean isRightBracket(char ch) {
        return rightBracket.contains(ch);
    }

    private boolean bracketMatch(char left,char right) {
        return leftBracket.indexOf(left) == rightBracket.indexOf(right);
    }
}
