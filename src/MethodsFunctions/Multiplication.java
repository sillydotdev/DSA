package MethodsFunctions;

/*
 * Multiplication
 */
public class Multiplication {
    public static int multiply(int num1, int num2){
        int product = num1 * num2;
        return product;
    }
    public static void main(String args[]){

        int num1 = 5;
        int num2 = 4;
        int prod = multiply(num1, num2);
        System.out.println("Multiplication is: "+prod);
        prod = multiply(10, 3);
        System.out.println("Multiplication is: "+prod);

    }
    
}
