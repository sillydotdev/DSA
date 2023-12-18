package ConditionalStatements;

import java.util.*;
public class SwitchOne {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        switch(num){
            case 1: System.out.println("Samosa...");
            break;

            case 2: System.out.println("Burger...");
            break;

            case 3: System.out.println("Mango shake...");
            break;

            default: System.out.println("Water...");

        }
    }
    
}
