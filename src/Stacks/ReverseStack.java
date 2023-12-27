package Stacks;

import java.util.Stack;

public class ReverseStack {

    public static void pustAtBottom(Stack<Integer> stack, int data) {
        if(stack.isEmpty()) {
            stack.push(data);
            return;
        }
        int top = stack.pop();
        pustAtBottom(stack, data);
        stack.push(top);
    }
    public static void reverseStack(Stack<Integer> stack) {
        if(stack.isEmpty()) {
            return;
        }
        int top = stack.pop();  // pop top
        reverseStack(stack);    // keep popping until empty
        pustAtBottom(stack, top);   // keep pushing back but at the bottom
    }

    public static void printStack(Stack<Integer> stack) {
        while (!stack.isEmpty()) {
            System.out.print(stack.pop()+" ");
        }
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        reverseStack(stack);
        printStack(stack);
    }
}
