package Loops;

/*
 * Reverse of a number
 */
public class RevereseNumber {
    public static void main(String args[]){
        int n = 10899789;
        while(n>0){
            int lastDigit = n % 10;
            System.out.print(lastDigit);
            n /= 10;
        }
        System.out.println();
    }
}
