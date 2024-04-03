package Lab5;

import java.util.Stack;

import java.util.Stack;

import java.util.Stack;

public class Lab5 {
    public static void main(String[] args) {
       System.out.println(check("({[]}())"));
    }
    public static boolean check(String a){
        Stack<Character> stack = new Stack<>();

        for (char ch : a.toCharArray()) {
            if (ch == '(') {
                stack.push(')');
            } else if (ch == '[') {
                stack.push(']');
            } else if (ch == '{') {
                stack.push('}');
            } else {
                if (stack.peek() == ch) {
                    stack.pop();
                } else if (stack.isEmpty()) {
                    return true;
                }
            }
        }
        if (stack.isEmpty() == true){
            return true;
        }
        return false;
    }
}