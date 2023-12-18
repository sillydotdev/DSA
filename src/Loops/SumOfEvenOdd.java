package Loops;/*
 * Sum of even and odd numbers
 */
import java.util.*;
public class SumOfEvenOdd {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        int choice;
        int evenSum=0;
        int oddSum=0;

        do{

            System.out.println("Enter number:");
            n = sc.nextInt();

            if(n % 2 == 0){
                evenSum += n;
            }
            else{
                oddSum += n;
            }
            System.out.println("Do you want to enter more numbers. Print 1 for yes and 0 for no:");
            choice = sc.nextInt();
        }while(choice ==1);

        System.out.println("Sum of even numbers:"+evenSum);
        System.out.println("Sum of odd numbers:"+oddSum);
        
    }
}
