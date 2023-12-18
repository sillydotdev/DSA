package Strings;

import java.util.Scanner;

public class StringBasics {

    //printing all letters of a String
    public static void printLetters(String str) {
        for(int i=0; i<str.length(); i++) {
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        char arr[] = {'a', 'b', 'c'};
        String str = "abcd";
        String str1 = new String("xyz");

        System.out.println(str);
        System.out.println(str1);
        System.out.println(arr);

        System.out.println(str.length());
        // System.out.println("Enter the string: ");
        // String name = sc.nextLine();
        // System.out.println(name);

        //concatenation
        String firstName = "Malik";
        String lastName = "Kamran";
        String fullName = firstName+" "+lastName;
        System.out.println(fullName);

        //charAt() method
        System.out.println(fullName.charAt(0));

        printLetters(fullName);
    }
    
}
