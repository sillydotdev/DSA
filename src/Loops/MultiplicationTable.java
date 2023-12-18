package Loops;/*
 * Multiplication table
 */
import java.util.*;
public class MultiplicationTable {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int num = sc.nextInt();


        for(int i=1; i<=10; i++){
            System.out.println(num+" * "+i+" = "+num*i);
        }

    }
}
