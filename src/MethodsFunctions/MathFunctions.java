package MethodsFunctions;/*
 * Math functions
 */
import java.util.Scanner;

public class MathFunctions {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        double a = sc.nextDouble();

        System.out.println("Enter second number:");
        double b = sc.nextDouble();

        System.out.println("Max of two numbers is: "+Math.max(a, b));
        System.out.println("Min of two numbers is: "+Math.min(a, b));
        System.out.println("Square root of "+a+" is: "+Math.sqrt(a));
        System.out.println("Power of 'a' to the 'b' is: "+Math.pow(a, b));
        System.out.println("Absolute value of 'a' is: "+Math.abs(a));




    }
    
}
