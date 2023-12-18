package ConditionalStatements;

import java.util.*;
public class BasicSix {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number:");
        int a = sc.nextInt();

        if(a>0){
            System.out.println("Number is positive....");
        }
        else if(a<0){
            System.out.println("Number us negative...");
        }
        else{
            System.out.println("Number is 0...");
        }
      
    }
    
}
