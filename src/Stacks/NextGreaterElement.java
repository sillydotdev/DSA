package Stacks;

import java.util.Stack;

public class NextGreaterElement {
    public static void nextGreaterElment(int arr[], int nextGreater[]) {
        Stack<Integer> stack = new Stack<>();
        for (int i = arr.length-1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {   // whilst stack is not empty and peek is less than the element
                stack.pop();                                            // pop rom the stack
            }
            if (stack.isEmpty()) {      // if there is no next greater
                nextGreater[i] = -1;
            } else {
                nextGreater[i] = arr[stack.peek()];     // if there is a next greater
            }
            stack.push(i);      // push into stack
        }
    }
    public static void main(String[] args) {
        int arr[] = {6, 8, 0, 1, 3};
        int nextGreater[] = new int[arr.length];

        nextGreaterElment(arr, nextGreater);
        for (int i = 0; i < nextGreater.length; i++) {
            System.out.print(nextGreater[i]+" ");
        }
        System.out.println();
    }
}
