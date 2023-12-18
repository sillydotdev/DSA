package BitManipulation;

/*
 * Basic Bit Manipulation Operations
 */
public class BasicOperations {

    public static void main(String args[]){

        // Binary AND
        System.out.println((5 & 6));

        // Binary OR
        System.out.println((5 | 6));

        // Binary XOR
        System.out.println((5 ^ 6));

        /*
         * NOT operator or 1's complement
         */
        // 1's complement or NOR operator
        // 5 =              00000101
        // 1's complement = 11111010 ---> a negative number result--->MSB=1
        // 1'S complement = 00000101 
        // 2's complememt =       +1
        // Result =         00000110  -----> 6  ----> -6 because MSB in 1's complement as 1
        System.out.println((~5));

        System.out.println((~0));

        // Left shift   
        System.out.println((5 << 2));

        // Right shift
        System.out.println((6 >> 1));
    }
    
}
