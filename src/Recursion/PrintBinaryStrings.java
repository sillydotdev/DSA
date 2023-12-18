public class PrintBinaryStrings {

    public static void printBinaryStrings(int n, int lastPlace, String str) {
        if(n == 0) {
            System.out.println(str);
            return;
        }
        //one way
        // if(lastPlace == 0) {
        //     printBinaryStrings(n-1, 0, str+"0");
        //     printBinaryStrings(n-1, 1, str+"1");
        // }
        // else{
        //     printBinaryStrings(n-1, 0, str+"0");
        // }

        /*
         * we can optimize it
         */

         printBinaryStrings(n-1, 0, str+"0");
         if(lastPlace == 0) {
            printBinaryStrings(n-1, 1, str+"1");
         }
    }
    public static void main(String[] args) {
        printBinaryStrings(4, 0, "");
    }
    
}
