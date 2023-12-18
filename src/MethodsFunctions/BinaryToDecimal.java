package MethodsFunctions;/*
 * Binary to decimal
 */

public class BinaryToDecimal {

    //Binary to Decimal conversion
    public static void binToDec(int binNum){
        int myNum = binNum;
        int dec = 0;
        int pow = 0;
        while(binNum > 0){
            int lastDigit = binNum%10;
            dec = dec + (lastDigit * (int)Math.pow(2, pow));
            pow++;
            binNum = binNum/10;
        }
        System.out.println("Decimal number of "+ myNum +" is: "+dec);

    }
    public static void main(String args[]){
        binToDec(1000);

    }
    
}
