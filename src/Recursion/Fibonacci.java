package Recursion;

public class Fibonacci {

    public static int fibonacci(int n) {

        if(n<=1 /* n == 0 || n == 1 */) {
            return n;
        }
        int fib1 = fibonacci(n-1);
        int fib2 = fibonacci(n-2);
        int fibn = fib1 + fib2;
        return fibn;

        //return fibonacci(n-1) + fibonacci(n-2);                  //or just write this line
    }
    public static void main(String [] args) {
        System.out.println(fibonacci(5));

        //below is used to print the fibonacci series
        // int N = 10;
        // for(int i=0; i<N; i++) {
        //     System.out.print(fibonacci(i)+" ");
        // }
    }
    
}
