/*
 * Polymorphism
 * Method overloading
 */
package OOPS;
public class A152 {
    public static void main(String args[]){
        Calculator cal = new Calculator();
        System.out.println(cal.sum(2, 5));
        System.out.println(cal.sum(2.5f, 5.6f));
        System.out.println(cal.sum(2, 5, 7));
    }
    
}

class Calculator{
    int sum(int a, int b){
        return a + b;
    }

    float sum(float a, float b){
        return a + b;
    }

    int sum(int a, int b, int c){
        return a + b + c;
    }
}
