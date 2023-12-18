package Arrays;//-----------PREFIX SUM--------SUBARRAY----------

public class PrefixSum {

    public static void printSubArray(int numbers[]){
    
        int totalSubArray = 0;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        //int minSum = Integer.MAX_VALUE;

        int prefix[] = new int[numbers.length];
        prefix[0] = numbers[0];

        for(int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + numbers[i];

        }

        for(int i=0; i<numbers.length; i++){
            //int start = i;
            for(int j=i; j<numbers.length; j++){
                //int end = j;
                sum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];
                // for(int k=i; k<=j; k++){
                //     System.out.print(numbers[k]+" ");
                //     //sum of individual subarray
                //     sum += numbers[k];
                    
                // }
                //System.out.println("      -----------Sum is: "+sum);

                //max sum of subarray
                if(maxSum < sum){
                    maxSum = sum;
                }

                //min sum of subarray
                // if(minSum > sum){
                //     minSum = sum;
                // }


                //totalSubArray++;
                //System.out.println();

            }
            //.out.println();
        }
        //System.out.println("Total sub arrays: "+totalSubArray);
        System.out.println("Max Sum of subarray is: "+maxSum);
        //System.out.println("Min Sum of subarray is: "+minSum);


    } 
    public static void main(String args[]){
        int numbers[] = {1, -2, 6, -1, 3};
        printSubArray(numbers);
    }
    
}
