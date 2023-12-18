package BitManipulation;

/*
 * Convert uppercases to lowercases
 * using Bit Manipulation
 */
public class UppercaseToLowercase {

    public static void main(String args[]){
         for(char ch='A'; ch<='Z'; ch++){
            System.out.print((char) (ch | ' ')+" ");
         }
    }
    
}
