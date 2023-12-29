package Stacks;

import java.util.Stack;

public class PalindromeLinkedListUsingStack {
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;

    public static boolean isPalindrome(Node head) {
        Node temp = head;
        boolean isPalindrome = true;
        Stack<Integer> s = new Stack<>();
        while (temp != null) {
            s.push(temp.data);
            temp = temp.next;
        }
        while (head != null) {
            int i = s.pop();
            if(head.data == i) {
                isPalindrome = true;
            } else {
                isPalindrome = false;
                break;
            }
            head = head.next;
        }
        return isPalindrome;
    }

    public static void main(String[] args) {
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(21);
        Node five = new Node(1);

        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;

        System.out.println(isPalindrome(one));

    }
}
