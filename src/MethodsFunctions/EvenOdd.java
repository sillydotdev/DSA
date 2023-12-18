package MethodsFunctions;/*
 * Even or odd
 */
import java.util.Scanner;

public class EvenOdd {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if(checkEvenOdd(num)){
            System.out.println("Even...");
        }
        else{
            System.out.println("Odd...");
        }

    }
    
    public static boolean checkEvenOdd(int n){
        int num = n;
        if(num % 2 == 0){
            return true;
        }
        return false;
    } 
    
}
