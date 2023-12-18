package Strings;//String palindrome or not

public class Palindrome_String {

    public static boolean isPalindrome(String str){
        for(int i=0; i<str.length()/2; i++){
            int n=str.length();
            if(str.charAt(i) != str.charAt(n-i-1)){
                //not palindrome condition
                return false;
            }
        }
        //palindrome condition
        return true;
    }

    public static void main(String args[]){
        String str = "racecar";
        System.out.println(isPalindrome(str));

    }
    
}
