package Stacks;

import java.util.Stack;

public class ValidParanthesis {
    public static boolean validParanthesis(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {  // opening braces and push them to stack
                s.push(ch);
            } else {
                if (s.isEmpty()) {  // if stack is empty, return false because you only have closing brackets
                    return false;
                }
                if ((s.peek() == '(' && ch == ')')      // if for a closing bracket there is an opening of same type at peek of stack,
                    ||(s.peek() == '{' && ch == '}')    // then valid and keep moving and pop the peek
                    ||(s.peek() == '[' && ch == ']')) {
                    s.pop();
                } else {
                    return false;
                }
            }
        }
        if (s.isEmpty()) {      // if finally stack is not empty, that means there are opening braces at the start which do not have a closing bracket
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "({[]})";
        System.out.println(validParanthesis(str));
    }
}
