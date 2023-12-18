package MultiDimensionalArrays;//-------------Searching an element in 2D-array or matrix-----------------


import java.util.*;
public class SearchInArray2d {

    public static boolean search(int matrix[][], int key){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == key){
                    System.out.println("Found at index (" +i+","+j+")");
                    return true;
                }

            }
        }
        return false;

    }
    public static void main(String args[]){
        int  matrix[][] = new int[3][3];
        int n = matrix.length;
        int m = matrix[0].length;

        Scanner sc = new Scanner(System.in);

        //Input the elements
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();

            }
        }

        //Printing
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }
        search(matrix, 6);

    }
    
    
}
