package ConditionalStatements;/*
 * calculator
 */
import java.util.*;
public class SwitchTwo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number number:");
        int num1 = sc.nextInt();

        System.out.println("Enter second number number:");
        int num2 = sc.nextInt();

        System.err.println("Enter an operation to perform \n (+, -, *, /, %)");
        char op = sc.next().charAt(0);

        switch(op){
            case '+': 
            int sum = num1 + num2;
            System.out.println("Sum is: "+sum);
            break;

            case '-': 
            int sub = num1 - num2;
            System.out.println("Subtraction is: "+sub);
            break;

            case '*': 
            int mul = num1*num2;
            System.out.println("Multiplication is: "+mul);
            break;

            case '/': 
            int div = num1/num2;
            System.out.println("Division is: "+div);
            break;

            case '%': 
            int rem = num1%num2;
            System.out.println("Modulo is: "+rem);
            break;

            default: System.out.println("Wrong operator...");

        }
    }
    
}
