package Stacks;

import java.util.*;

public class StackUsingJavaCollection {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stack);

        while(!stack.isEmpty()) {
            System.out.println("Peek is: "+stack.peek());
            stack.pop();
            System.out.println(stack);
        }
    }

}
