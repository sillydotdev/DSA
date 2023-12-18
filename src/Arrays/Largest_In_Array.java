package Arrays;//---------------LARGEST IN ARRAY----------

public class Largest_In_Array {

    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i=0; i<numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest number is: "+smallest);
        return largest;       
    }


    // public static int getSmallest(int numbers[]){
    //     int smallest = Integer.MAX_VALUE;

    //     for(int i=0; i<numbers.length; i++){
    //         if(smallest > numbers[i]){
    //             smallest = numbers[i];
    //         }
    //     }
    //     return smallest;       
    // }


    public static void main(String args[]){
        int numbers[] = {1, 2, 3, 8, 4, 5, 6};
        System.out.println("Largest number is: "+getLargest(numbers));
        //System.out.println("Smallest number is: "+getSmallest(numbers));

    }
    
}
