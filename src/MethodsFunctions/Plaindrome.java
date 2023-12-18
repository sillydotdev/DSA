package MethodsFunctions;/*
 * Palindrome or not
 */
import java.util.Scanner;

public class Plaindrome {

    public static boolean checkPilindrome(int num){
        int palindrome = num;
        int rev = 0;
        while(palindrome > 0){
            int lastDigit = palindrome%10;
            rev = (rev * 10) + lastDigit;
            palindrome /= 10;
        }
        System.out.println(rev);
        
        if(num == rev){
            return true;
        }
        return false;
        
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int palindrome = sc.nextInt();
        if(checkPilindrome(palindrome)){
            System.out.println("Number "+palindrome+" is palindrome...");
        }
        else{
            System.out.println("Number "+palindrome+" is not palindrome...");
        }

    }
    
}
