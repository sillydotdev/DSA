package Revision;

public class MaxMinSubArraySum {
    public static void maxMinSubArray(int[] arr) {
        int totalSubArrays = 0;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                sum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k]+" ");
                    sum += arr[k];
                }
                totalSubArrays++;
                System.out.println("---------sum = "+sum);

                if(maxSum < sum) {
                    maxSum = sum;
                }
                if(minSum > sum) {
                    minSum = sum;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subarrays: "+totalSubArrays);
        System.out.println("Max subarrays: "+maxSum);
        System.out.println("Min subarrays: "+minSum);
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 7, 3, 5};
        maxMinSubArray(arr);
    }
}
