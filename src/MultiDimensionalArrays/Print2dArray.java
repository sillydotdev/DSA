package MultiDimensionalArrays;/*
 * --------Printing 2D array--------------
 */

import java.util.*;
public class Print2dArray {
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

    }
    
}
