package org.example;

import java.util.Stack;

public class WorkingWithStacks {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(4);
        stack.push(2);
        stack.push(3);
        System.out.println("stackdigi eng oxirgi elem: " + stack.peek());
        System.out.println("oxirgi elem o'chrldi: " + stack.pop());
        System.out.println("stackdigi eng oxirgi elem: " + stack.peek());
        System.out.println("stack xajmi: " + stack.size());
        System.out.println("stack bo'shmi: " + stack.empty());

    }
}
