package VariablesDataTypesOperators;

import java.util.*;
public class TotalAmountWithGST {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the cost of pen:");
        float pen = sc.nextFloat();
        System.out.println("Enter the cost of pencil:");
        float pencil = sc.nextFloat();
        System.out.println("Enter te cost of eraser:");
        float eraser = sc.nextFloat();

        float originalAmount = (pen + pencil + eraser);

        System.out.println("Amount without GST = "+originalAmount);
        //gst is 18%
        System.out.println("Now the GST on original amount is:");
        float gst = ((originalAmount*18)/100);
        System.out.println("GST is: "+gst);

        float totalAmount = (originalAmount + gst);

        System.out.println("Final amount with GST = "+totalAmount);




    }
    
}
