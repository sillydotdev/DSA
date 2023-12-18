package Loops;

import java.util.*;
public class WhileLoop3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int i = 1;

        System.out.println("Enter the range:");
        int range = sc.nextInt();

        while(i<=range){
            System.out.println(i);
            i++;
        }
    }
    
}
