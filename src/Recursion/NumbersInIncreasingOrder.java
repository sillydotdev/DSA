package Recursion;

public class NumbersInIncreasingOrder {

    public static void  printNum(int n) {
        //this is one way to do it
        // if(n == 10) {
        //     System.out.println(n);
        //     return;
        // }

        // System.out.print(n+" ");
        // printNum(n+1);

        //this is the 2nd way to do it
        if(n == 1) {
            System.out.print(n+" ");
            return;
        }
        printNum(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        printNum(10);
        
    }
    
}
