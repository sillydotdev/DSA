package Strings;//Baics String methods

import java.util.Scanner;

public class BasicStringFunctions {

    public static void displayCharacters(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }

    public static void main(String args[]){

        //Character array
        char a[] = {'a', 'b', 'c'};

        //Declaring String
        String str = "abcd";
        
        //Declaring String 2nd way
        String str1 = new String("abcd");

        //Printing the above
        System.out.println(a);
        System.out.println(str);
        System.out.println(str1);

        //Taking the string from the user
        Scanner sc =new Scanner(System.in);

        // String firstName = sc.next();
        // System.out.println(firstName);

        // String lastName;
        // lastName = sc.next();
        // System.out.println(lastName);

        // String fullName = sc.nextLine();
        // System.out.println(fullName);

        //length of a string using length() method
        String myName = "Malik Kamran";
        System.out.println(myName.length());

        //concatenation
        String myLastName = "Mushtaq";

        String myFullName = myName+" "+myLastName;

        System.out.println(myFullName);

        String name = myName+myLastName;
        System.out.println(name+" ");

        //charAt() method
        System.out.println(name.charAt(2));

        displayCharacters(myFullName);


    }
    
}
