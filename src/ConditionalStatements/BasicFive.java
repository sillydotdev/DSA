package ConditionalStatements;

import java.util.*;
public class BasicFive {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the temperature: ");
        double temperature = sc.nextDouble();

        if(temperature>100){
            System.out.println("You have fever....");
        }
        else{
            System.out.println("You do not have fever...");
        }
      
    }
    
}
