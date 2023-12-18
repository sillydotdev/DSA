package Recursion;

public class PowerOfxToN {

    public static int power(int x, int n) {

        if(n == 0) {
            return 1;
        }

        /*
         * The below solution has O(n) time complexity
         */
        // return x * power(x, n-1);


        /*
         * Below is more optimized solution
         */

         //int halfPower = power(x, n/2) * power(x, n/2);   // here we are making same funtion call twice, it still has O(n) time complexity
         int halfPowerSquare = power(x, n/2);               //we can optimize it as in the next approach... as in this line
         int halfPower = halfPowerSquare * halfPowerSquare;
         
         if(n % 2 != 0) {
            halfPower = x * halfPower;
         }

         return halfPower;
    }

    public static void main(String[] args) {
        System.out.println(power(2, 5));
    }
    
}
