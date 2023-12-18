package MethodsFunctions;/*
 * Sum of integers of a number
 */
import java.util.*;
public class SumOfDigitsOfNumber {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Sum of integers of "+num+" is: "+addInteger(num));

    }

    public static int addInteger(int n){
        int sum = 0;
        while(n > 0){
            int lastDigit = n % 10;
            sum += lastDigit;
            n /=10; 
        }
        return sum;
    }
    
}
