package MethodsFunctions;

public class AverageOfNumbers {

    public static void calAverage(float a, float b, float c){
        float avg = (a + b + c)/3;
        //return avg;
        System.out.println("Average of 3 numbers is: "+avg);
    }
    public static void main(String args[]){
        calAverage(11f, 10f, 11f);
        //System.out.println(calAverage(10, 10, 10));

    }
    
}
