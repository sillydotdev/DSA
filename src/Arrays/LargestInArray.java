package Arrays;

public class LargestInArray {

    public static int getLargest(int num[]){
        int largest = Integer.MIN_VALUE;

        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<num.length; i++){
            if(largest <= num[i]){
                largest = num[i];
            }
            if(smallest >= num[i]){
                smallest = num[i];
            }
        }
        System.out.println("smallest is: "+smallest);
        return largest;
    }
    public static void main(String args[]){
        int num[] = {1, 3, 4, 6, 5, 8, 2, 10};
        System.out.println(getLargest(num));

    }
    
}
