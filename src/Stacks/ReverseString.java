package Stacks;

import java.util.Stack;

public class ReverseString {
    public static String reverseString(String str) {
        Stack<Character> stack = new Stack<>();
        for (int index = 0; index < str.length(); index++) {
            stack.push(str.charAt(index));
        }

        StringBuilder result = new StringBuilder("");
        while (!stack.isEmpty()) {
            char curr = stack.pop();
            result.append(curr);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String str = "kamran";
        String result = reverseString(str);
        System.out.println(result);
    }
}
