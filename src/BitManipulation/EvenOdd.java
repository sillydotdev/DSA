package BitManipulation;

public class EvenOdd {

    public static void evenOdd(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            System.out.println("Even...");
        }else{
            System.out.println("odd");
        }
    }

    public static void main(String args[]) {
        evenOdd(6);

    }
    
}
