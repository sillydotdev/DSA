package Arrays;

import java.util.Scanner;

public class LinearSearch {

    public static int linearSearch(int numbers[], int key){
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int numbers[] = {1,2,3,4,5,6,7,8,9,10};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find the index of: ");
        int key = sc.nextInt();
        //System.out.println(linearSearch(numbers, key));
        int index = linearSearch(numbers, key);
        if(index == -1){
            System.out.println("Number not found...");
        }
        else{
            System.out.println("Number is at the index: "+index);
        }
    }
    
}
