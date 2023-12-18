package Arrays;

/*
 * Updating an array...like adding 1 to each element...
 */

public class Basics_Of_Array {

    public static void update(int marks[]){

        for(int i=0; i<marks.length; i++){
            marks[i] += 1;
        }
    }
    public static void main(String args[]){
        int marks[] = {95, 96, 97};
        update(marks);

        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }

}
