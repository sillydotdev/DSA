package Recursion;

public class LengthOfString {

    public static int lengthOfString(String str) {
        if(str.length() == 0) {
            return 0;
        }
        return lengthOfString(str.substring(1)) + 1;
    }
    public static void main(String[] args) {
        String str = "abcd";
        System.out.println(lengthOfString(str));
        
    }
    
}
