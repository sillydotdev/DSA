package Loops;/*
 * Reverse of a number
 */
import java.util.*;;
public class Reverse_Number {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to be reversed:");
        int n = sc.nextInt();

        int rev = 0;

        while(n>0){
            int lastDigit = n % 10;
            rev = (rev * 10) + lastDigit;
            n /= 10;
        }
        System.out.print(rev);


    }
    
}
