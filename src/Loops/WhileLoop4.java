package Loops;

import java.util.*;
public class WhileLoop4 {
    public static void main(String srgs[]){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int i=1;
        
        System.out.println("Enter the range of natural numbers:");
        int n = sc.nextInt();

        while(i<=n){
            //sum = sum+i;
            sum += i;
            i++;
        }
        System.out.println("Sum= "+sum);
    }

    
}
