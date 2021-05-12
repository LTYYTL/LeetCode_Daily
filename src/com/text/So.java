package com.text;

import java.util.Stack;

public class So {

    public int s(String s){
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < s.length(); ++i){
            int c = s.charAt(i) - '0';
            if (!stack.isEmpty() && (10 -stack.peek()) == c){
                stack.pop();
            }else {
                stack.push(c);
            }
        }
        return stack.size();
    }

    public static void main(String[] args) {
        So so = new So();
        System.out.println(so.s("2134314"));
    }
}
