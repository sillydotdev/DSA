package Stacks;

import java.util.Stack;

public class DuplicateParanthesis {
    public static boolean duplicateParanthesis(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // closing bracket
            if (ch == ')') {                // as soon as we get the closing brace, we will check with the stack
                int count = 0;              // until we find opening brace in the stack, we keep incrementing count variable.
                while (s.peek() != '(') {   // if count < 1, it is duplicate, else not.
                    s.pop();
                    count++;
                }
                if (count < 1) {
                    return true;
                } else {
                    s.pop();    // pop opening pair to continue
                }
            } else {        // opening condition... opening braces, operands and operators will br pushed into tha stack
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "(a+b)";
        String str2 = "((a+b))";
        System.out.println(duplicateParanthesis(str));
        System.out.println(duplicateParanthesis(str2));
    }
}
