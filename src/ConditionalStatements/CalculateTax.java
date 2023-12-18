package ConditionalStatements;

import java.util.*;
public class CalculateTax {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your income:");
        double income = sc.nextDouble();
        double tax;

        if(income < 500000){
            System.out.println("You are not eligible for tax...");
        }
        else if(income >= 500000 && income < 100000){
            tax = (income)*20/100;
            System.out.println("Your tax is: "+tax);
        }
        else{
            tax = (income)*30/100;
            System.out.println("Your tax is: "+tax);

        }
    }
    
}
