public class UpdateBit {

    public static int updateBit(int n, int i, int newBit) {
        int bitMask = ~(1<<i);
        n = n & bitMask;
        int BitMask = newBit<<i;
        return n | BitMask;

    }
    public static void main(String args[]) {
        System.out.println(updateBit(10, 02, 01));

    }
    
}
