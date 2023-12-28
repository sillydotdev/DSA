package Stacks;

import java.util.Stack;

public class NextSmallerLeft {
    public static void nextSmallerElment(int arr[], int nextSmaller[]) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {   // whilst stack is not empty and peek is less than the element
                stack.pop();                                            // pop rom the stack
            }
            if (stack.isEmpty()) {      // if there is no next greater
                nextSmaller[i] = -1;
            } else {
                nextSmaller[i] = arr[stack.peek()];     // if there is a next greater
            }
            stack.push(i);      // push into stack
        }
    }
    public static void main(String[] args) {
        int arr[] = {6, 8, 0, 1, 3};
        int nextSmaller[] = new int[arr.length];

        nextSmallerElment(arr, nextSmaller);
        for (int i = 0; i < nextSmaller.length; i++) {
            System.out.print(nextSmaller[i]+" ");
        }
        System.out.println();
    }
}
