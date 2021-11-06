package com.company;

import java.util.ArrayList;
import java.util.Stack;

class MinStack{
    Stack<Integer> elementHolder = new Stack<>();
    public MinStack()
    {

    }

    public boolean push(int val)
    {
        elementHolder.add(val);
        return true;
    }

    public boolean pop()
    {
        elementHolder.pop();
        return true;
    }

    public int top()
    {
        return elementHolder.peek();
    }

    public int getMin()
    {
        int min= Integer.MAX_VALUE;
        for(int element : elementHolder)
            min = Math.min(element,min);

        return min;
    }
}
public class Main extends MinStack{

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        System.out.println(minStack.push(-2));
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
        System.out.println(minStack.push(0));
        System.out.println(minStack.pop());
        System.out.println(minStack.push(-3));
        System.out.println(minStack.getMin());
    }
}
