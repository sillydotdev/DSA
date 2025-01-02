package Interview;

public class LargestInArray {

    public static int getLargest(int num[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (largest < num[i]) {
                largest = num[i];
            }
        }
        return largest;
    }

    public static void main(String args[]){
        int num[] = {1, 3, 4, 12, 5, 8, 2, 10};
        System.out.println(getLargest(num));
    }
}
