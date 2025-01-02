package Revision;

public class ReverseString {
    public static void reverseString(String str) {
        String newStr = "";
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            newStr = ch + newStr;
        }
        System.out.println(newStr);
    }
    public static void main(String[] args) {
        String str = "abc";
        reverseString(str);
    }
}
