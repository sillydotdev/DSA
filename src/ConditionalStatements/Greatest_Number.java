package ConditionalStatements;

import java.util.*;
public class Greatest_Number {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("A=");
        int a = sc.nextInt();

        System.out.println("B=");
        int b = sc.nextInt();

        System.out.println("C=");
        int c = sc.nextInt();

        if((a>=b) && (a>=c)){
            System.out.println("A is the greatest...");
        }
        else if(b>=c){
            System.out.println("B is greatest...");
        }
        else{
            System.out.println("C is greatest...");
        }
    }
    
}
