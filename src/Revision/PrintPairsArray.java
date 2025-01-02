package Revision;

public class PrintPairsArray {
    public static void printPairs(int[] arr) {
        int totalPairs = 0;
        for (int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                System.out.print("("+arr[i]+", "+arr[j]+")");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println("Total pairs:"+ totalPairs);
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 5, 3, 1, 7};
        printPairs(arr);
    }
}
