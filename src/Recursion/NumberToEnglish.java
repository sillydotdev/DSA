package Recursion;

public class NumberToEnglish {

    static String digits[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    
    public static void printNumberToEnglish(int number) {
        if(number == 0) {
            return;
        }

        int lastDigit = number % 10;
        printNumberToEnglish(number / 10);
        System.out.print(digits[lastDigit]+" ");
    }
    public static void main(String[] args) {
        printNumberToEnglish(20190);
    }
    
}
